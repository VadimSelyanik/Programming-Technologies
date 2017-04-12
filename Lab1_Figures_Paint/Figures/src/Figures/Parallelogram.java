package Figures;
import javafx.geometry.Point2D;
/**
 * @author Вадим
 * @version 1.0
 * @created 05-апр-2017 13:39:06
 */
public class Parallelogram extends SymmetricPolygon {

	private Point2D thirdPoint;

	public Parallelogram(){
		setNumberOfPoints(3);
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
		else if (getSecondPoint()==null){
			setSecondPoint(point);
		}else {
			setThirdPoint(point);
			fillPoints();
		}
	}

	public void fillPoints(){
		Point2D centerPoint = new Point2D((getCenter().getX()+getThirdPoint().getX())/2,
				(getCenter().getY()+getThirdPoint().getY())/2);
		double deltaX = (centerPoint.getX()-getSecondPoint().getX());
		double deltaY = (centerPoint.getY()-getSecondPoint().getY());

		getPoints().add(getCenter());
		getPoints().add(getSecondPoint());
		getPoints().add(getThirdPoint());
		getPoints().add(new Point2D(centerPoint.getX()+deltaX,centerPoint.getY()+deltaY));
	}

	public Point2D getThirdPoint(){
		return thirdPoint;
	}

	/**
	 *
	 * @param newVal
	 */
	public void setThirdPoint(Point2D newVal){
		thirdPoint = newVal;
	}
}//end Parallelogram