package OjtTask;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Task2 {
 public static void main(String[] args) throws Exception  {
	 Class.forName("com.mysql.jdbc.Driver");
	 Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3307/test","root","root");
	 PreparedStatement p = con.prepareStatement("select admin,phone,role from data");
	 ResultSet rs = p.executeQuery();
	 for(int i=0;rs.next();i++)
	 {
		 System.out.println(rs.getString("admin")+ " "+ rs.getInt("phone")+ " " + rs.getString("role"));
		 System.out.println();
	 }
	while(rs.next())
	{
		System.out.println(rs.getString("admin")+ " "+ rs.getInt("phone")+ " " + rs.getString("role"));
		System.out.println();
	}
	
	Connection con2=DriverManager.getConnection("jdbc:mysql://localhost:3307/pqr","root","root");
	PreparedStatement ps1 = con2.prepareStatement("insert into student values(?,?,?)");

	PreparedStatement ps2 = con2.prepareStatement("insert into Teacher values(?,?,?)");

	PreparedStatement ps3 = con2.prepareStatement("insert into Faculty values(?,?,?)");

	PreparedStatement ps4 = con.prepareStatement("select * from data");
	ResultSet r = ps4.executeQuery();

	while (r.next()) {

		String admin = r.getString("admin");
		int phone = r.getInt("phone");
		String role = r.getString("role");

		if (role.equals("student")) {
			ps1.setString(1, admin);
			ps1.setInt(2, phone);
			ps1.setString(3, role);
			ps1.executeUpdate();
		} else if (role.equals("Teacher")) {
			ps2.setString(1, admin);
			ps2.setInt(2, phone);
			ps2.setString(3, role);
			ps2.executeUpdate();
		} else {
			ps3.setString(1, admin);
			ps3.setInt(2, phone);
			ps3.setString(3, role);
			ps3.executeUpdate();
		}
	}
}
}
