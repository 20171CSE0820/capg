package com.cap.OnlineAdmissionSystem.OnlineAdmissionSystem;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.cap.OnlineAdmissionSystem.OnlineAdmissionSystem.Entities.Address;
import com.cap.OnlineAdmissionSystem.OnlineAdmissionSystem.Entities.University;
import com.cap.OnlineAdmissionSystem.OnlineAdmissionSystem.Services.UniversityService;

@SpringBootTest
class testUniversity {
	
	Address address;
	University university;
	
	@Autowired
	UniversityService universityService;

	University university1=new University("Presii",address,null);
	
//	@Test
	void testaddUniversity() {
		Address address=new Address("abc");
		University university=new University("Presi",address,null);
		University university2=new University("GLA",address,null);
		universityService.addUniversity(university);
		universityService.addUniversity(university2);
	}
	
//	@Test
	void testviewAllUniversityDetails()
	{
		ArrayList<University> university=universityService.viewAllUniversityDetails();
		System.out.println(university);
	}
	
//	@Test
	void testgetUniversityById()
	{
		University university=universityService.getUniversityById(1);
		System.out.println(university);
	}
	
//	@Test
	void testupdateUniversity()
	{
		University university=universityService.updateUniversity(university1);
	}
	
//	@Test
	void getUniversityDetailsByCity()
	{
		University university=universityService.updateUniversity(university1);
	}
	
//	@Test
	void deleteUniversity()
	{
		universityService.deleteUniversityById(1);
	}

}
