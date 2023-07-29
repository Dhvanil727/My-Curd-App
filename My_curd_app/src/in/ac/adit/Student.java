package in.ac.adit;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Student {
	Connection connection=null;
	Statement statement=null;
	private static final String URL="jdbc:mysql://localhost:3306/studentmgt";
	private static final String USERNAME="root";
	private static final String PASSWORD="";
	public Student() {
		try {
			connection=DriverManager.getConnection(URL, USERNAME, PASSWORD);
			statement=connection.createStatement();
			System.out.println("Successful connection");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	boolean createStudent(String username,String first_name,String last_name,String email) {
		String query="insert into student_info values('"+username+"','"+first_name+"','"+last_name+"','"+email+"');";
		try {
			statement.execute(query);
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
	boolean updateStudent(String username,String first_name) {
		String query="update student_info set first_name='"+first_name+"' where username='"+username+"';";
		try {
			statement.execute(query);
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		
		}
		return false;
	
	}
	boolean deleteStudent(String username,String email) {
		String query="delete from student_info where username='"+username+"';";
		try {
			statement.execute(query);
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
	 void getAllStudents() {
		try {
		String query="select * from student_info;";
		ResultSet resultset=statement.executeQuery(query);
		while(resultset.next()) {
			System.out.println("Username:"+resultset.getString(1));
			System.out.println("First_name:"+resultset.getString(2));
			System.out.println("Last_name:"+resultset.getString(3));
			System.out.println("email:"+resultset.getString(4));
			
		}
	}catch(SQLException e) {
		e.printStackTrace();
	}
}
	}
