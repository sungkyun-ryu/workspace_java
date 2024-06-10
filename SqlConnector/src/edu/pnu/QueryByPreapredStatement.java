package edu.pnu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class QueryByPreapredStatement {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub

		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/world", "scott", "tiger"); 
//		PreparedStatement pst = con.prepareStatement("select name, population, code "
//													+ "from country "
//													+ "where code=?");
//		pst.setString(1,"kor");
//		ResultSet rs = pst.executeQuery(); 
		
		PreparedStatement pst1 = con.prepareStatement("select id, name, countrycode, district, population "
														+ "from city "
														+ "where population > ? and countrycode = ? ");
	
		pst1.setInt(1, 1000000);
		pst1.setString(2, "usa");
		ResultSet rs1 = pst1.executeQuery();
		
//		while(rs.next()) {
//			
//			System.out.print("name: " + rs.getString("name") + "\t");
//			System.out.println("population: " + rs.getString("population"));
//		}
		
		while (rs1.next()) {
			System.out.print("countrycode: " + rs1.getString("countrycode") + "\t");
			System.out.print("name: " + rs1.getString("name") + "\t\t");
			System.out.println("population: " + rs1.getInt("population"));
		}
		
		
	
	}
}

