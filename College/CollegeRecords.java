package College;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

import middleWare.CouseMapperInterface;

public class CollegeRecords implements CouseMapperInterface {

	// set for student
	Set<StudentDetails> studentList = new HashSet<>();
	// set for course
	Set<CourseDetails> courselist = new HashSet<>();
	// Map to configure student with course
	HashMap<StudentDetails, CourseDetails> studentCourseMap = new HashMap<StudentDetails, CourseDetails>();

	@Override
	public Set<StudentDetails> findAllStudents() {
		return studentList;
	}

	@Override
	public void addNewStudent(StudentDetails studentObj) {
		studentList.add(studentObj);
	}

	@Override
	public Set<College.CourseDetails> findAllCourse() {
		return courselist;
	}

	@Override
	public void addNewCourse(CourseDetails courseDetail) {
		courselist.add(courseDetail);
	}
	
	@Override
	public void registerCourseForStudent(StudentDetails studDetails, CourseDetails courseDetails) {
		studentCourseMap.put(studDetails,courseDetails);
	}

	@Override
	public HashMap<StudentDetails, CourseDetails> findAllRegistartion() {
		return studentCourseMap;
	}

	@Override
	public List<StudentDetails> CourseDetails(int CourseId) {
		List<StudentDetails> studentList = new ArrayList<StudentDetails>();
		for(Entry<StudentDetails, CourseDetails> studMap : studentCourseMap.entrySet()) {
				if(studMap.getValue().courseId == CourseId) {
					studentList.add(studMap.getKey());
				}
		}
		return studentList;
	}

	@Override
	public CourseDetails StudentDetails(int studentId) {
		CourseDetails couseDetails = null;
		for(Entry<StudentDetails, CourseDetails> studMap : studentCourseMap.entrySet()) {
			if(studMap.getKey().studentId == studentId) {
				couseDetails = new CourseDetails(studMap.getValue().getCourseId(), studMap.getValue().getCourseName(), studMap.getValue().getCourseDuration(),studMap.getValue().getSubjectsName());
			}
	}
		return couseDetails;
	}
	
}
