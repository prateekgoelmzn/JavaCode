import java.util.Scanner;
import java.sql.*;
class AddRecordDemo{
 public static void main(String ar[]){
   Scanner s1=new Scanner(System.in);
   System.out.println("enter employee number");
    int eno=s1.nextInt();
   System.out.println("enter employee name");
   String ename=s1.next();
   System.out.println("enter employee salary");
   int sal=s1.nextInt();
   System.out.println("enter employee department");
    String dname=s1.next();
	try{
    //load the driver
      Class.forName("com.mysql.jdbc.Driver");
    //connect with database	
      Connection con = DriverManager.getConnection("jdbc:mysql://localhost/mydata?user=root&password");
   //passing the query
      PreparedStatement ps=con.prepareStatement("insert into emp values(?,?,?,?)");
       ps.setInt(1,eno);
       ps.setString(2,ename);
       ps.setInt(3,sal);
       ps.setString(4,dname);
//execute the query
        int a=ps.executeUpdate();
     if(a==1)
     {System.out.println("Record Added");}
     else
     {System.out.println("Record not added");}	 
    }
catch(Exception e){
   System.out.println(e);
}	
 }
}