
public class Claustrofobico implements IPasajero{

	@Override
	public boolean quiereSubir(Micro micro) {
		// TODO Auto-generated method stub
		if(micro.getVolumen() > 120) {
			return true;
		}
		return false;
	}
	
	
	//Retomar 1hs 20 min

}
