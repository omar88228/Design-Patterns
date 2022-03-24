package builder;


import entity.Address;

public interface IBuilderAddress {
	
	IBuilderAddress setStreet(String street);

	IBuilderAddress setCity(String city);

	IBuilderAddress setProvince(String province);

	IBuilderAddress setRegion(String region);

	IBuilderAddress setCap(int cap);

	Address buildAdress();
}