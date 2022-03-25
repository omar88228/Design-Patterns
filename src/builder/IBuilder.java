package Builder;

import entity.Address;

import entity.Immobile;

public interface IBuilder {
	
	IBuilder Surface(int surface);

	IBuilder LocalNumber(int localNumber);

	IBuilder Floor(int floor);


   IBuilder Address(Address address);

	IBuilder type(String type);
	
	Immobile build();
	
}
