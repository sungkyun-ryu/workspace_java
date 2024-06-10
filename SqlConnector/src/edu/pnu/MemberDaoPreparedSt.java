package edu.pnu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class MemberDaoPreparedSt {
	
	private static Scanner sc = new Scanner(System.in);
	private static String url="jdbc:mysql://localhost:3306/musthave"; 
	private static String user="scott";
	private static String pw="tiger"; 
	
	private static void insertUser(PreparedStatement pst) throws SQLException {
		System.out.print("You are adding a user. Name? ");
		String name = sc.next();
		System.out.print("Pass? ");
		int pass =sc.nextInt(); 
		pst.setString(1, name); pst.setInt(2, pass);
		try {
			pst.executeUpdate();
			System.out.println(name + " is added to the table.");
		} catch(SQLException e) {
			System.out.println("Failed to add the user.");
		}		
	}
	private static void updateUser(PreparedStatement pst) throws SQLException {
		System.out.print("You are updating a user. Id? ");
		int id = sc.nextInt();
		System.out.print("Name? ");
		String name = sc.next();
		System.out.print("Pass? ");
		int pass =sc.nextInt();		

		pst.setString(1, String.format("%s", name)); 
		pst.setInt(2, pass); 
		pst.setInt(3, id); 
		
		try {
			pst.executeUpdate(); 
			System.out.println(name + " is updated to the table.");
		} catch(SQLException e) {
			System.out.println("Failed to update the user.");
		}		
	}
	
	private static void deleteUser(PreparedStatement pst) throws SQLException { 
		System.out.print("You are deleting a user. Id? ");
		int id = sc.nextInt();
		pst.setInt(1, id);
					
		try {
			pst.executeUpdate(); 
			System.out.println("The person is deleted from the table.");
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
		Connection con = DriverManager.getConnection(url, user, pw);

		PreparedStatement pstInsert = con.prepareStatement("insert into member (name, pass) values (?,?)");
		PreparedStatement pstUpdate = con.prepareStatement("update member set name = ?, pass = ? where id= ?");
		PreparedStatement pstDelete = con.prepareStatement("delete from member where id = ?");
		PreparedStatement pstSelectAll = con.prepareStatement("select id, name, pass, regidate from member");
		
		boolean state = true; 
		
		while(state) {
			System.out.print("[I]nsert/[U]pdate/[D]elete/[S]elect/e[X]it: ");
			String s = sc.next().toUpperCase();
			switch(s) {
			case "I": insertUser(pstInsert);		break;
			case "U": updateUser(pstUpdate);		break;
			case "D": deleteUser(pstDelete);		break;
			case "S": selectAllUsers(pstSelectAll);	break;
			case "X": state = false;			break;
			}
		}
		System.out.println("Bye!");	
		
	}
	

}
