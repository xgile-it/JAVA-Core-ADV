package com.xgileit.learning.student.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

//@Entity annotation indicates that the class is a persistent Java class.
//@Table annotation provides the table that maps this entity.
//@Id annotation is for the primary key.
//@GeneratedValue annotation is used to define generation strategy for the primary key. GenerationType.AUTO means Auto Increment field.
//@Column annotation is used to define the column in database that maps annotated field.

@Entity
@Table(name="student")
public class Student {

	@Id
	@GeneratedValue
	@Column(name="sid")
	private int studentId;
	
	@Column(name="sname")
	private String studentName;
	
	@Column(name="sphone")
	private String studentPhoneNo;
	
	@Column(name="scity")
	private String studentCity;

	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentPhoneNo() {
		return studentPhoneNo;
	}
	public void setStudentPhoneNo(String studentPhoneNo) {
		this.studentPhoneNo = studentPhoneNo;
	}
	public String getStudentCity() {
		return studentCity;
	}
	public void setStudentCity(String studentCity) {
		this.studentCity = studentCity;
	}
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentPhoneNo=" + studentPhoneNo
				+ ", studentCity=" + studentCity + "]";
	}
	public static boolean isPresent() {
		return false;
	}
}
