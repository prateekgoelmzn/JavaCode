import java.util.*;
import java.io.*;
import java.text.*;

class Main{
	public static void main(String[] args) throws Exception{
     BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
     SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
     System.out.println("Enter player 1 detail:");
     String p1=br.readLine();
     String player1[]=p1.split(",");
     System.out.println("Enter player 2 detail:");
     String p2=br.readLine();
     String player2[]=p2.split(",");     
     Player p1obj = new Player(player1[0],sdf.parse(player1[1]),player1[2],Integer.parseInt(player1[3]),Integer.parseInt(player1[4]),Integer.parseInt(player1[5]),player1[6],Double.parseDouble(player1[7]));
	 System.out.println("\nPlayer 1:");
	 System.out.println(p1obj);
     Player p2obj = new Player(player2[0],sdf.parse(player2[1]),player2[2],Integer.parseInt(player2[3]),Integer.parseInt(player2[4]),Integer.parseInt(player2[5]),player2[6],Double.parseDouble(player2[7]));
	 System.out.println("\nPlayer 2:");
	 System.out.println(p2obj);
	 if(player1[0].toUpperCase().equals(player2[0].toUpperCase()) && player1[2].toUpperCase().equals(player2[2].toUpperCase()) && player1[6].toUpperCase().equals(player2[6].toUpperCase()))
	 {
	 	System.out.println("\nPlayer 1 is same as Player 2");
	 }
	 else{
	 	System.out.println("\nPlayer 1 and Player 2 are different");
	 }	 
	}
}