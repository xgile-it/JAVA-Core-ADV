package College;

import java.io.Serializable;

/**
 * @author  This class describe property of a student .
 */
public class StudentDetails implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 3149592294839718634L;
	
	int studentId; // this should be unique
	String firstName;
	String lastName;
	int age;
	int mobileNum; // this should be unique
	String email; // this should be unique
	char grade;

	// Constructor to create object
	public StudentDetails(int studentId, String firstName, String lastName, int age, int mobileNum, String email,
			char grade) {
		super();
		this.studentId = studentId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.mobileNum = mobileNum;
		this.email = email;
		this.grade = grade;

	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getMobileNum() {
		return mobileNum;
	}

	public void setMobileNum(int mobileNum) {
		this.mobileNum = mobileNum;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public char getGrade() {
		return grade;
	}

	public void setGrade(char grade) {
		this.grade = grade;
	}

	@Override
	public int hashCode() {
		return studentId;
	}

	@Override
	public boolean equals(Object obj) {
		StudentDetails studentDetails = (StudentDetails) obj;
		return (studentId == studentDetails.studentId);
	}

	@Override
	public String toString() {
		return "StudentDetails [studentId=" + studentId + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", age=" + age + ", mobileNum=" + mobileNum + ", email=" + email + ", grade=" + grade + "]";
	}

}
