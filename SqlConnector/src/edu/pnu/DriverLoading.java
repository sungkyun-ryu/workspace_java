package edu.pnu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DriverLoading {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.cj.jdbc.Driver"); 
		
		System.out.println("로딩 성공");
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/world", "scott", "tiger");
		
		System.out.println("연결 성공");
		
		Statement st = con.createStatement(); 
		ResultSet rs = st.executeQuery("select id, name, countrycode, district, population from city limit 10");
		
		while(rs.next()) {
			System.out.print(rs.getString(1) + ",");
			System.out.print(rs.getString("name") + ",");
			System.out.print(rs.getString(3) + ",");
			System.out.print(rs.getString("district") + ",");
			System.out.print(rs.getString("population") + "\n");

		}
		rs.close(); 
		st.close();
		con.close(); 
		
	}
}
