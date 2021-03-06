package builder;

import entity.Villa;

public class BuilderVilla extends BuilderImmobile {

	private int numberOfSwimmingpools;
	private String gateType;

	public BuilderVilla() {
		super();
	}

	public BuilderImmobile numberOfSwimmingpools(int numberOfSwimmingpools) {
		this.numberOfSwimmingpools = numberOfSwimmingpools;
		return this;
	}

	public BuilderVilla gateType(String gateType) {
		this.gateType = gateType;
		return this;
	}

	@Override
	public Villa buildVilla() {
		Villa villa = super.buildVilla();
		villa.setNumberOfSwimmingpools(numberOfSwimmingpools);
		villa.setGateType(gateType);
		return villa;
	}

}
