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
           
           
           con=DriverManager.getConnection("jdbc:mysql://localhost:3306/school" , "root" , "Himanshi@2109");

       }
        catch(Exception e)
        {
            System.out.println("Error Occur "+e);
        }
    }

}
