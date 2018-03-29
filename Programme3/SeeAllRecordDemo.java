import java.sql.*;

class SeeAllRecordDemo{
   public static void main(String ar[]){
             try{
			 Class.forName("com.mysql.jdbc.Driver");
			 Connection con = DriverManager.getConnection("jdbc:mysql://localhost/mydata?user=root&password=");
			 PreparedStatement ps=con.prepareStatement("Select * from emp");
			  ResultSet rs=ps.executeQuery();
			    while(rs.next()){
				    int emno=rs.getInt(1);
					String name=rs.getString(2);
					int salary=rs.getInt(3);
					String depname=rs.getString(4);
					System.out.println("Employee number is\t"+emno);
					System.out.println("Employee name is\t"+name);
					System.out.println("salary is\t"+salary);
					System.out.println("Employee department name is\t"+depname);
					System.out.println("\n===============================================\n");
				}
			 }
catch(Exception e){
 System.out.println(e);
}			 
   }
}