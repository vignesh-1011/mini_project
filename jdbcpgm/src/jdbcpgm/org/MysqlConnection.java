package jdbcpgm.org;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MysqlConnection {

    public static void main(String[] args) {
        
        
        try(Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306", "root", "root"))
        {
            if(conn!=null)
            {
                System.out.println("Connected!!");
            }
            else
            {
                System.out.println("Problem in connection!!");
            }
        }
        catch(SQLException e)
        {
            System.out.println(e.getMessage());
        }
    }

	public static Connection connect() {
		// TODO Auto-generated method stub
		return null;
	}


}
