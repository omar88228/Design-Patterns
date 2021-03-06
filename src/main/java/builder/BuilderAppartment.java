package builder;

import entity.Appartment;

public class BuilderAppartment extends BuilderImmobile {
	private int floor;
	
	public BuilderAppartment() {
		super();
	}

	public BuilderImmobile floor (int floor) {
		this.floor=floor;
		return this ;
	}

	@Override
	public Appartment buildAppartment() {
		Appartment appartment = super.buildAppartment();
		appartment.setFloor(floor);
		return appartment;
	}
	
}
