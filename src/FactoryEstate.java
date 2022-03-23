import Entity.Address;
import Entity.Iestate;
import Entity.Villa;

public class FactoryEstate implements IfactoryEstate {
	private static final String VILLA="villa";
	private static final String GARAGE="garage";
	private static final String APARTMENT="apartment";
	public FactoryEstate() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public Iestate getEstate(Singleton singleton) {
		singleton.readFile();
		String [] attributeList = singleton.atributeSplit();
		Address adress = singleton.createAdress();
		if ((attributeList[attributeList.length-1]).equals(VILLA)) {
			return singleton.createVilla(adress);
		}
		if ((attributeList[attributeList.length-1]).equals(GARAGE)) {
			return singleton.createGarage(adress);
		}
		if ((attributeList[attributeList.length-1]).equals(APARTMENT)) {
			return singleton.createGarage(adress);
		}
		
		return null;
	}

}
