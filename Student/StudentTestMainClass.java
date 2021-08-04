package Student;

public class StudentTestMainClass {
	
	public static void main(String args[]) {
		StudentRecords stuRecordsObj = new StudentRecords();
		//student
		stuRecordsObj.addNewStudent(new StudentDetail(1,"Vivek","singh",'A'));
		stuRecordsObj.addNewStudent(new StudentDetail(2,"Vishal","singh",'B'));
		stuRecordsObj.addNewStudent(new StudentDetail(3,"Sani","singh",'C'));
		stuRecordsObj.addNewStudent(new StudentDetail(5,"Ravindra","singh",'B'));
		stuRecordsObj.addNewStudent(new StudentDetail(6,"Virat","singh",'B'));
		stuRecordsObj.addNewStudent(new StudentDetail(7,"Rohit","singh",'A'));
		stuRecordsObj.addNewStudent(new StudentDetail(8,"Hardik","singh",'B'));
		stuRecordsObj.addNewStudent(new StudentDetail(9,"Bhumrah","singh",'C'));
		System.out.println( stuRecordsObj.findAllStudents());
		System.out.print("Grade for asked id: ");
		System.out.println(stuRecordsObj.findGradeForStudent(7));
		stuRecordsObj.printStudentsByGrade();
		stuRecordsObj.deleteStudent(5);
		System.out.println( stuRecordsObj.findAllStudents());
	}
}
