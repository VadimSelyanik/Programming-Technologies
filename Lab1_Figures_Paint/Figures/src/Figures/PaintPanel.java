package Figures;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.util.Vector;

/**
 * Created by Вадим on 24.11.2015.
 */
public class PaintPanel extends JPanel {
    int prevX, prevY;
    static Color lineColor = Color.BLACK;
    static Figure figure = new Segment();


    PaintPanel() {
        addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                super.mousePressed(e);
                setPreviousCoordinates(e.getX(), e.getY());
                if (!picture.isEmpty()) picture.lastElement().setIsLast(true);
                setPicture(new PointEx(color, new Point(e.getX(), e.getY())));
            }
        });
        addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseDragged(MouseEvent e) {
                super.mouseDragged(e);
                Graphics g = getGraphics();
                g.setColor(color);
                g.drawLine(prevX, prevY, e.getX(), e.getY());
                setPreviousCoordinates(e.getX(), e.getY());
                setPicture(new PointEx(color, new Point(e.getX(), e.getY())));
            }
        });
    }

    public void setPreviousCoordinates(int aPrevX, int aPrevY) {
        prevX = aPrevX;
        prevY = aPrevY;
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponents(g);
        for (int i = 0; i < picture.size() - 1; i++) {
            g.setColor(picture.get(i + 1).getColor());
            if (!picture.get(i).isLast())
                g.drawLine(picture.get(i).getPoint().x, picture.get(i).getPoint().y,
                        picture.get(i + 1).getPoint().x, picture.get(i + 1).getPoint().y);
        }
    }

    public static void setColor(Color color) {
        PaintPanel.color = color;
    }

    public Vector<PointEx> getPicture() {
        return picture;
    }
}