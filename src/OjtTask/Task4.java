package OjtTask;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class Task4 {
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");// static block of Driver class will be executed
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/pqr", "root", "root");
		Statement p = con.createStatement();

		p.executeUpdate("insert into employee(eid,ename,ephone,Table_name)values(101,'@jbk',9065432,'Analytics_Sec')");
		p.executeUpdate("insert into employee(eid,ename,ephone,Table_name)values(102,'Kiran',9065432,'Admin_Sec')");
		p.executeUpdate("insert into employee(eid,ename,ephone,Table_name)values(103,'Shweta',9065432,'HR_Sec')");
		p.executeUpdate("insert into employee(eid,ename,ephone,Table_name) values(104,'Shital',9065432,'Analytics_Sec')");
		p.executeUpdate("insert into employee(eid,ename,ephone,Table_name)values(105,'Vijay',9065432,'Admin_Sec')");
		System.out.println("Record inserted");
		Connection con1 = DriverManager.getConnection("jdbc:mysql://localhost:3307/test", "root", "root");

		PreparedStatement ps1 = con1.prepareStatement("insert into  Analytics_Sec values(?,?,?)");

		PreparedStatement ps2 = con1.prepareStatement("insert into  Admin_Sec values(?,?,?)");

		PreparedStatement ps3 = con1.prepareStatement("insert into HR_Sec values(?,?,?)");

		PreparedStatement ps4 = con.prepareStatement("select * from employee");
		ResultSet r = ps4.executeQuery();
		while (r.next()) {

			int eid = r.getInt("eid");
			String ename = r.getString("ename");
			int ephone = r.getInt("ephone");
			String Table_name = r.getString("Table_name");

			if (Table_name.equals("Analytics_Sec")) {
				ps1.setInt(1, eid);
				ps1.setString(2, ename);
				ps1.setInt(3, ephone);
				ps1.executeUpdate();
			} else if (Table_name.equals("Admin_Sec")) {
				ps2.setInt(1, eid);
				ps2.setString(2, ename);
				ps2.setInt(3, ephone);
				ps2.executeUpdate();
			} else if (Table_name.equals("HR_Sec")) {
				ps3.setInt(1, eid);
				ps3.setString(2, ename);
				ps3.setInt(3, ephone);
				ps3.executeUpdate();
			}

		}
	}
}
