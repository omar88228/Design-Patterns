package builder;


import entity.Address;
import entity.Garage;

public interface IBuilderGarage {
	IBuilderGarage setSurfaceGarage(int surface);

	IBuilderGarage setLocalNumberGarage(int localNumber);

	IBuilderGarage setFloorGarage(int floor);

	IBuilderGarage setAddressGarage(Address address);
	
	Garage builGarage();
}
