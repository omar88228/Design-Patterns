package builder;


import entity.Address;
import entity.Apartment;

public class BuilderApartment implements IBuilderApartment {
	private Apartment apartment ;
	public BuilderApartment() {
		apartment= new Apartment();
	}
	@Override
	public IBuilderApartment setSurfaceApartment(int surface) {
		apartment.setSurface(surface);
		return this;
	}

	@Override
	public IBuilderApartment setLocalNumberApartment(int localNumber) {
		apartment.setLocalNumber(localNumber);
		return this;
	}

	@Override
	public IBuilderApartment setFloorApartment(int floor) {
		apartment.setFloor(floor);
		return this;
	}

	@Override
	public IBuilderApartment setAddressApartment(Address address) {
		apartment.setAddress(address);
		return this;
	}

	@Override
	public Apartment buildApartment() {
		// TODO Auto-generated method stub
		return apartment;
	}



	

}
