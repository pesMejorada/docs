

/**
 * @author teide
 * @version 1.0
 * @created 25-jul-2014 12:13:46
 */
public class Factura {

	private Date fecha;
	public Item m_Item;

	public Factura(){

	}

	public void finalize() throws Throwable {

	}

	public Date getFecha(){
		return fecha;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setFecha(Date newVal){
		fecha = newVal;
	}

}