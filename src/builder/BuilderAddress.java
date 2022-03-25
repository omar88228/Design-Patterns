package Builder;


import entity.Address;

public class BuilderAddress implements IBuilderAddress {
	
	Address address;

	public BuilderAddress() {
		address=new Address();
	}
	
	@Override
	public IBuilderAddress Street(String street) {
		address.setStreet(street);
		return this;
	}

	@Override
	public IBuilderAddress City(String city) {
		address.setCity(city);
		return this;
	}

	@Override
	public IBuilderAddress Province(String province) {
		address.setProvince(province);
		return this;
	}

	@Override
	public IBuilderAddress Region(String region) {
		address.setRegion(region);
		return this;
	}

	@Override
	public IBuilderAddress Cap(int cap) {
		address.setCap(cap);
		return this;
	}

	@Override
	public Address build() {
		// TODO Auto-generated method stub
		return address;
	}

}
