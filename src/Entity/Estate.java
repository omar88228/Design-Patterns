package Entity;

public class Estate implements Iestate {
	private int surface ;
	private int localNumber;
	private int floor ;
	private Address address;
	
	
	public Estate() {
		
	}

	


	public void setSurface(int surface) {
		this.surface = surface;
	}
	public void setLocalNumber(int localNumber) {
		this.localNumber = localNumber;
	}
	public void setFloor(int floor) {
		this.floor = floor;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Estate [surface=" + surface + ", localNumber=" + localNumber + ", floor=" + floor + ", address="
				+ address +  "]";
	}
	@Override
	public String estateType() {
		// TODO Auto-generated method stub
		return toString();
	}
	
	
	
	
	
	
}
