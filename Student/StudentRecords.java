package Student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import middleWare.StudentInterface;

public class StudentRecords implements StudentInterface{
	
	// We have to contains the information of more than one student hence we can store either in DB or if not we have to store in a storage like array or list
	//ArrayList to maintain record of students e.g. vivek,vishal, multiple students with their property
	public static List<StudentDetail> studentsRecordsList = new ArrayList<>();
	
	
	// this method is to find the list of all the students 
	@Override
	public List<StudentDetail> findAllStudents() {
		return studentsRecordsList;
	}
	@Override
	public void addNewStudent(StudentDetail studentObj) { // addNewStudent(new StudentDetail(int studentId, String firstName, String lastName ,char grade))
		studentsRecordsList.add(studentObj);
		//old
		// vivek
		
		// sani 
		// new 
		// vivek , sani
	}
	
	
	@Override
	public char findGradeForStudent(int id) {
		char stuGrade = 0;  // to search for index intial value is zero
		for(int i=0;i<studentsRecordsList.size();i++) {
			if(studentsRecordsList.get(i).studentId==id) {
				stuGrade = studentsRecordsList.get(i).grade;//O(1) 
				break;
			}
		}
		return stuGrade;
	}
	@Override
	public void printStudentsByGrade() {
		Collections.sort(studentsRecordsList);
		// need comprable interface in student class and override compare method on the basis you want to compare
		
		// 2nd way TreeSet , TreeMap lekin this will sort according id 
		
		System.out.println(studentsRecordsList.toString());
	}
	
	
	@Override
	public List<StudentDetail> deleteStudent(int id) {
		int getIndex =0 ;
		for(int i=0;i<studentsRecordsList.size();i++)
		{
			if(studentsRecordsList.get(i).studentId==id) {
				getIndex= i;  // if i will try to remove in for loop to it can give exception 
				break;
			}
		}
		studentsRecordsList.remove(getIndex);
		return studentsRecordsList;
	}

	
}
