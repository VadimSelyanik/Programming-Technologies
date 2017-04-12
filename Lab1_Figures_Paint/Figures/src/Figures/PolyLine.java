package Figures;
import javafx.geometry.Point2D;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Вадим
 * @version 1.0
 * @created 04-апр-2017 12:17:23
 */
public class PolyLine extends Figure {

	public List<Segment> m_Segment;

	public PolyLine(){
		m_Segment = new ArrayList<>();
	}

	public void finalize() throws Throwable {
		super.finalize();
	}
	/**
	 *
	 * @param point
	 */
	public void addPoint(Point2D point){
		if (m_Segment.size()==0){
			Segment seg = new Segment();
			seg.addPoint(point);
			seg.addPoint(point);
			m_Segment.add(seg);
		}
		else {
			Segment seg = new Segment();
			seg.addPoint(m_Segment.get(m_Segment.size()-1).getSecondPoint());
			seg.addPoint(point);
			m_Segment.add(seg);
		}
	}

	/**
	 *
	 * @param g
	 */
	public void draw(Graphics g){
		for (Segment s : m_Segment){
			s.draw(g);
		}
	}

	/**
	 *
	 * @param deltaX
	 * @param deltaY
	 */
	public void move(int deltaX, int deltaY){
		for (Segment s : m_Segment){
			s.move(deltaX, deltaY);
		}
	}
}//end PolyLine