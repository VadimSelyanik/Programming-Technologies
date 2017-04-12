package Figures;
import javafx.geometry.Point2D;

import java.awt.*;

/**
 * @author Вадим
 * @version 1.0
 * @created 02-апр-2017 16:25:09
 */
public class Square extends SymmetricPolygon {

	public Square(){
		setNumberOfPoints(2);
	}

	public void finalize() throws Throwable {
		super.finalize();
	}

	public void fillPoints(){
		Point2D centerPoint = new Point2D((getCenter().getX()+getSecondPoint().getX())/2,
				(getCenter().getY()+getSecondPoint().getY())/2);
		double deltaX = (getCenter().getX()-getSecondPoint().getX());
		double deltaY = (getCenter().getY()-getSecondPoint().getY());

		getPoints().add(getCenter());
		getPoints().add(new Point2D((centerPoint.getX()+deltaY/2),centerPoint.getY()-deltaX/2));
		getPoints().add(getSecondPoint());
		getPoints().add(new Point2D(centerPoint.getX()-deltaY/2,centerPoint.getY()+deltaX/2));

	}
}//end Square