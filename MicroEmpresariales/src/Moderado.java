
public class Moderado implements IPasajero{
	
	private int lugaresLibres;
	

	@Override
	public boolean quiereSubir(Micro micro) {
		// TODO Auto-generated method stub
		if((micro.capacidad() - micro.cantidadPasajeros()) >= this.getLugaresLibres()) {
			return true;
		}
		return false;
	}


	public int getLugaresLibres() {
		return lugaresLibres;
	}


	public void setLugaresLibres(int lugaresLibres) {
		this.lugaresLibres = lugaresLibres;
	}
	

}
