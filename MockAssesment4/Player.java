

import java.util.*;
import java.io.*;
import java.text.*;

public class Player{
   private String name,skill,nationality;
   private Date dateOfBirth;
   private int numberOfMatches,runs,wickets;
   private Double powerRating; 
    
    public static Map<String,Integer> calculateNationalityCount(List<Player>list){
      Map<String,Integer> map = new HashMap<String,Integer>();
      Iterator<Player> itr = list.iterator();
      List<String> country = new ArrayList<String>();     
      while(itr.hasNext()){
        Player pobj = itr.next();
        if(country.contains(pobj.getNationality()))
        {

        }
        else{
          country.add(pobj.getNationality());
        }
      }
      
      Iterator<String> iter = country.iterator();

      while(iter.hasNext()){
           String countries = iter.next();
           map.put(countries,findPlayer(list,countries));
      }

      return map;
    }

  public static int findPlayer(List<Player> playerList,String nationality){
    Iterator<Player> itr = playerList.iterator();
    int result = 0;
    while(itr.hasNext()){
      Player pobj = itr.next();
      if(pobj.getNationality().equals(nationality))
      {
        result++;
      }
    }
    return result;
  }


    public Player(){}

    public Player(String name , Date dateOfBirth , String skill , int numberOfMatches , int runs , int wickets , String nationality , Double powerRating){
      this.name=name;
      this.dateOfBirth=dateOfBirth;
      this.skill=skill;
      this.numberOfMatches=numberOfMatches;
      this.runs=runs;
      this.wickets=wickets;
      this.nationality=nationality;
      this.powerRating=powerRating;
    }
   SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
   public String  getName(){return name;}
   public void setName(String name){this.name=name;}
   public String getSkill(){return skill;}
   public void setSkill(String skill){this.skill=skill;}
   public String getNationality(){return nationality;} 
   public void setNationality(String nationality){this.nationality=nationality;}
   public Date getDateOfBirth(){return dateOfBirth;}
  // public setDateOfBirth(Date dateOfBirth){this.dateOfBirth=dateOfBirth;}
   public int getNumberOfMatches(){return numberOfMatches;}
   public void setNumberOfMatches(int numberOfMatches){this.numberOfMatches=numberOfMatches;}
   public int getRuns(){return runs;}
   public void setRuns(int runs){this.runs=runs;}
   public int getWickets(){return wickets;}
   public void setWickets(int wickets){this.wickets=wickets;}
   public double getPowerRating(){return powerRating;}
   public void setPowerRating(Double powerRating){this.powerRating=powerRating;}

  

}
