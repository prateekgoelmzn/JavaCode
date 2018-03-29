import java.sql.*;
import java.util.Scanner;

class DeleteRecordDemo{
public static void main(String ar[]){
   Scanner s1=new Scanner(System.in);
   System.out.println("enter the employee number");
    int eno=s1.nextInt();
	try{
	   Class.forName("com.mysql.jdbc.Driver");
	   Connection con =DriverManager.getConnection("jdbc:mysql://localhost/mydata?user=root&password=");
	   PreparedStatement ps=con.prepareStatement("delete from emp where eno=?");
	   ps.setInt(1,eno);
	   int a=ps.executeUpdate();
	   if(a==1){System.out.println("record is deleted ");}
	   else{System.out.println("record is not deleted ");}
	}
	catch(Exception e){
	System.out.println(e);
	}
}

}