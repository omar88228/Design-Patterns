package Entity;

public class Garage extends Estate {
	private final Type type= Type.APARTMENT;

	public Garage() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Garage(int surface, int localNumber, int floor, Address address) {
		super(surface, localNumber, floor, address);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Garage [type=" + type + ", toString()=" + super.toString() + "]";
	}
	@Override
	public String estateType() {
		// TODO Auto-generated method stub
		return toString();
	}

}