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


    private int numberOfPoints = 0;
    /////////////////////////////////////////////////////////////////////////////////////


    public MainFrame() {

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Figures");
        //Toolkit tool = Toolkit.getDefaultToolkit();
        //Dimension screenSize = tool.getScreenSize();
        //this.setSize(screenSize.width, screenSize.height);
        this.setResizable(false);
        this.setLocationRelativeTo(null);

        JLabel statusLabel = new JLabel();
        statusLabel.setPreferredSize(new Dimension(this.getWidth(), 15));
        this.getContentPane().add(statusLabel, BorderLayout.SOUTH);


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
        JMenuItem drawDiamondItem = new JMenuItem("Diamond");
        drawDiamondItem.setFont(font);
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
        polygonMenu.add(drawDiamondItem);
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
        });
        bgColorItem.addActionListener(e -> {
            bgColor = JColorChooser.showDialog(this, "Background color", bgColor);
        });

        drawSegmentItem.addActionListener(e -> {

        });

        drawRayItem.addActionListener(e -> {

        });

        drawLineItem.addActionListener(e -> {

        });

        drawPolyLineItem.addActionListener(e -> {

        });

        drawRectItem.addActionListener(e -> {

        });

        drawSquareItem.addActionListener(e -> {

        });

        this.setVisible(true);
    }

}