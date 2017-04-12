package Figures;
import javafx.geometry.Point2D;

import java.awt.*;


public abstract class Figure1D extends Figure {

	private Point2D secondPoint;

	public Figure1D(){
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
	public void draw(Graphics g) {
		System.out.println("draw figure1d");
		Point2D firstPoint = getRealPoint1();
		Point2D secondPoint = getRealPoint2();

		g.drawLine((int) firstPoint.getX(), (int) firstPoint.getY(), (int) secondPoint.getX(), (int) secondPoint.getY());
	}

	public Point2D getSecondPoint(){
		return secondPoint;
	}

	abstract public Point2D getRealPoint1();

	abstract public Point2D getRealPoint2();

	/**
	 *
	 * @param newVal
	 */
	public void setSecondPoint(Point2D newVal){
		secondPoint = newVal;
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
}//end Figure1D