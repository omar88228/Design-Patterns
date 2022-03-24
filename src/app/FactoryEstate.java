package app;

import builder.BuilderAddress;
import builder.BuilderApartment;
import builder.BuilderGarage;
import builder.BuilderVilla;
import entity.*;

public class FactoryEstate implements IFactoryEstate {
	private static final String VILLA = "villa";
	private static final String GARAGE = "garage";
	private static final String APARTMENT = "apartment";

	BuilderVilla builderVilla = new BuilderVilla();
	BuilderAddress builderAddress = new BuilderAddress();
	BuilderApartment builderApartment = new BuilderApartment();
	BuilderGarage builderGarage = new BuilderGarage();

	public FactoryEstate() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public IEstate getEstate(String type, String[] attributes) {

		Address adress = createAdress(attributes);
		if ((type).equals(VILLA)) {
			return createVilla(adress, attributes);
		}
		if ((type).equals(GARAGE)) {
			return createGarage(adress, attributes);
		}
		if ((type).equals(APARTMENT)) {
			return createApartment(adress, attributes);
		}

		return null;
	}

	public Villa createVilla(Address address, String[] attributes) {

		return builderVilla.setAddressVilla(address).setFloorVilla(Integer.parseInt(attributes[2]))
				.setLocalNumberVilla(Integer.parseInt(attributes[1])).setSurfaceVilla(Integer.parseInt(attributes[0]))
				.buildVilla();

	}

	public Garage createGarage(Address address, String[] attributes) {

		return builderGarage.setAddressGarage(address).setFloorGarage(Integer.parseInt(attributes[2]))
				.setLocalNumberGarage(Integer.parseInt(attributes[1])).setSurfaceGarage(Integer.parseInt(attributes[0]))
				.builGarage();

	}

	public Apartment createApartment(Address address, String[] attributes) {

		return builderApartment.setAddressApartment(address).setFloorApartment(Integer.parseInt(attributes[2]))
				.setLocalNumberApartment(Integer.parseInt(attributes[1]))
				.setSurfaceApartment(Integer.parseInt(attributes[0])).buildApartment();
	}

	public Address createAdress(String[] attributes) {

		Address address = builderAddress.setStreet(attributes[3]).setCity(attributes[4]).setProvince(attributes[5])
				.setRegion(attributes[6]).setCap(Integer.parseInt(attributes[7])).buildAdress();

		return address;

	}

}