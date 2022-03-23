package Entity;

public class Villa extends Estate {
	private final Type type= Type.VILLA;
	
	public Villa() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Villa(int surface, int localNumber, int floor, Address address) {
		super(surface, localNumber, floor, address);
		
	}

	public Type getType() {
		return type;
	}

	@Override
	public String toString() {
		return "Villa [type=" + type + ", toString()=" + super.toString() + "]";
	}

	@Override
	public String estateType() {
		// TODO Auto-generated method stub
		return toString();
	}
	
}
