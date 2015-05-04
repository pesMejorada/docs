package es.curso.loquesea;


/**
 * @author teide
 * @version 1.0
 * @created 25-jul-2014 12:48:14
 */
public class Llamada {

	private String nroOrigen;
	private String nroDestino;
	private double tarifa;
	private int duracion;



	public void finalize() throws Throwable {

	}

	public Llamada(){

	}

	public Llamada(){

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
	 * Se asigna la tarifa al atributo tarifa
	 */
	public abstract asignarTarifa();

	/**
	 * mutliplicar tarifa * duracion y retornar
	 */
	public double calcularTotal(){
		return 0;
	}

}