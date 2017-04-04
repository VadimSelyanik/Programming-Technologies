package Figures;

import javafx.geometry.Point2D;

import java.awt.*;

/**
 * @author Вадим
 * @version 1.0
 * @created 02-апр-2017 16:25:07
 */
public abstract class Figure {

	private Point2D center;
	private Color lineColor;
	private int numberofPoints;

	public Figure(){

	}

	public void finalize() throws Throwable {

	}
	public void draw(){

	}

	public Point2D getCenter(){
		return center;
	}

	public Color getLineColor(){
		return lineColor;
	}

	public Point2D location(){
		return null;
	}

	public void move(){

	}

	/**
	 * 
	 * @param newVal
	 */
	public void setCenter(Point2D newVal){
		center = newVal;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setLineColor(Color newVal){
		lineColor = newVal;
	}
}//end Figure