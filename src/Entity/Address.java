package Entity;

public class Address {
	private String Street ;
	private String city ;
	private String province ;
	private String region ;
	private int cap ;
	
	
	
	public Address() {
		
	}
	

	public void setStreet(String street) {
		Street = street;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public void setProvince(String province) {
		this.province = province;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	public void setCap(int cap) {
		this.cap = cap;
	}
	@Override
	public String toString() {
		return "Address [Street=" + Street + ", city=" + city + ", province=" + province + ", region=" + region
				+ ", cap=" + cap + "]";
	}
	
	
}
