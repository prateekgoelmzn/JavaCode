import java.util.*;
import java.text.*;
import java.io.*;

class PlayerBO{
	public List<Player> findPlayer(List<Player> playerList,String nationality){
		Iterator<Player> itr = playerList.iterator();
		List<Player> plist = new ArrayList<Player>();
		while(itr.hasNext()){
			Player pobj = itr.next();
			if(pobj.getNationality().equals(nationality))
			{
				plist.add(pobj);
			}
		}
		return plist;
	}
	public List<Player> findPlayer(List<Player>playerList,Date dateOfBirth){
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		String sdate = sdf.format(dateOfBirth);
		Iterator<Player> itr = playerList.iterator();
		List<Player> plist = new ArrayList<Player>();
		while(itr.hasNext()){
			Player pobj = itr.next();
			if(sdf.format(pobj.getDateOfBirth()).equals(sdate))
			{
				plist.add(pobj);
			}
		}
		return plist;
	}

	public List<Player> findPlayer(List<Player>playerList,Double powerRating){
		Iterator<Player> itr = playerList.iterator();
		List<Player> plist = new ArrayList<Player>();
		String pr = Double.toString(powerRating);
		while(itr.hasNext()){
			Player pobj = itr.next();
			if(Double.toString(pobj.getPowerRating()).equals(pr))
			{
				plist.add(pobj);
			}
		}
		return plist;
	}
}