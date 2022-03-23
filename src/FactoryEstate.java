import Entity.Address;
import Entity.Apartment;
import Entity.Garage;
import Entity.Iestate;
import Entity.Villa;

public class FactoryEstate implements IfactoryEstate {
	private static final String VILLA = "villa";
	private static final String GARAGE = "garage";
	private static final String APARTMENT = "apartment";
	Singleton singleton = Singleton.getSingletion();
	BuilderEstate builder = new BuilderEstate();

	public FactoryEstate() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public Iestate getEstate(Singleton singleton) {
		singleton.readFile();
		String[] attributeList = singleton.atributeSplit();
		Address adress = createAdress();
		if ((attributeList[attributeList.length - 1]).equals(VILLA)) {
			return createVilla(adress);
		}
		if ((attributeList[attributeList.length - 1]).equals(GARAGE)) {
			return createGarage(adress);
		}
		if ((attributeList[attributeList.length - 1]).equals(APARTMENT)) {
			return createApartment(adress);
		}

		return null;
	}

	public Villa createVilla(Address address) {
		String[] attributes = singleton.atributeSplit();

		return builder.setAddressVilla(address).setFloorApartment(Integer.parseInt(attributes[2]))
				.setLocalNumberVilla(Integer.parseInt(attributes[1])).setSurfaceVilla(Integer.parseInt(attributes[0]))
				.buildVilla();

	}

	public Garage createGarage(Address address) {
		String[] attributes = singleton.atributeSplit();

		return builder.setAddressGarage(address).setFloorGarage(Integer.parseInt(attributes[2]))
				.setLocalNumberGarage(Integer.parseInt(attributes[1])).setSurfaceGarage(Integer.parseInt(attributes[0]))
				.builGarage();

	}

	public Apartment createApartment(Address address) {
		String[] attributes = singleton.atributeSplit();

		return builder.setAddressApartment(address).setFloorApartment(Integer.parseInt(attributes[2]))
				.setLocalNumberApartment(Integer.parseInt(attributes[1]))
				.setSurfaceApartment(Integer.parseInt(attributes[0])).buildApartment();
	}

	public Address createAdress() {
		String[] attributes = singleton.atributeSplit();

		Address address = builder.setStreet(attributes[3]).setCity(attributes[4]).setProvince(attributes[5])
				.setRegion(attributes[6]).setCap(Integer.parseInt(attributes[7])).buildAdress();
		singleton.setCunt((singleton.getCunt()) + 1);

		return address;

	}

}
