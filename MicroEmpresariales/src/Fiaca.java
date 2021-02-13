
public class Fiaca implements IPasajero{

	@Override
	public boolean quiereSubir(Micro micro) {
		// TODO Auto-generated method stub
		if(micro.puedeViajarSentado()){
			return true;
		}
		return false;
	}

}
