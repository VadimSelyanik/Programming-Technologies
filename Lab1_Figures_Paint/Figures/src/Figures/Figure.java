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
	private int numberOfPoints;

	public Figure(){

	}

	public void finalize() throws Throwable {

	}
	public void draw(Graphics g){

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

	/**
	 *
	 * @param deltaX
	 * @param deltaY
	 */
	abstract public void move(int deltaX, int deltaY);

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

	/**
	 * 
	 * @param point
	 */
	abstract public void addPoint(Point2D point);

	public int getNumberOfPoints(){
		return numberOfPoints;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setNumberOfPoints(int newVal){
		numberOfPoints = newVal;
	}
}//end Figure