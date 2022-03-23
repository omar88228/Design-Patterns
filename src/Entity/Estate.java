package Entity;

public class Estate implements Iestate {
	private int surface ;
	private int localNumber;
	private int floor ;
	private Address address;
	
	
	public Estate() {
		
	}
	public Estate(int surface, int localNumber, int floor, Address address) {
		super();
		this.surface = surface;
		this.localNumber = localNumber;
		this.floor = floor;
		this.address = address;
		
	}
	
	public int getSurface() {
		return surface;
	}
	public void setSurface(int surface) {
		this.surface = surface;
	}
	public int getLocalNumber() {
		return localNumber;
	}
	public void setLocalNumber(int localNumber) {
		this.localNumber = localNumber;
	}
	public int getFloor() {
		return floor;
	}
	public void setFloor(int floor) {
		this.floor = floor;
	}
	public Address getAddress() {
		return address;
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
