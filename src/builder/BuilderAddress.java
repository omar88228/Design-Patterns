package builder;


import entity.Address;

public class BuilderAddress implements IBuilderAddress {
	
	Address address;

	public BuilderAddress() {
		address=new Address();
	}
	
	@Override
	public IBuilderAddress setStreet(String street) {
		address.setStreet(street);
		return this;
	}

	@Override
	public IBuilderAddress setCity(String city) {
		address.setCity(city);
		return this;
	}

	@Override
	public IBuilderAddress setProvince(String province) {
		address.setProvince(province);
		return this;
	}

	@Override
	public IBuilderAddress setRegion(String region) {
		address.setRegion(region);
		return this;
	}

	@Override
	public IBuilderAddress setCap(int cap) {
		address.setCap(cap);
		return this;
	}

	@Override
	public Address buildAdress() {
		// TODO Auto-generated method stub
		return address;
	}

}
