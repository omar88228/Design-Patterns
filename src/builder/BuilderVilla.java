package builder;


import entity.Address;
import entity.Villa;

public class BuilderVilla implements IBuilderVilla {
	
	private Villa villa;
	public BuilderVilla() {
		villa = new Villa();
		
	}
	@Override
	public IBuilderVilla setSurfaceVilla(int surface) {
		villa.setSurface(surface);
		return this;
	}

	@Override
	public IBuilderVilla setLocalNumberVilla(int localNumber) {
		villa.setLocalNumber(localNumber);
		return this;
	}

	@Override
	public IBuilderVilla setFloorVilla(int floor) {
		villa.setFloor(floor);
		return this;
	}

	@Override
	public IBuilderVilla setAddressVilla(Address address) {
		villa.setAddress(address);
		return this;
	}
	@Override
	public Villa buildVilla() {
		return villa;
	}
}
