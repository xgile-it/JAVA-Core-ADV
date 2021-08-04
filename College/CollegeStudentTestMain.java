package College;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class CollegeStudentTestMain {

	public static void main(String[] args) throws Exception {
		
	FileWriter fileWriter = new FileWriter("D:\\Project\\JAVA\\CollegeStudentTestMain.txt");
	BufferedWriter bufferWriter= new BufferedWriter(fileWriter);
	CollegeRecords collegeRecords = new CollegeRecords();
	
	StudentDetails s1= new StudentDetails(1,"Shivam","singh", 24, 976546312, "shivamsingh33@gmail.com", 'C');
	collegeRecords.addNewStudent(s1);
	StudentDetails s2= new StudentDetails(2,"Vishal","singh", 23, 976511112, "vishalsingh@gmail.com", 'B');
	collegeRecords.addNewStudent(s2);
	StudentDetails s3= new StudentDetails(3,"Aditya","singh", 22, 976511112, "adityasingh@gmail.com", 'A');
	collegeRecords.addNewStudent(s3);
	StudentDetails s4= new StudentDetails(4,"Abhijeet","singh", 23, 976511112, "abhisingh@gmail.com", 'C');
	collegeRecords.addNewStudent(s4);
	StudentDetails s5= new StudentDetails(5,"Tushar","singh", 24, 976511112, "tusharsingh@gmail.com", 'A');
	collegeRecords.addNewStudent(s5);
	
	CourseDetails c1 = new CourseDetails(001,"Bachelor of Technology:ECE:" ,4, new ArrayList(Arrays.asList("Microwaves & Radar,Wave Propogation,Digital Circuits.")));
	collegeRecords.addNewCourse(c1);
	CourseDetails c2 = new CourseDetails(002,"Bachelor of Technology:CCE:" ,4, new ArrayList(Arrays.asList("Data Structures,Computer Networks,Object Oriented Prog,.")));
	collegeRecords.addNewCourse(c2);
	CourseDetails c3 = new CourseDetails(003,"Bachelor of Technology:ME:" ,4, new ArrayList(Arrays.asList("Fluid Mechanics,Soloid Thermodynamics,Mechanics of Solids")));
	collegeRecords.addNewCourse(c3);
	CourseDetails c4 = new CourseDetails(004,"Bachelor in Science:" ,3, new ArrayList(Arrays.asList("Mathematics, Statistics , Computer Science")));
	collegeRecords.addNewCourse(c4);
	CourseDetails c5 = new CourseDetails(005,"Bachelor in Science:" ,3, new ArrayList(Arrays.asList("PHY,MATH,CHEMISTRY,BIOLOGY")));
	collegeRecords.addNewCourse(c5);
	
	collegeRecords.registerCourseForStudent(s1,c2);
	collegeRecords.registerCourseForStudent(s2,c1);
	collegeRecords.registerCourseForStudent(s3,c4);
	collegeRecords.registerCourseForStudent(s4,c5);
	collegeRecords.registerCourseForStudent(s5,c2);
	
	//set type so to print and return it we use iterator
	    bufferWriter.write("To print all Student Details:" +"\n");
	Iterator  it = collegeRecords.findAllStudents().iterator(); 
	while(it.hasNext()) {
		bufferWriter.write(it.next().toString());
		bufferWriter.newLine();
	}
	//set type so to print and return it we use iterator
	    bufferWriter.write("\n"+"To print all Course Details:" +"\n");
	Iterator  it1 = collegeRecords.findAllCourse().iterator(); 
	while(it1.hasNext()) {
		bufferWriter.write(it1.next().toString());
		bufferWriter.newLine();
	}
	//map type so to print and return it we just use bw.write method with toString
	    bufferWriter.write("\n"+"To print all Registartion Details:" +"\n");
	    bufferWriter.write(collegeRecords.findAllRegistartion().toString());
    //list type so to print and return it we use iterator	
	    bufferWriter.write("\n"+"To print id 001 Course Details:" +"\n");
	Iterator<?> it3 = collegeRecords.CourseDetails(001).iterator(); 
	while(it3.hasNext()) {
		bufferWriter.write(it3.next().toString());
		bufferWriter.newLine();
	}
	    bufferWriter.write("\n"+"To print id 005 Course Details:" +"\n");
	Iterator<?> it4 = collegeRecords.CourseDetails(002).iterator(); 
	while(it4.hasNext()) {
		bufferWriter.write(it4.next().toString());
		bufferWriter.newLine();
	}
	//integer type so to print and return it we just use bw.write method with toString
	    bufferWriter.write("\n"+"To print id 1 & 3 Student Details:" +"\n");
	    bufferWriter.write( collegeRecords.StudentDetails(1).toString());
	    bufferWriter.write(collegeRecords.StudentDetails(3).toString());
        bufferWriter.flush();
	    bufferWriter.close();
    }	
}
