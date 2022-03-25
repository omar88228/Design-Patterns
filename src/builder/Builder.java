package Builder;

import entity.Address;
import entity.IEstate;
import entity.Immobile;
import enumeration.Type;

public class Builder  implements IBuilder {
	Immobile immobile ;
	public Builder()  {
		immobile = new Immobile();
	}
	
	@Override
	public IBuilder Surface(int surface) {
		immobile.setSurface(surface);
		return this;
	}
	@Override
	public IBuilder LocalNumber(int localNumber) {
		immobile.setLocalNumber(localNumber);
		return this;
	}
	@Override
	public IBuilder Floor(int floor) {
		immobile.setFloor(floor);
		return this;
	}
	@Override
	public IBuilder Address(Address address) {
		immobile.setAddress(address);
		return this;
	}
	@Override
	public IBuilder type(String type) {
		immobile.setType(Type.valueOf(type));
		return this;
	}
	@Override
	public Immobile build() {
		
		return immobile;
	}



}
