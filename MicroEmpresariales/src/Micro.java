import java.util.ArrayList;
import java.util.List;



public class Micro {

	private int pasajerosParados;
	private int pasajerosSentados;
	private int volumen;
	
	private List<IPasajero> pasajeros = new ArrayList<IPasajero>();
	
	
	public int getPasajerosParados() {
		return pasajerosParados;
	}
	public void setPasajerosParados(int pasajerosParados) {
		this.pasajerosParados = pasajerosParados;
	}
	public int getPasajerosSentados() {
		return pasajerosSentados;
	}
	public void setPasajerosSentados(int pasajerosSentados) {
		this.pasajerosSentados = pasajerosSentados;
	}
	public int getVolumen() {
		return volumen;
	}
	public void setVolumen(int volumen) {
		this.volumen = volumen;
	}
	
	
	
	public Micro(int pasajerosParados, int pasajerosSentados, int volumen) {
		
		this.setPasajerosParados(pasajerosParados);
		this.setPasajerosSentados(pasajerosSentados);
		this.setVolumen(volumen);
		
	}
	
	public Boolean puedoSubir(IPasajero pasajero) {
		
		return this.hayLugar() && pasajero.quiereSubir(this);
		
	}
	
	private Boolean hayLugar() {
		
		return this.capacidad() > cantidadPasajeros();
		
	}
	
	public int cantidadPasajeros() {
		
		return pasajeros.size();
	}
	
	public int capacidad() {
		
		return this.getPasajerosParados() + this.getPasajerosSentados();
	}
	
	
	public Boolean puedeViajarSentado() {
		return cantidadPasajeros() < getPasajerosSentados();
	}
	
	public void subirA(IPasajero pasajero) {
		if(puedoSubir(pasajero)) {
		pasajeros.add(pasajero);
		System.out.println("Se subio un pasajero " + pasajero.getClass());
		}else {
			System.out.println("No pudo subir pasajero " + pasajero.getClass() );
		}
			
	}
	
	public void bajarA(IPasajero pasajero) {
		if(puedoSubir(pasajero)) {
		pasajeros.remove(pasajero);
		System.out.println("Se bajo un pasajero " + pasajero.getClass());
		}
	}
	
}
