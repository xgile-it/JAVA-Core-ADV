package middleWare;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

import College.CourseDetails;
import College.StudentDetails;

// It is just a middleware to simply 

public interface CouseMapperInterface {
    
    Set<StudentDetails> findAllStudents();//to find all student 
    void addNewStudent(StudentDetails student);//add new student
    
    Set<CourseDetails> findAllCourse();//to find all course details
    void addNewCourse(CourseDetails courseDetail);
    
    
    void registerCourseForStudent(StudentDetails studDetails,CourseDetails courseDetails);
    HashMap<StudentDetails, CourseDetails> findAllRegistartion();//find all RegistrationDetails
    
    List<StudentDetails> CourseDetails (int CourseId);//enter CourseId get all student pursuing
    CourseDetails StudentDetails (int studentId);//enter StudentId and get StudentCourseDetails
}

