package Figures;
import javafx.geometry.Point2D;



/**
 * @author Вадим
 * @version 1.0
 * @created 02-апр-2017 16:25:09
 */
public abstract class SymmetricPolygon extends Polygon {
	private Point2D secondPoint;


	public SymmetricPolygon(){
	}

	public void finalize() throws Throwable {
		super.finalize();
	}
	public void fillPoints(){

	}

	/**
	 * 
	 * @param point
	 */
	public void addPoint(Point2D point){
		if (getCenter()==null)
			setCenter(point);
		else {
			setSecondPoint(point);
			fillPoints();
		}
	}

	public Point2D getSecondPoint(){
		return secondPoint;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setSecondPoint(Point2D newVal){
		secondPoint = newVal;
	}
}//end SymmetricPolygon