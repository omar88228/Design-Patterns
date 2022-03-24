package builder;


import entity.Address;
import entity.Garage;

public class BuilderGarage implements IBuilderGarage {
	private Garage garage ;
	public BuilderGarage() {
		garage= new Garage();
	}
	@Override
	public IBuilderGarage setSurfaceGarage(int surface) {
		garage.setSurface(surface);
		return this;
	}

	@Override
	public IBuilderGarage setLocalNumberGarage(int localNumber) {
		garage.setLocalNumber(localNumber);
		return this;
	}

	@Override
	public IBuilderGarage setFloorGarage(int floor) {
		garage.setFloor(floor);
		return this;
	}

	@Override
	public IBuilderGarage setAddressGarage(Address address) {
		garage.setAddress(address);
		return this;
	}
	@Override
	public Garage builGarage() {
		// TODO Auto-generated method stub
		return garage;
	}
}
