

/**
 * @author teide
 * @version 1.0
 * @created 25-jul-2014 12:13:46
 */
public class Item {

	private int cantidad;
	public Producto m_Producto;

	public Item(){

	}

	public void finalize() throws Throwable {

	}

	public int getCantidad(){
		return cantidad;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setCantidad(int newVal){
		cantidad = newVal;
	}

}