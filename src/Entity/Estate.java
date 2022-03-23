package Entity;

public class Estate {
	private int surface ;
	private int localNumber;
	private int floor ;
	private Address address;
	private Type type ;
	
	public Estate() {
		super();
	}
	public Estate(int surface, int localNumber, int floor, Address address, Type type) {
		super();
		this.surface = surface;
		this.localNumber = localNumber;
		this.floor = floor;
		this.address = address;
		this.type = type;
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
	public Type getType() {
		return type;
	}
	public void setType(Type type) {
		this.type = type;
	}
	
	
	
	
	
	
}
