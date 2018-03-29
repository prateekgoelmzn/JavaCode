import java.util.Scanner;
import java.sql.*;

class UpdateRecordDemo{
public static void main(String args[]){
   Scanner s1=new Scanner(System.in);
    System.out.println("Enter the employee number you want to update");
	int eno=s1.nextInt();
	 System.out.println("Enter the new salary");
	 int sal=s1.nextInt();
	 try{
		 String qry=null;
	 Class.forName("com.mysql.jdbc.Driver");
	 Connection con=DriverManager.getConnection("jdbc:mysql://localhost/mydata?user=root&password=");
         qry="update emp set sal=sal+? where eno=?";
	 PreparedStatement ps=con.prepareStatement(qry);
	 ps.setInt(1,sal);
	 ps.setInt(2,eno);
	 int a=ps.executeUpdate();
	 if(a==1){System.out.println("Record updated");}
	 else{System.out.println("Record not updated");}
	 }
	 catch(Exception e){System.out.println(e);}
}
}