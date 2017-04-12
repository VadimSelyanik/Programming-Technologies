package Figures;
import javafx.geometry.Point2D;

import java.awt.*;


/**
 * @author Вадим
 * @version 1.0
 * @created 02-апр-2017 16:25:06
 */
public class Ellipse extends Figure2D {

	private Point2D secondPoint;

	public Ellipse(){
		setNumberOfPoints(2);
	}

	public void finalize() throws Throwable {
		super.finalize();
	}
	/**
	 *
	 * @param point
	 */
	public void addPoint(Point2D point){
		if (getCenter()==null)
			setCenter(point);
		else setSecondPoint(point);
	}

	/**
	 *
	 * @param g
	 */
	public void draw(Graphics g){
		g.fillOval((int)(2*getCenter().getX()-getSecondPoint().getX()),(int)(2*getCenter().getY()-getSecondPoint().getY()),
				(int)(-2*(getCenter().getX()-getSecondPoint().getX())),(int)(-2*(getCenter().getY()-getSecondPoint().getY())));
	}

	public Point2D getSecondPoint(){
		return secondPoint;
	}

	/**
	 *
	 * @param deltaX
	 * @param deltaY
	 */
	public void move(int deltaX, int deltaY){
		setCenter(new Point2D(getCenter().getX()+deltaX,getCenter().getY()+deltaY));
		setSecondPoint(new Point2D(getSecondPoint().getX()+deltaX,getSecondPoint().getY()+deltaY));
	}

	/**
	 *
	 * @param newVal
	 */
	public void setSecondPoint(Point2D newVal){
		secondPoint = newVal;
	}
}//end Ellipse