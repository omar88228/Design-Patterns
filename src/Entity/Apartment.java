package Entity;

public class Apartment extends Estate {
	private final Type type= Type.APARTMENT;
	public Apartment() {
		super();
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
