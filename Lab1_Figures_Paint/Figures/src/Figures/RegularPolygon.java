package Figures;
import javafx.geometry.Point2D;

import java.awt.*;

/**
 * @author Вадим
 * @version 1.0
 * @created 02-апр-2017 16:25:08
 */
public class RegularPolygon extends Polygon {

	public RegularPolygon(){

	}

	public void finalize() throws Throwable {
		super.finalize();
	}

	@Override
	public void addPoint(Point2D point) {
		getPoints().add(point);
	}

	public void fillPoints(){

	}
}//end RegularPolygon