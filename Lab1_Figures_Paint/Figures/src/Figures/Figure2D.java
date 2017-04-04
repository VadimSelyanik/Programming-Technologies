package Figures;

import java.awt.*;

/**
 * @author Вадим
 * @version 1.0
 * @created 02-апр-2017 16:25:07
 */
public abstract class Figure2D extends Figure {

	private Color bgColor;

	public Figure2D(){

	}

	public void finalize() throws Throwable {
		super.finalize();
	}
	public Color getBgColor(){
		return bgColor;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setBgColor(Color newVal){
		bgColor = newVal;
	}
}//end Figure2D