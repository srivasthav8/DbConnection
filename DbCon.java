import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

// Do not import com.mysql.jdbc.*
// or you will have problems!

public class DbCon {
    public static void main(String[] args) throws SQLException {
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
        } catch (Exception ex) {
        }
    

		
		Connection connection = 
				DriverManager.getConnection("jdbc:mysql://localhost:3306/login","root","manager");
		
		System.out.println("Database is connected: " + connection.getCatalog());
		
		
		
	}

}
