package chapter_9;

import java.sql.Connection;
import java.sql.DriverManager;

public class conn 
{
	static Connection con;
    
    static
    {
       try
       {
           
           
           con=DriverManager.getConnection("jdbc:mysql://localhost:Enter_your_localhost_number/school" , "root" , "Enter_your_root_password");

       }
        catch(Exception e)
        {
            System.out.println("Error Occur "+e);
        }
    }

}
