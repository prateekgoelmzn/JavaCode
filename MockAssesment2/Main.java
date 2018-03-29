import java.util.*;
import java.io.*;
import java.text.*;

class Main{
    public static void main(String[] args) throws Exception{
     BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
    System.out.println("Enter the name of the Team:");
    String tname = br.readLine();
    Team team = new Team(tname);
    int ch=0;
do{
    System.out.println("1.Add Player");
    System.out.println("2.Delete Player");
    System.out.println("3.Display Players");
    System.out.println("4.Exit");
    System.out.println("Enter your choice:");
    ch = Integer.parseInt(br.readLine());

    switch(ch){
        case 1:
          System.out.println("Enter the details of player in CSV format:");
          String detail = br.readLine();
          team.addPlayerToTeam(Player.createPlayer(detail));
              break;
        case 2:
          System.out.println("Enter the name of the player to be deleted:");
          String name = br.readLine();
           team.removePlayerFromTeam(name); 
           break;
        case 3:
          team.displayPlayers();    
          break;
        case 4:
        break; 
    }
   }
   while(ch!=4); 
}}