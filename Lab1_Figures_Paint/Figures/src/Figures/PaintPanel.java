package Figures;
import javafx.geometry.Point2D;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.util.ArrayList;
import java.util.Vector;

/**
 * Created by Вадим on 24.11.2015.
 */
public class PaintPanel extends JPanel {
    int prevX, prevY;
    static Color lineColor = Color.BLACK;
    static Color backgroundColor = Color.BLACK;
    int clicksNumber;
    static Graphics previousGraphics;
    static Figure figure = new Segment();
    Figure lastFigure;
    ArrayList<Figure> figures;

    public static Figure getFigure() {
        return figure;
    }

    public static void setFigure(Figure figure) {
        PaintPanel.figure = figure;
    }

    public static Color getBackgroundColor() {
        return backgroundColor;
    }

    public static void setBackgroundColor(Color backgroundColor) {
        PaintPanel.backgroundColor = backgroundColor;
    }

    public static Color getLineColor() {
        return lineColor;
    }

    public static void setLineColor(Color lineColor) {
        PaintPanel.lineColor = lineColor;
    }




    PaintPanel() {
        previousGraphics = getGraphics();
        figures = new ArrayList<>();
        addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                super.mousePressed(e);
                setPreviousCoordinates(e.getX(), e.getY());

            }

            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                Graphics g = getGraphics();
                g.setColor(lineColor);
                System.out.println("Mouse listener : clicked");
                if (clicksNumber == 1){
                    System.out.println("if statement true " + clicksNumber);
                    figure.addPoint(new Point2D(e.getX(), e.getY()));
                    figure.setLineColor(lineColor);
                    figure.draw(g);

                    if (lastFigure!=null)
                        figures.add(lastFigure);
                    lastFigure = figure;
                    try {
                        clicksNumber = figure.getNumberOfPoints();
                        figure = figure.getClass().newInstance();
                        figure.setNumberOfPoints(clicksNumber);
                    } catch (InstantiationException e1) {
                        e1.printStackTrace();
                    } catch (IllegalAccessException e1) {
                        e1.printStackTrace();
                    }
                }
                else{
                    System.out.println("if statement else "+ clicksNumber);
                    figure.addPoint(new Point2D(e.getX(), e.getY()));
                    clicksNumber--;
                }
            }
        });
        addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseDragged(MouseEvent e) {
                super.mouseDragged(e);
                if (lastFigure!=null) {
                    System.out.println("mousemotionlistener "+clicksNumber);
                    Graphics g = getGraphics();
                    g.clearRect(0, 0, getWidth(), getHeight());
                    for (Figure f : figures) {
                        g.setColor(f.getLineColor());
                        f.draw(g);
                    }
                    lastFigure.move(e.getX() - prevX, e.getY() - prevY);
                    g.setColor(lastFigure.getLineColor());
                    lastFigure.draw(g);
                    setPreviousCoordinates(e.getX(), e.getY());
                    //clicksNumber = lastFigure.getNumberOfPoints();
                }
            }
        });
    }

    public void setPreviousCoordinates(int aPrevX, int aPrevY) {
        prevX = aPrevX;
        prevY = aPrevY;
    }

//    @Override
//    public void paintComponent(Graphics g) {
//        super.paintComponents(g);
//        for (int i = 0; i < picture.size() - 1; i++) {
//            g.setColor(picture.get(i + 1).getColor());
//            if (!picture.get(i).isLast())
//                g.drawLine(picture.get(i).getPoint().x, picture.get(i).getPoint().y,
//                        picture.get(i + 1).getPoint().x, picture.get(i + 1).getPoint().y);
//        }
//    }

//    public static void setColor(Color color) {
//        PaintPanel.color = color;
//    }
//
//    public Vector<PointEx> getPicture() {
//        return picture;
//    }
}