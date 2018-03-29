

import java.util.*;
import java.io.*;
import java.text.*;

public class Player{
   private String name,skill,nationality;
   private Date dateOfBirth;
   private int numberOfMatches,runs,wickets;
   private Double powerRating; 
    
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

   public String  getName(){return name;}
   public void setName(String name){this.name=name;}
   public String getSkill(){return skill;}
   public void setSkill(String skill){this.skill=skill;}
   public String getNationality(){return nationality;} 
   public void setNationality(String nationality){this.nationality=nationality;}
   //public getDateOfBirth(){return dateOfBirth;}
   //public setDateOfBirth(Date dateOfBirth){this.dateOfBirth=dateOfBirth;}
   public int getNumberOfMatches(){return numberOfMatches;}
   public void setNumberOfMatches(int numberOfMatches){this.numberOfMatches=numberOfMatches;}
   public int getRuns(){return runs;}
   public void setRuns(int runs){this.runs=runs;}
   public int getWickets(){return wickets;}
   public void setWickets(int wickets){this.wickets=wickets;}
   public double getPowerRating(){return powerRating;}
   public void setPowerRating(Double powerRating){this.powerRating=powerRating;}

   SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");

   @Override
   public String toString(){
   	return String.format("Name:"+name+"\nDate of Birth:"+sdf.format(dateOfBirth)+"\nSkill:"+skill+"\nNumber of Matches:"+numberOfMatches+"\nRuns:"+runs+"\nWickets:"+wickets+"\nNationality:"+nationality+"\nPowerRating:"+powerRating);
   }

}
