package screening;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Screen_jdbc_connection {

	// static member holds only one instance of the JDBCSingleton class.
	private static Screen_jdbc_connection jdbc;

	// JDBCSingleton prevents the instantiation from any other class.
	private Screen_jdbc_connection() {
	}

	// Now we are providing gloabal point of access.
	public static Screen_jdbc_connection getInstance() {
		if (jdbc == null) {
			jdbc = new Screen_jdbc_connection();
		}
		return jdbc;
	}
	
	// to get the connection from methods like insert, view etc.   
    public Connection getConnection()throws ClassNotFoundException, SQLException  
    {  
    	
        Connection con=null;          
        Class.forName("com.mysql.jdbc.Driver");        
        con= DriverManager.getConnection("jdbc:mysql://localhost:3306/clinint", "root", "Hello@123");        
        return con;  
        
          
    }  
}
