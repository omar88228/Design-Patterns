package Entity;

public class Address {
	private String Street ;
	private String city ;
	private String province ;
	private String region ;
	private int cap ;
	
	
	
	public Address() {
		
	}
	public Address(String street, String city, String province, String region, int cap) {
		
		Street = street;
		this.city = city;
		this.province = province;
		this.region = region;
		this.cap = cap;
	}
	public String getStreet() {
		return Street;
	}
	public void setStreet(String street) {
		Street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getProvince() {
		return province;
	}
	public void setProvince(String province) {
		this.province = province;
	}
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	public int getCap() {
		return cap;
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
