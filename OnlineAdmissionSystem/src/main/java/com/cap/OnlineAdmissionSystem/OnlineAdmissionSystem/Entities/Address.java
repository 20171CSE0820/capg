package com.cap.OnlineAdmissionSystem.OnlineAdmissionSystem.Entities;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Address {
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int addressId;
//    private String district;
    private String city;
//    private String state;
//    private String country;
//	private int zipcode;
//    private String landmark;
    
    public Address()
    {}

	public Address(String city) {
		super();
		//this.addressId = addressId;
//		this.district = district;
		this.city = city;
//		this.state = state;
//		this.country = country;
//		this.zipcode = zipcode;
//		this.landmark = landmark;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getAddressId() {
		return addressId;
	}

	public void setUniversityId(int universityId) {
		this.addressId = universityId;
	}

	@Override
	public String toString() {
		return "Address [addressId=" + addressId + ", city=" + city + "]";
		
	}

//	public String getDistrict() {
//		return district;
//	}
//
//	public void setDistrict(String district) {
//		this.district = district;
//	}
//
//	public String getState() {
//		return state;
//	}
//
//	public void setState(String state) {
//		this.state = state;
//	}
//
//	public String getCountry() {
//		return country;
//	}
//
//	public void setCountry(String country) {
//		this.country = country;
//	}
//
//	public long getZipcode() {
//		return zipcode;
//	}
//
//	public void setZipcode(int zipcode) {
//		this.zipcode = zipcode;
//	}
//
//	public String getLandmark() {
//		return landmark;
//	}
//
//	public void setLandmark(String landmark) {
//		this.landmark = landmark;
//	}

//	@Override
//	public String toString() {
//		return "Address [addressId=" + addressId + ", district=" + district + ", city=" + city + ", state=" + state
//				+ ", country=" + country + ", zipcode=" + zipcode + ", landmark=" + landmark + "]";
//	}

	
	
	
}

