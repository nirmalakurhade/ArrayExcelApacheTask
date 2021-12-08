package OjtTask;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class Task3 {
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/test", "root", "root");
		PreparedStatement ps = con.prepareStatement("create table emp(id int PRIMARY KEY,name varchar(15),phone int)");
		ps.executeUpdate();
		Statement p = con.createStatement();
		p.executeUpdate("insert into emp(id,name,phone) values(101,'@jbk',9065432)");
		p.executeUpdate("insert into emp(id,name,phone) values(102,'vij#ay',9935432)");
		p.executeUpdate("insert into emp(id,name,phone) values(103,'advik',8823432)");
		p.executeUpdate("insert into emp(id,name,phone) values(104,'pritam',8973632)");
		PreparedStatement ps1 = con.prepareStatement("create table emp_clone( id int PRIMARY KEY,name varchar(15),phone int)");
		ps1.executeUpdate();
		System.out.println(" table created");
        PreparedStatement ps2 = con.prepareStatement("insert into emp_clone values(?,?,?)");
        PreparedStatement ps3 = con.prepareStatement("select * from emp");
		ResultSet r = ps3.executeQuery();
		while (r.next()) {

			int id = r.getInt("id");
			String name = r.getString("name");
			int phone = r.getInt("phone");
			

			if (name.contains("@")) {
				ps2.setInt(1, id);
				ps2.setString(2, name);
				ps2.setInt(3, phone);
				ps2.executeUpdate();
			} else if(name.contains("#")){
				ps2.setInt(1, id);
				ps2.setString(2, name);
				ps2.setInt(3, phone);
				ps2.executeUpdate();
			}
		}	
   }
}
