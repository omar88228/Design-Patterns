package builder;

import entity.*;
import enumeration.Type;

public class BuilderImmobile  {
	private int surface;
	private int localNumber;
	private Address address;
	private Type type;
	
	public BuilderImmobile surface(int surface) {
		this.surface=surface;
		return this;
	}

	public BuilderImmobile localNumber(int localNumber) {
		this.localNumber=localNumber;
		return this;
	}

	public BuilderImmobile address(Address address) {
		this.address=address;
		return this;
	}

	public BuilderImmobile type(String type) {
		this.type=Type.valueOf(type);
		return this;
	}

	public Villa buildVilla() {
		return new Villa( surface, localNumber, address, type);
	}

	public Garage buildGarage() {
		return new Garage(surface, localNumber, address, type);
	}

	public Appartment buildAppartment() {
		return new Appartment(surface, localNumber, address, type);
	}

}
