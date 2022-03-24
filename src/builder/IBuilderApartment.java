package builder;


import entity.Address;
import entity.Apartment;

public interface IBuilderApartment {

	IBuilderApartment setSurfaceApartment(int surface);

	IBuilderApartment setLocalNumberApartment(int localNumber);

	IBuilderApartment setFloorApartment(int floor);


	IBuilderApartment setAddressApartment(Address address);


	Apartment buildApartment();
}
