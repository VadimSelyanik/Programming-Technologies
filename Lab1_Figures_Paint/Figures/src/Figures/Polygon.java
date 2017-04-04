package Figures;

import javafx.geometry.Point2D;

import java.util.List;

/**
 * @author Вадим
 * @version 1.0
 * @created 02-апр-2017 16:25:08
 */
public abstract class Polygon extends Figure2D {

	private List<Point2D> points;

	public Polygon(){

	}

	public void finalize() throws Throwable {
		super.finalize();
	}
	public void draw(){

	}

	public void fillPoints(){

	}

	public List<Point2D> getPoints(){
		return points;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setPoints(List<Point2D> newVal){
		points = newVal;
	}
}//end Polygon