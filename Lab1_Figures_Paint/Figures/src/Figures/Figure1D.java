package Figures;
import javafx.geometry.Point2D;
/**
 * @author Вадим
 * @version 1.0
 * @created 02-апр-2017 16:25:07
 */
public abstract class Figure1D extends Figure {

	private Point2D secondPoint;

	public Figure1D(){

	}

	public void finalize() throws Throwable {
		super.finalize();
	}
	public Point2D getSecondPoint(){
		return secondPoint;
	}

	/**
	 * 
	 * @param center
	 * @param secondPoint
	 */
	public void setPoints(Point2D center, Point2D secondPoint){

	}

	/**
	 * 
	 * @param newVal
	 */
	public void setSecondPoint(Point2D newVal){
		secondPoint = newVal;
	}
}//end Figure1D