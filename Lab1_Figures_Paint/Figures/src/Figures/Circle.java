package Figures;
import javafx.geometry.Point2D;

/**
 * @author Вадим
 * @version 1.0
 * @created 02-апр-2017 16:25:06
 */
public class Circle extends Ellipse {

	public Circle(){

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
		else {
			double deltaX = point.getX()-getCenter().getX();
			double deltaY = point.getY()-getCenter().getY();
			double radius = Math.sqrt(deltaX*deltaX+deltaY*deltaY);
			setSecondPoint(new Point2D(getCenter().getX()+radius,getCenter().getY()+radius));
		}
	}
}//end Circle