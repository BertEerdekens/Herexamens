package pxl.hoofdstuk2Db.testDbCon;

import java.sql.DriverManager;

public class DbConTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String Url = "jdbc:mysql://localhost:3306/testdb";
		String username = "root";
		String pass = "";
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            System.out.println("Trying to connect");
            java.sql.Connection connection = DriverManager.getConnection(Url, username, pass);

            System.out.println("Connection Established Successfull and the DATABASE NAME IS:"
                    + connection.getMetaData().getDatabaseProductName());
        } catch (Exception e) {
System.out.println("Unable to make connection with DB");
            e.printStackTrace();
        }
	}

}