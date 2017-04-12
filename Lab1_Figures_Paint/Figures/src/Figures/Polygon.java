package Figures;
import javafx.geometry.Point2D;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

import static jdk.nashorn.internal.runtime.JSType.toPrimitive;

/**
 * @author Вадим
 * @version 1.0
 * @created 02-апр-2017 16:25:08
 */
public abstract class Polygon extends Figure2D {

	private List<Point2D> points;

	public Polygon(){
		points = new ArrayList<>();
	}

	public void finalize() throws Throwable {
		super.finalize();
	}
	/**
	 *
	 * @param g
	 */
	public void draw(Graphics g){
		ArrayList<Integer> xCoord = new ArrayList<>();
		ArrayList<Integer> yCoord = new ArrayList<>();
		for (Point2D point: points){
			xCoord.add((int)point.getX());
			yCoord.add((int)point.getY());
		}
		int[] x = new int [points.size()];
		int[] y = new int [points.size()];
		for (int i = 0; i< points.size(); i++){
			x[i] = xCoord.get(i);
			y[i] = yCoord.get(i);
		}
		g.fillPolygon(x,y,points.size());
	}

	public void fillPoints(){

	}

	public List<Point2D> getPoints(){
		return points;
	}

	/**
	 *
	 * @param deltaX
	 * @param deltaY
	 */
	public void move(int deltaX, int deltaY){
		ArrayList<Point2D> newVal = new ArrayList<>();
		for (Point2D point: points){
			newVal.add(new Point2D(point.getX()+deltaX,point.getY()+deltaY));
		}
		setPoints(newVal);
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setPoints(List<Point2D> newVal){
		points = newVal;
	}
}//end Polygon