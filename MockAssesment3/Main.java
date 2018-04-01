import java.util.*;
import java.text.*;
import java.io.*;

class Main{
   public static void main(String[] args) throws IOException {
   
   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
   List<String> plist = new ArrayList<String>();
   List<Player> player = new ArrayList<Player>();
   Player pobj;
   SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");	
	 System.out.println("Enter the number of Players:");
	 int number = Integer.parseInt(br.readLine());

	 for(int i=0;i<number;i++)
	   {
       String detail = br.readLine();
       plist.add(detail);
     }  

     try{
     Iterator<String> itr = plist.iterator();
      while(itr.hasNext()){
        String player1[]=itr.next().split(",");
        Date d = sdf.parse(player1[1]);
        //System.out.print(player1[0]+""+player1[1]+""+player1[2]+""+Integer.parseInt(player1[3])+""+Integer.parseInt(player1[4])+""+Integer.parseInt(player1[5])+""+player1[6]+""+Double.parseDouble(player1[7]));
        pobj = new Player(player1[0],d,player1[2],Integer.parseInt(player1[3]),Integer.parseInt(player1[4]),Integer.parseInt(player1[5]),player1[6],Double.parseDouble(player1[7]));
        player.add(pobj);
      }
}catch(Exception e){e.printStackTrace();}   
    
    System.out.print("\nEnter a search type:\n1.By Nationality\n2.By Date of Birth\n3.By Power Rating\n");
    int search_type = Integer.parseInt(br.readLine());

    if(search_type==1)
    {
      System.out.println("Enter the Nationality:");    	
      String Nationality = br.readLine();
      PlayerBO pbo = new PlayerBO();
      System.out.printf("%-15s%-15s%-10s%-15s%-10s%-10s%-15s%-10s\n", "Name","Date of birth","Skill","No of matches","Runs","Wickets","Nationality","Rating");
      for(Player elem : pbo.findPlayer(player,Nationality)){
      	System.out.println(elem);
      }
    }
    else if(search_type==2)
    {
      System.out.println("Enter the Date of Birth:");
    try{    	
      Date dat = sdf.parse(br.readLine());
      PlayerBO pbo = new PlayerBO();
      
     for(Player elem : pbo.findPlayer(player,dat)){
      	System.out.println(elem);
      }
    }catch(Exception e){System.out.println(e);}
  
    }
    else if(search_type==3)
    {
      System.out.println("Enter the Power Rating:");    	
      Double power = Double.parseDouble(br.readLine());
      PlayerBO pbo = new PlayerBO();
       for(Player elem : pbo.findPlayer(player,power)){
      	System.out.println(elem);
      }
    }
    else{ System.out.println("Invalid choice"); }
   
   }
}