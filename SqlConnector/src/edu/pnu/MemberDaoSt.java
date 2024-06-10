package edu.pnu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class MemberDaoSt {

	private static Scanner sc = new Scanner(System.in);
	private static String url="jdbc:mysql://localhost:3306/musthave"; 
	private static String user="scott";
	private static String pw="tiger"; 
	
	private static void insertUser(Statement st) throws SQLException {
		System.out.print("You are adding a user. Name? ");
		String name = sc.next();
		System.out.print("Pass? ");
		int pass =sc.nextInt(); 
		try {
			st.executeUpdate("insert into member (name, pass) values " + String.format("('%s','%d')", name, pass)); 
			System.out.println(name + " is added to the table.");
		} catch(SQLException e) {
			System.out.println("Failed to add the user.");
		}		
	}
	
	private static void updateUser(Statement st) {
		System.out.print("You are updating a user. Id? ");
		int id = sc.nextInt();
		System.out.print("Name? ");
		String name = sc.next();
		System.out.print("Pass? ");
		int pass =sc.nextInt(); 
		try {
			st.executeUpdate("update member set name=" + String.format("'%s'", name) + ", pass = "+String.format("%d", pass) + " where id =" + String.format("%d", id)); 
			System.out.println(name + " is updated to the table.");
		} catch(SQLException e) {
			System.out.println("Failed to update the user.");
		}		
	}
	
	private static void deleteUser(Statement st) throws SQLException { 
		System.out.print("You are deleting a user. Id? ");
		String id = sc.next();
		String name = null;
				
		ResultSet rs = st.executeQuery("select name from member where id= " + id);
		if (rs.next()) {
			name = rs.getString(1);
		}
		
		try {
			st.executeUpdate("delete from member where id= " + id); 
			System.out.println(name + " is deleted from the table.");
		} catch(SQLException e) {
			System.out.println("Failed to delete the user.");
		}		
	}
	
	private static void selectAllUsers(Statement st) throws SQLException {
		ResultSet rs = st.executeQuery("select id, name, pass,regidate from member");
		while(rs.next()) {
			System.out.print("Id = " + rs.getString(1) + ",\t");
			System.out.print("Name = " + rs.getString(2) + ",\t");
			System.out.print("Pass = " + rs.getString(3) + ",\t");
			System.out.println("Registration Date = " + rs.getString(4));
		}
	}
	
	
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con = DriverManager.getConnection(url,user,pw);
		Statement st = con.createStatement();
		
		boolean state = true; 
		
		while(state) {
			System.out.print("[I]nsert/[U]pdate/[D]elete/[S]elect/e[X]it: ");
			String s = sc.next().toUpperCase();
			switch(s) {
			case "I": insertUser(st);		break;
			case "U": updateUser(st);		break;
			case "D": deleteUser(st);		break;
			case "S": selectAllUsers(st);	break;
			case "X": state = false;			break;
			}
		}
		System.out.println("Bye!");
	}

	

}
