package com.jdbc.ajp.project.student_mgmt.dao;

import com.jdbc.ajp.project.student_mgmt.entity.Student;

public interface StudentDAO {
	void createStudent(Student s);
	Student displayStudent(int id);
	void displayAllStudents();
	void updateStudent(Student s);
	void deleteStudent(int id);
}
