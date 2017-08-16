package willitwork;

import java.sql.DriverManager;

public class DbConnection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String Url = "jdbc:mysql://192.168.182.134/testdb";
		String username = "root";
		String pass = "Pxl1234.";
        try {
            Class.forName("com.mysql.jdbc.Driver");
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
