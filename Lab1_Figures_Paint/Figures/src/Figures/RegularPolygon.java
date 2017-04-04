package Figures;

/**
 * @author Вадим
 * @version 1.0
 * @created 02-апр-2017 16:25:08
 */
public class RegularPolygon extends Polygon {

	private int amountOfSides;

	public RegularPolygon(){

	}

	public void finalize() throws Throwable {
		super.finalize();
	}
	public void fillPoints(){

	}

	public int getAmountOfSides(){
		return amountOfSides;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setAmountOfSides(int newVal){
		amountOfSides = newVal;
	}
}//end RegularPolygon