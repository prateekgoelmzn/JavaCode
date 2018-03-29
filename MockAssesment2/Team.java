import java.util.*;
import java.io.*;
import java.text.*;

class Team{
    private String name;
    private List<Player> playerList = new ArrayList<Player>();
    
    public Team(){}

    public Team(String name){
        this.name = name;
        this.playerList = new ArrayList<Player>();
    }

    public String getName(){return name;}
    public void setName(String name){this.name = name;}
    public void setPlayerList(List<Player> playerList){this.playerList=playerList;}
    public List getPlayerList(){return playerList;}

    public void addPlayerToTeam(Player player)
    {
        playerList.add(player);
        System.out.println("Player successfully added");
    } 


    public Boolean removePlayerFromTeam(String ame){
        Iterator<Player> itr = playerList.iterator();
        int flag=0;
        while(itr.hasNext()){
            if(itr.next().getName().equals(ame))
            {
                itr.remove();
                flag=1;
                break;
            }
        }
        
        if(flag==0)
        {
            System.out.println("Player not found in the team");

            return false;
        }
        
        else{  
            System.out.println("Player successfully deleted"); 
            return true;
        }

       
    }

    public void displayPlayers(){
        if(playerList.size()==0){
            System.out.println("No players to show");
        }
        else{
          System.out.println("Players in:"+name);
         System.out.printf("%-15s%-15s%-10s%-15s%-10s%-10s%-15s%-10s\n", "Name","Date of birth","Skill","No of matches","Runs","Wickets","Nationality","Rating");
         for(Player elem : playerList){
            System.out.print(elem);
         }
        }
    }
}