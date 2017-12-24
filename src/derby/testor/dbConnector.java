/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package derby.testor;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Shawn
 */
public class dbConnector {
    
   public dbConnector() throws SQLException, ClassNotFoundException, IOException{
//             Runtime.getRuntime().exec(new String[] {"cmd", "/C", "Start"});
       
             
             Connection conn = DriverManager.getConnection("jdbc:derby://localhost:1527/EdmontoncashDB", "edmontoncash", "0123");            
             System.out.println("Connection Created");
         
    
    }
    
}
