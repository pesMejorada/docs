

/**
 * @author teide
 * @version 1.0
 * @created 25-jul-2014 16:40:40
 */
public class Llamada {

	private String nroOrigen;
	private String nroDestino;
	private double tarifa;
	private int duracion;

	public Llamada(){

	}

	public void finalize() throws Throwable {

	}

	public String getNroOrigen(){
		return nroOrigen;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setNroOrigen(String newVal){
		nroOrigen = newVal;
	}

	public double getTarifa(){
		return tarifa;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setTarifa(double newVal){
		tarifa = newVal;
	}

	public String getNroDestino(){
		return nroDestino;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setNroDestino(String newVal){
		nroDestino = newVal;
	}

	public int getDuracion(){
		return duracion;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setDuracion(int newVal){
		duracion = newVal;
	}

	/**
	 * 
	 * @param tarifa
	 */
	public calcularTotal(double tarifa){

	}

	public abstract asignarTarifa();

}