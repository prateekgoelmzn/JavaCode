import java.util.*;
import java.io.*;
import java.text.*;

public class Main{
	public static void main(String...args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int size = Integer.parseInt(br.readLine());
		Player player;
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		List<Player> plist = new ArrayList<Player>(); 
	 try{
		for(int i=0;i<size;i++)
		{
			String detail = br.readLine();
			String player1[] = detail.split(",");
			Date d = sdf.parse(player1[1]);
            player = new Player(player1[0],d,player1[2],Integer.parseInt(player1[3]),Integer.parseInt(player1[4]),Integer.parseInt(player1[5]),player1[6],Double.parseDouble(player1[7]));
		    plist.add(player);
		}
	 }catch(Exception e){System.out.println(e);}
       Object lastKey = new Object();
       Object lastValue = new Object();
	 Map<Integer,String> treeMap = new TreeMap<Integer,String>(Player.calculateNationalityCount(plist));
	    for(Map.Entry m:treeMap.entrySet()){
             lastKey=m.getKey();
             lastValue=m.getValue();
	    }

	  System.out.println("The nationality with maximum players:"+lastValue);
	}
}