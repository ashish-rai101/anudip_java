package com.jdbc.ajp.project.student_mgmt.daoimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.jdbc.ajp.project.student_mgmt.dao.StudentDAO;
import com.jdbc.ajp.project.student_mgmt.entity.Student;
import com.jdbc.ajp.project.student_mgmt.util.ConnectionProvider;

public class StudentDAOImpl implements StudentDAO {

private Connection con;
	
	
	public StudentDAOImpl() {
		super();
		try {
			con=ConnectionProvider.getConnection();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Override
	public void createStudent(Student s) {
		try {
		PreparedStatement pstmt=con.prepareStatement("insert into student values(?,?,?,?,?,?)");
		pstmt.setInt(1,s.getId());
		pstmt.setString(2,s.getName());
		pstmt.setInt(3,s.getAge());
		pstmt.setString(4,s.getContact());
		pstmt.setString(5,s.getCourse());
		pstmt.setString(6,s.getEmail());
		pstmt.executeUpdate();
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
	}
	
	
	@Override
	public Student displayStudent(int id) {
		// TODO Auto-generated method stub
		try {
			PreparedStatement pstmt=con.prepareStatement("select * from student where id=?");
			pstmt.setInt(1, id);
			ResultSet rs= pstmt.executeQuery();
			rs.next();
			Student s=new Student();
			s.setId(rs.getInt("id"));
			s.setName(rs.getString("sname"));
			s.setAge(rs.getInt("age"));
			s.setContact(rs.getString("contact"));
			s.setCourse(rs.getString("course"));
			s.setEmail(rs.getString("email"));
			return s;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}

	@Override
	public void displayAllStudents() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateStudent(Student s) {
		// TODO Auto-generated method stub
		try {
			PreparedStatement pstmt=con.prepareStatement("update  student set sname=?,age=?,course=?,email=?,contact=? where id=?");
			pstmt.setString(1,s.getName());
			pstmt.setInt(2,s.getAge());
			pstmt.setInt(2,s.getAge());
			pstmt.setString(3,s.getCourse());
			pstmt.setString(4,s.getEmail());
			pstmt.setString(5,s.getContact());
			pstmt.setInt(6,s.getId());
			pstmt.executeUpdate();
			System.out.println("successfully updated");
			} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void deleteStudent(int id) {
		// TODO Auto-generated method stub
		try {
			PreparedStatement pstmt=con.prepareStatement("delete from student where id=?");
			pstmt.setInt(1, id);
			pstmt.executeUpdate();
			System.out.println("successfully deleted");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

}
