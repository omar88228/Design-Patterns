package Entity;

public class Villa extends Estate {
	private final Type type= Type.VILLA;
	
	public Villa() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Type getType() {
		return type;
	}

	@Override
	public String toString() {
		return "Villa";
	}

	@Override
	public String estateType() {
		// TODO Auto-generated method stub
		return toString();
	}
	
}
