package Figures;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.geom.Line2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MainFrame extends JFrame {
    private Color lineColor = Color.black;
    private Color bgColor = Color.white;
    private PaintPanel paintPanel;


    private int numberOfPoints = 0;
    /////////////////////////////////////////////////////////////////////////////////////


    public MainFrame() {

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Figures");
        this.setLayout(new BorderLayout());

        this.setResizable(false);
        this.setSize(1000, 550);
        this.setLocationRelativeTo(null);
        paintPanel = new PaintPanel();


        JMenuBar menuBar = new JMenuBar();
        Font font = new Font("Verdana", Font.PLAIN, 11);
        JMenu colorMenu = new JMenu("Color");
        colorMenu.setFont(font);
        JMenu lineMenu = new JMenu("Line");
        lineMenu.setFont(font);
        JMenu polygonMenu = new JMenu("Polygon");
        polygonMenu.setFont(font);
        JMenu circleMenu = new JMenu("Circle");
        circleMenu.setFont(font);

        JMenuItem lineColorItem = new JMenuItem("Line color");
        lineColorItem.setFont(font);
        JMenuItem bgColorItem = new JMenuItem("Background color");
        bgColorItem.setFont(font);
        JMenuItem drawLineItem = new JMenuItem("Line");
        drawLineItem.setFont(font);
        JMenuItem drawRayItem = new JMenuItem("Ray");
        drawRayItem.setFont(font);
        JMenuItem drawSegmentItem = new JMenuItem("Segment");
        drawSegmentItem.setFont(font);
        JMenuItem drawPolyLineItem = new JMenuItem("Polyline");
        drawPolyLineItem.setFont(font);
        JMenuItem drawRectItem = new JMenuItem("Rectangle");
        drawRectItem.setFont(font);
        JMenuItem drawSquareItem = new JMenuItem("Square");
        drawSquareItem.setFont(font);
        JMenuItem drawParallelogramItem = new JMenuItem("Parallelogram");
        drawParallelogramItem.setFont(font);
        JMenuItem drawRegularPolygonItem = new JMenuItem("Regular polygon");
        drawRegularPolygonItem.setFont(font);
        JMenuItem drawCircleItem = new JMenuItem("Circle");
        drawCircleItem.setFont(font);
        JMenuItem drawEllipseItem = new JMenuItem("Ellipse");
        drawEllipseItem.setFont(font);


        colorMenu.add(lineColorItem);
        colorMenu.add(bgColorItem);
        lineMenu.add(drawLineItem);
        lineMenu.add(drawRayItem);
        lineMenu.add(drawSegmentItem);
        lineMenu.add(drawPolyLineItem);
        polygonMenu.add(drawRectItem);
        polygonMenu.add(drawSquareItem);
        polygonMenu.add(drawParallelogramItem);
        polygonMenu.add(drawRegularPolygonItem);
        circleMenu.add(drawCircleItem);
        circleMenu.add(drawEllipseItem);

        menuBar.add(colorMenu);
        menuBar.add(lineMenu);
        menuBar.add(polygonMenu);
        menuBar.add(circleMenu);
        this.getContentPane().add(menuBar, BorderLayout.NORTH);

        lineColorItem.addActionListener(e -> {
            lineColor = JColorChooser.showDialog(this, "Line color", lineColor);
            paintPanel.setLineColor(lineColor);
        });
        bgColorItem.addActionListener(e -> {
            bgColor = JColorChooser.showDialog(this, "Background color", bgColor);
            paintPanel.setBackgroundColor(bgColor);
            paintPanel.setLineColor(bgColor);
        });

        drawSegmentItem.addActionListener(e -> {
            Figure segment = new Segment();
            paintPanel.setFigure(segment);
            paintPanel.clicksNumber = segment.getNumberOfPoints();
        });

        drawRayItem.addActionListener(e -> {
            Figure ray = new Ray();
            paintPanel.setFigure(ray);
            paintPanel.clicksNumber = ray.getNumberOfPoints();
        });

        drawLineItem.addActionListener(e -> {
            Figure line = new Line();
            paintPanel.setFigure(line);
            paintPanel.clicksNumber = line.getNumberOfPoints();
        });

        drawPolyLineItem.addActionListener(e -> {
            int ans;
            try {
                ans = Integer.parseInt((String) JOptionPane.showInputDialog(this, "Please, enter the number of points", "Number of points",
                        JOptionPane.PLAIN_MESSAGE, null, null, 3));
                if (ans<3) ans = 3;
            }catch (Exception ex){
                ans = 3;
            }
            PolyLine polyLine = new PolyLine();
            polyLine.setNumberOfPoints(ans);
            paintPanel.setFigure(polyLine);
            paintPanel.clicksNumber = ans;
        });

        drawRectItem.addActionListener(e -> {
            Figure rect = new Orthogon();
            paintPanel.setFigure(rect);
            paintPanel.clicksNumber=rect.getNumberOfPoints();
        });

        drawSquareItem.addActionListener(e -> {
            Figure square = new Square();
            paintPanel.setFigure(square);
            paintPanel.clicksNumber=square.getNumberOfPoints();
        });

        drawParallelogramItem.addActionListener(e ->{
            Figure parallelogram = new Parallelogram();
            paintPanel.setFigure(parallelogram);
            paintPanel.clicksNumber = parallelogram.getNumberOfPoints();
        });

        drawEllipseItem.addActionListener(e -> {
            Figure ellipse = new Ellipse();
            paintPanel.setFigure(ellipse);
            paintPanel.clicksNumber = ellipse.getNumberOfPoints();
        });

        drawCircleItem.addActionListener(e -> {
            Figure circle = new Circle();
            paintPanel.setFigure(circle);
            paintPanel.clicksNumber = circle.getNumberOfPoints();
        });

        drawRegularPolygonItem.addActionListener(e -> {
            int ans;
            try {
                ans = Integer.parseInt((String) JOptionPane.showInputDialog(this, "Please, enter the number of sides", "Number of sides",
                        JOptionPane.PLAIN_MESSAGE, null, null, 3));
                if (ans<3) ans = 3;
            }catch (Exception ex){
                ans = 3;
            }
            RegularPolygon polygon = new RegularPolygon();
            polygon.setNumberOfPoints(ans);
            paintPanel.setFigure(polygon);
            paintPanel.clicksNumber = ans;
        });

        this.add(paintPanel, BorderLayout.CENTER);
        this.setVisible(true);
    }

}