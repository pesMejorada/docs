

/**
 * @author teide
 * @version 1.0
 * @created 25-jul-2014 12:13:46
 */
public class Producto {

	private String nombre;

	public Producto(){

	}

	public void finalize() throws Throwable {

	}

	public String getNombre(){
		return nombre;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setNombre(String newVal){
		nombre = newVal;
	}

}