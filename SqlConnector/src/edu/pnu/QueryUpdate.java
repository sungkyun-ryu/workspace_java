package edu.pnu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class QueryUpdate {
	
	private static int updateUser(Statement st, Scanner sc) throws SQLException {
				
		System.out.println("Please input data: pass? ");
		String a = sc.next();
		System.out.println("name? ");
		String b = sc.next(); 
//		System.out.println("id? ");
//		int c = sc.nextInt(); 
		String sql = "insert into member (pass, name) values ('"+a+"', '"+b+"')";
	
//		st.setString(1, a);
//		st.setString(2, b);
//		st.setInt(3, c);		
		int ret = st.executeUpdate(sql);		
		System.out.println("updated: " + ret);
		return ret; 
	}
	
	private static int deleteAllUser(Connection con) throws SQLException {
		Statement st = con.createStatement(); 
		int ret = st.executeUpdate("delete from member"); 
		st.close();
		System.out.println("deleted: " + ret);
		return ret; 
	}
	
	private static int deleteUser(Statement st, Scanner sc) throws SQLException {
		System.out.println("You are trying to delete the info with id?");
		String a = sc.next(); 
		
		String sql = "delete from member where id=" + a;
		
		int ret = st.executeUpdate(sql);
		System.out.println("deleted: " + ret + ", with id= " + a);
		return ret; 
	}
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/musthave", "scott", "tiger"); 
		Statement st = con.createStatement(); 
		Scanner sc = new Scanner(System.in); 
		
//		updateUser(st, sc);
		deleteUser(st, sc); 
		
		
//		
//		System.out.println("Please input data: pass? ");
//		String a = sc.next();
//		System.out.println("name? ");
//		String b = sc.next(); 
////		System.out.println("id? ");
////		int c = sc.nextInt(); 
//		String sql = "insert into member (pass, name) values ("+a+", "+b+")";
//		System.out.println(sql);
		
//		System.out.println("You are trying to delete the info with id?");
//		String a = sc.next(); 
//		System.out.println("and name?");
//		String b = sc.next(); 
//		String sql = "delete from member where id="+ a + " and name='" +b+ "'";
//		System.out.println(sql);
//		
//		
		
		
		
		
//		String sqlInsert = "insert into member(pass, name) values (?,?)"; 
//		String sqlUpdate = "update member set pass=?, name=? where id=?";
//		String sqlDelete = "delete from member where name=?";
//		PreparedStatement pstUpdate = con.prepareStatement(sqlUpdate); 
//		PreparedStatement pstDelete = con.prepareStatement(sqlDelete); 
//		
//		int ret = st.executeUpdate("insert into member (pass, name) values('4444', 'SK')");
//		System.out.println(ret);
		
//		deleteUser(pstDelete, "SK");
//		
//		pstDelete.close(); 
		
//		updateUser(pstUpdate, "1111", "John", 14) ; 
//		updateUser(pstUpdate, "2222", "SK", 20); 
//		updateUser(pstUpdate, "3333", "Mark", 17);
		
//		deleteUser(con); 
				
//		PreparedStatement pst = con.prepareCall(sql);
//
//		pst.setString(1, "5678"); 
//		pst.setString(2, "Amy");
//		pst.executeUpdate();
//		
//		pst.setString(1,  "9890");
//		pst.setString(2, "Paul");
//		pst.executeUpdate();
//		
//		pst.setString(1,  "2837");
//		pst.setString(2, "Matt");		
//		pst.executeUpdate();
//		
//		pst.setString(1,  "4857");
//		pst.setString(2,  "Sabrina");
//		pst.executeUpdate(); 
//		
//		pst.setString(1,  "5769");
//		pst.setString(2, "Melanie");
//		pst.executeUpdate(); 
//		
//		pst.setString(1,  "6975");
//		pst.setString(2, "Jane");
//		pst.executeUpdate(); 
//		
//		pst.setString(1,  "3214");
//		pst.setString(2, "Stephen");
//		pst.executeUpdate(); 
		
		sc.close();
		st.close(); 
		con.close(); 			
	}

	
	


}
