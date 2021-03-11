package services;

import java.util.ArrayList;

import com.cap.OnlineAdmissionSystem.OnlineAdmissionSystem.Entities.University;

public interface IUniversityServices 
{
	public University addUniversity(University university);
	
	public ArrayList<University> viewAllUniversityDetails();
	
	public ArrayList<University> getUniversityDetailsByCity(String city);
	
//	public ArrayList<University> getUniversityDetailsBycollegeName(String collegeName);
	
	public void deleteUniversityById(int UniversityId);
	
	public University getUniversityById(int applicationId);
	
	public University updateUniversity(University university);

}
