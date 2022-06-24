import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

import org.json.simple.JSONObject;
import org.json.simple.JSONValue;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;  
public class JSONop {

	public static void main(String[] args) throws FileNotFoundException, IOException, ParseException {
		
		//Creating a json object
		JSONObject jsonObject=new JSONObject(); 
		
		//Adding key value pairs to JSON object
		jsonObject.put("ID",new Integer(101));    
		jsonObject.put("Name", "Omkar" );    
		jsonObject.put("Phone","9970050709");    
		System.out.println(jsonObject);    
		
		//Converting JSON to String
		  String jsonString = JSONValue.toJSONString(jsonObject);  
		  System.out.println(jsonString);  
		  
		//Parsing JSON string into JSON object
		  Object jsonObj=JSONValue.parse(jsonString);  
		  jsonObject = (JSONObject) jsonObj;
		  System.out.println(jsonObject);
		  
		  Object obj = new JSONParser().parse(new FileReader("F:\\JSONExample.json"));
		  
		// typecasting obj to JSONObject
	        JSONObject jo = (JSONObject) obj;
	          
	        // getting firstName and lastName
	        String firstName = (String) jo.get("firstName");
	        String lastName = (String) jo.get("lastName");
	          
	        System.out.println(firstName);
	        System.out.println(lastName);
	          
	        // getting age
	        long age = (long) jo.get("age");
	        System.out.println(age);
	          
	        // getting address
	        Map address = ((Map)jo.get("address"));
	          
	        // iterating address Map
	        Iterator<Map.Entry> itr1 = address.entrySet().iterator();
	        while (itr1.hasNext()) {
	            Map.Entry pair = itr1.next();
	            System.out.println(pair.getKey() + " : " + pair.getValue());
	        }
		  
		  
		

	}

}
