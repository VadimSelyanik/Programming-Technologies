package Figures;
import javafx.geometry.Point2D;

import java.awt.*;

/**
 * @author Вадим
 * @version 1.0
 * @created 02-апр-2017 16:25:08
 */
public class Segment extends Figure1D {

	public Segment(){

	}

	public void finalize() throws Throwable {
		super.finalize();
	}

	@Override
	public Point2D getRealPoint1() {
		return getCenter();
	}

	@Override
	public Point2D getRealPoint2() {
		return getSecondPoint();
	}
	/**
	 * 
	 * @param center
	 * @param secondPoint
	 */

}//end Segment