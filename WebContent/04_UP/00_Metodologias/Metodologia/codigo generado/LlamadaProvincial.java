package es.curso.loquesea;


/**
 * @author teide
 * @version 1.0
 * @created 25-jul-2014 12:48:14
 */
public class LlamadaProvincial extends Llamada {

	private int franja;

	public LlamadaProvincial(){

	}

	public void finalize() throws Throwable {
		super.finalize();
	}

	public int getFranja(){
		return franja;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setFranja(int newVal){
		franja = newVal;
	}

	/**
	 * Se asigna la tarifa al atributo tarifa
	 */
	public asignarTarifa(){

	}

}