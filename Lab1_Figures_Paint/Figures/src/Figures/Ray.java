package Figures;
import javafx.geometry.Point2D;

import java.awt.*;

/**
 * @author Вадим
 * @version 1.0
 * @created 02-апр-2017 16:25:08
 */
public class Ray extends Segment {

	public Ray(){

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
		setCenter(center);
		setSecondPoint(new Point2D((secondPoint.getX()-center.getX())*1000+center.getX(),
				(secondPoint.getY()-center.getY())*1000+center.getY()));
	}


	public Point2D getRealPoint1() {
		return getCenter();
	}


	public Point2D getRealPoint2() {
		return new Point2D((getSecondPoint().getX()-getCenter().getX())*1000+getCenter().getX(),
				(getSecondPoint().getY()-getCenter().getY())*1000+getCenter().getY());
	}
}//end Ray