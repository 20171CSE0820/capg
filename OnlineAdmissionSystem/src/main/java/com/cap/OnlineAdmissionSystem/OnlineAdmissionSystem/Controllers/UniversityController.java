package com.cap.OnlineAdmissionSystem.OnlineAdmissionSystem.Controllers;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.cap.OnlineAdmissionSystem.OnlineAdmissionSystem.Entities.University;
import com.cap.OnlineAdmissionSystem.OnlineAdmissionSystem.Services.UniversityService;

@RestController
public class UniversityController {
	
	@Autowired
	UniversityService universityService;
	
	@PostMapping("/addUniversity")
	@ResponseStatus(code = HttpStatus.CREATED)
	public University addUniversity(@RequestBody University u) {
		return universityService.addUniversity(u);
	}
	
	@PutMapping("/updateUniversity")
	@ResponseStatus(code = HttpStatus.OK)
	@Transactional
	public University updateUniversity(@RequestBody University u) {
		return universityService.updateUniversity(u);
	}
	
	@DeleteMapping("/deleteUniversity/{Id}")
	@ResponseStatus(code = HttpStatus.OK)
	public void deleteUniversity(@PathVariable("id") int id) {
		universityService.deleteUniversityById(id);
	}
	
	@GetMapping("/viewAllUniversity")
	@ResponseStatus(code = HttpStatus.OK)
	public List<University> viewAllUniversityDetails() {
		return universityService.viewAllUniversityDetails();
	}
	
	@GetMapping("/viewIDUniversity/{Id}")
	@ResponseStatus(code = HttpStatus.OK)
	public University getUniversityById(@PathVariable("Id") int Id) {
		return universityService.getUniversityById(Id);
	}

	@GetMapping("/viewCityUniversity/{city}")
	@ResponseStatus(code = HttpStatus.OK)
	public ArrayList<University> getUniversityByCity(@PathVariable("city") String city) {
		return universityService.getUniversityDetailsByCity(city);
	}
	
//	@GetMapping("/viewCityUniversity/{collegeName}")
//	@ResponseStatus(code = HttpStatus.OK)
//	public ArrayList<University> getUniversityByCollege(@PathVariable("collegeName")String collegeName) {
//		return universityService. getUniversityDetailsBycollegeName(collegeName);
}
