package com.xgileit.learning.student.controller;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.xgileit.learning.student.Entity.Student;
import com.xgileit.learning.student.Repostiory.StudentRepository;

//– @CrossOrigin is for configuring allowed origins.
//– @RestController annotation is used to define a controller and to indicate that the return value of the methods should be be bound to the web response body.
//– @RequestMapping("/api") declares that all Apis’ url in the controller will start with /api.
//– @Autowired to inject StudentRepository bean to local variable.

@RestController
@RequestMapping(value = "/api/v1")
public class StudentController {

	@Autowired
	StudentRepository studentRepo;

	@GetMapping(value="/getStudentRecords")
	public ResponseEntity<List<Student>> getAllStudentRecords(){
		List<Student> studentList = new ArrayList<>();
		try {
			studentList= studentRepo.findAll();
		}catch(Exception e) {
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<>(studentList, HttpStatus.OK);
	}
	@GetMapping(value="/getStudentInfoById/{id}")
	public ResponseEntity<Student> getStudentInfoById(@PathVariable("id") int id){
		Optional<Student> studentInfo = studentRepo.findById(id);
		if(studentInfo.isPresent())
			return new ResponseEntity<>(studentInfo.get(), HttpStatus.OK);
		else
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	}
	@PostMapping(value="/createStudent")
	  public ResponseEntity<Student> createStudent(@RequestBody Student student) {
	    try {
	    	Student Student_student = studentRepo
	          .save(student);
	      return new ResponseEntity<>(Student_student, HttpStatus.CREATED);
	    } catch (Exception e) {
	      return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
	    }
	  }
	 @PutMapping("/updateStudent/{id}")
	  public ResponseEntity<Student> updateStudent(@PathVariable("id") int id, @RequestBody Student student) {
	    Optional<Student> studentData = studentRepo.findById(id);

	    if (studentData.isPresent()) {
	       student.setStudentName(student.getStudentName());
	       student.setStudentPhoneNo(student.getStudentPhoneNo());
	       student.setStudentCity(student.getStudentCity());
	      return new ResponseEntity<>(studentRepo.save(student), HttpStatus.OK);
	    } else {
	      return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	    }
	  }
	  @DeleteMapping("/student/{id}")
	  public ResponseEntity<HttpStatus> deleteTutorial(@PathVariable("id") int id) {
	    try {
	    	studentRepo.deleteById(id);
	      return new ResponseEntity<>(HttpStatus.OK);
	    } catch (Exception e) {
	      return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
	    }
	  }

	  @DeleteMapping("/deleteStudentList")
	  public ResponseEntity<HttpStatus> deleteAllStudent() {
	    try {
	    	studentRepo.deleteAll();
	      return new ResponseEntity<>(HttpStatus.OK);
	    } catch (Exception e) {
	      return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
	    }

	  }
}