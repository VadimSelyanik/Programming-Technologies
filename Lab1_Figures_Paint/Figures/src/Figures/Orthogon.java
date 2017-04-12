package Figures;
import javafx.geometry.Point2D;

import java.awt.*;

/**
 * @author Вадим
 * @version 1.0
 * @created 02-апр-2017 16:25:07
 */
public class Orthogon extends SymmetricPolygon {

	public Orthogon(){
		setNumberOfPoints(2);
	}

	public void finalize() throws Throwable {
		super.finalize();
	}

	public void fillPoints(){
		getPoints().add(getCenter());
		getPoints().add(new Point2D(getSecondPoint().getX(),getCenter().getY()));
		getPoints().add(getSecondPoint());
		getPoints().add(new Point2D(getCenter().getX(), getSecondPoint().getY()));
	}
}//end Orthogon