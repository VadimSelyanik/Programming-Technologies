package Figures;

import java.awt.geom.Point2D;

/**
 * @author Вадим
 * @version 1.0
 * @created 02-апр-2017 16:25:06
 */
public class Ellipse extends Figure2D {

	private Point2D firstPoint;
	private Point2D secondPoint;

	public Ellipse(){

	}

	public void finalize() throws Throwable {
		super.finalize();
	}
	public void draw(){

	}

	public Point2D getFirstPoint(){
		return firstPoint;
	}

	public Point2D getSecondPoint(){
		return secondPoint;
	}

	public void move(){

	}

	/**
	 * 
	 * @param newVal
	 */
	public void setFirstPoint(Point2D newVal){
		firstPoint = newVal;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setSecondPoint(Point2D newVal){
		secondPoint = newVal;
	}
}//end Ellipse