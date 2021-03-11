package com.cap.OnlineAdmissionSystem.OnlineAdmissionSystem.Entities;

import java.util.ArrayList;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class University 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int Universityid;
	String name;
	ArrayList collegelist=new ArrayList();
	
	@OneToOne(cascade = CascadeType.PERSIST)
	@JoinColumn(name="addressId")
	Address address;
	
//	@OneToOne(cascade = CascadeType.PERSIST)
//	College college;
	
	
	public University() {}
	
	public University(String name, Address address, ArrayList collegelist) {
		super();
//		Universityid = universityid;
		this.name = name;
		this.address = address;
		this.collegelist = collegelist;
	}

	public int getUniversityid() {
		return Universityid;
	}

	public void setUniversityid(int universityid) {
		Universityid = universityid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getaddress() {
		return address;
	}

	public void setaddress(Address address) {
		this.address = address;
	}

	public ArrayList getCollegelist() {
		return collegelist;
	}

	public void setCollegelist(ArrayList collegelist) {
		this.collegelist = collegelist;
	}

	@Override
	public String toString() {
		return "University [Universityid=" + Universityid + ", name=" + name + ", address=" + address + ", collegelist="
				+ collegelist + "]";
	}
		

}
