/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package readmysqlfile;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
/**
 *
 * @author student
 */
public class ReadMySqlFile {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]){  
try{  
Class.forName("com.mysql.jdbc.Driver");  
Connection con=DriverManager.getConnection(  
"jdbc:mysql://localhost:3306/saburi","root","");  
//here sonoo is database name, root is username and password  
Statement stmt=con.createStatement();  
ResultSet rs=stmt.executeQuery("select * from test");  
while(rs.next())  
System.out.println(rs.getString(1)+"  "+rs.getString(2)+"  ");  
con.close();  
}catch(Exception e){ System.out.println(e);}  
}  
}  
 
    
    

