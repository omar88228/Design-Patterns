package builder;


import entity.Address;
import entity.Villa;

public interface IBuilderVilla {

	IBuilderVilla setSurfaceVilla(int surface);

	IBuilderVilla setLocalNumberVilla(int localNumber);

	IBuilderVilla setFloorVilla(int floor);

	IBuilderVilla setAddressVilla(Address address);
	
	Villa buildVilla();
}
