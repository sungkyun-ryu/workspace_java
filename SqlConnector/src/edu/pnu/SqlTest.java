package edu.pnu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;



public class SqlTest {	
	//	url = "jdbc:mysql://localhost:3306/world", "scott", "tiger"
	public static void main(String[] args) throws SQLException {

		// TODO Auto-generated method stub

		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/world", "scott", "tiger");
		Statement st= con.createStatement(); 
//		ResultSet rs = st.executeQuery("select name, population from country where population > 10000000");
		SqlTest.ind1900(st);
		
//		SqlTest.printResultSet(rs); 
		st.close(); con.close();
		
//		SqlTest.countryKOR();
//		SqlTest.country_capital();
//		SqlTest.top_5_pop();
//		SqlTest.allCitiesUSA();
//		SqlTest.lang_inChina();
//		SqlTest.pop1mEu();

	}
//	public static void countryKOR() throws SQLException { 
//		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/world", "scott", "tiger");
//
//		Statement st = con.createStatement();
//		ResultSet rs = st.executeQuery("select ct.name, ct.population from city ct, country ctr "
//				+ "where ctr.code = ct.countrycode "
//				+ "and ctr.code = 'kor'"); 
//		while(rs.next()) {
//			System.out.print("city= " + rs.getString("ct.name") + ", ");
//			System.out.print("population= " + rs.getString("ct.population") + "\n");
//		}
//
//		rs.close(); 
//		st.close(); 
//		con.close();		
//	}
//
//	private static void country_capital() throws SQLException {
//		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/world", "scott", "tiger");
//
//		Statement st = con.createStatement(); 
//		ResultSet rs = st.executeQuery("select ctr.name, ct.name "
//				+ "from country ctr, city ct "
//				+ "where ctr.code = ct.countrycode "
//				+ "and ctr.continent = 'europe' ");
//		while(rs.next()) {
//			System.out.print("city = " + rs.getString("ct.name") + ", ");
//			System.out.print("country = " + rs.getString("ctr.name") + "\n");		
//		}
//		rs.close(); st.close(); con.close(); 
//	}
//
//	private static void top_5_pop() throws SQLException {
//		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/world", "scott", "tiger");
//
//		Statement st = con.createStatement(); 
//		ResultSet rs = st.executeQuery("select name from country order by population desc limit 5");
//
//		for (int i = 1; i < 6; i++) { 
//			System.out.print("Rank" + String.valueOf(i) + ": ");
//			rs.next();
//			System.out.println(rs.getString("name"));
//		}
//		rs.close(); st.close(); con.close(); 
//	}
//
//	private static void allCitiesUSA() throws SQLException {
//		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/world", "scott", "tiger");
//
//		Statement st = con.createStatement(); 
//		ResultSet rs= st.executeQuery("select ct.name from city ct, country ctr "
//									+ "where ctr.code = ct.countrycode "
//									+ "and ctr.code = 'USA'"); 
//		while(rs.next()) {
//			System.out.print(rs.getString("ct.name") + ", ");
//			System.out.print("USA" + "\n");			
//		
//		} rs.close(); st.close(); con.close(); 
//	}
//	
//	private static void lang_inChina() throws SQLException {
//		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/world", "scott", "tiger");
//		
//		Statement st = con.createStatement(); 
//		ResultSet rs = st.executeQuery("select cl.language, cl.percentage "
//									+ "from countrylanguage cl, country ctr "
//									+ "where cl.countrycode = ctr.code "
//									+ "and ctr.code='chn'"); 
//		while(rs.next()) {
//			System.out.print("Language= " + rs.getString("cl.language") + ", ");
//			System.out.print("Percentage= " + rs.getString("cl.percentage") + "\n");
//		}
//		rs.close(); con.close(); st.close();
//	} 
//
//	private static void pop1mEu() throws SQLException { 
//		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/world", "scott", "tiger");
//		Statement st = con.createStatement(); 
//		ResultSet rs = st.executeQuery("select name, population from country where population > 1000000 and continent = 'europe' ");
//		
//		while(rs.next()) { 
//			System.out.print(rs.getString("name") + ", " + rs.getString("population") + "\n");
//		}
//		rs.close(); con.close(); st.close(); 	
//	}
	
	private static void ind1900(Statement s) throws SQLException {
		ResultSet rs = s.executeQuery("select name, indepyear from country where indepyear > 1900");
		while(rs.next()) {
			System.out.println(rs.getString("name") + ", " + "indepent since " + rs.getString("indepyear"));
		}
		rs.close();
	}
	
	
//	
//	private static void printResultSet(ResultSet rs) throws SQLException { 
//		ResultSetMetaData meta = rs.getMetaData() ; 
//		int count = meta.getColumnCount();
//		System.out.print(count);
//		while(rs.next()) {
//			for (int i = 1; i <= count ; i++) {
//				System.out.print(rs.getString(i) + ((i==count)? "": ","));
//			}
//			System.out.println();
//		}
//		rs.close(); 
//	}
//	
	
}
