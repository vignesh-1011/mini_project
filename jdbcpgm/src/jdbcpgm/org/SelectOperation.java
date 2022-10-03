package jdbcpgm.org;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectOperation {

    public static void main(String[] args) throws SQLException {
        
        Connection conn=MysqlConnection.connect();
        
        if(conn!=null)
        {
            try {
                Statement stmt=conn.createStatement();
                ResultSet result= stmt.executeQuery("select * from testing");
                
                while(result.next())
                {
                  System.out.println(result.getInt(1)+" "+result.getString(2)+ " "+result.getString(3)+" "+result.getString(4));
                }
                
            } catch (SQLException e) {
                
                e.printStackTrace();
            }
            
        }
        else
        {
            System.out.println("Problem in database connection!!");
        }
        
        conn.close();
    }
    

}
