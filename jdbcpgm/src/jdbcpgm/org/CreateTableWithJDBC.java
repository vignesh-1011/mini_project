package jdbcpgm.org;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTableWithJDBC {

    private static final String createTableSQL="create table User5(\r\n" +
    " id int,\r\n"+
    " name varchar(30),\r\n"+ 
    " email varchar(30),\r\n" +
    " password varchar(20)\r\n" +");";
    
    public static void main(String[] args) {
        
        try(Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/viky", "root", "root"))
        {
            Statement stmt=conn.createStatement();
            stmt.execute(createTableSQL);
            System.out.println("Table created successfully!!");
            
        }
        catch(SQLException e)
        {
            System.out.println(e.getMessage());
        }
        
        

    }

}