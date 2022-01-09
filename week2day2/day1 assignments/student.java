package student;

import department.department;


public class student extends department{
	public void studentname() {
		System.out.println("student name = Logan");
	}
	public void studentdept() {
		System.out.println("student dept = computer science");
	}
	public void studentid() {
		System.out.println("student id = 789456");
	}

	public static void main(String[] args) {
		student stu = new student();
		stu.collegename();
		stu.collegecode();
		stu.collegerank();
		stu.departmentname();
		stu.studentname();
		stu.studentdept();
		stu.studentid();
		

	}

}
