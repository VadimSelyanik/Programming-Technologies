package Figures;
import javafx.geometry.Point2D;



/**
 * @author Вадим
 * @version 1.0
 * @created 02-апр-2017 16:25:07
 */
public class Line extends Ray {

	public Line(){

	}

	public void finalize() throws Throwable {
		super.finalize();
	}
	/**
	 * 
	 * @param center
	 * @param secondPoint
	 */
	public void setPoints(Point2D center, Point2D secondPoint){
		super.setPoints(center, secondPoint);
		setCenter(new Point2D((secondPoint.getX() - center.getX()) * (-1000) + secondPoint.getX(),
				(secondPoint.getY() - center.getY()) * (-1000) + secondPoint.getY()));
	}


	public Point2D getRealPoint1() {
		return new Point2D((getSecondPoint().getX() - getCenter().getX()) * (-1000) + getSecondPoint().getX(),
				(getSecondPoint().getY() - getCenter().getY()) * (-1000) + getCenter().getY());
	}


	public Point2D getRealPoint2() {
		return  super.getRealPoint2();
	}
}//end Line