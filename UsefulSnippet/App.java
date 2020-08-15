package pg.parseJsonData;

import java.net.URL;
import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONTokener;


/**
 * Hello world!
 *
 */
public class App 
{   
      public static void main(String[] args) {
    	try {
    		//Reading Json Objects
    		
    		String strUrl = "https://jsonmock.hackerrank.com/api/articles";
    		URL url = new URL(strUrl);
        	JSONTokener tokener = new JSONTokener(url.openStream());
        	JSONObject obj = new JSONObject(tokener);
        	
        	System.out.println(obj.toString());
        	System.out.println(obj.get("total").toString());
        	JSONArray arr = obj.getJSONArray("data");
        	System.out.println(arr.getJSONObject(0).toString());
        	System.out.println(arr.getJSONObject(0).get("created_at").toString());
        	
    		
    	}
    	catch(Exception e) {
    		e.printStackTrace();
    	}
    	
      }
}
