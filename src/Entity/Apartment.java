package Entity;

public class Apartment extends Estate {
	private final Type type= Type.APARTMENT;
	public Apartment() {
		// TODO Auto-generated constructor stub
	}

	public Apartment(int surface, int localNumber, int floor, Address address) {
		super(surface, localNumber, floor, address);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Apartment [type=" + type + ", toString()=" + super.toString() + "]";
	}
	
	@Override
	public String estateType() {
		// TODO Auto-generated method stub
		return toString();
	}
	

}
