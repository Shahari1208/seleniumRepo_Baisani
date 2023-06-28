package org.student;

import org.department.Department;

public class Student extends Department{

	public void studentName()
	{
		System.out.println("student Name");
	}
	public void studentDept()
	{
		System.out.println("student Department");
	}
	
	public void studentId()
	{
		System.out.println("student ID");
	}
	public static void main(String[] args) {
		
		Student stud = new Student();
		
		stud.collegeCode();
		stud.collegeName();
		stud.collegeRank();
		stud.deptName();
		stud.studentDept();
		stud.studentId();
		stud.studentName();
	}
	
}
