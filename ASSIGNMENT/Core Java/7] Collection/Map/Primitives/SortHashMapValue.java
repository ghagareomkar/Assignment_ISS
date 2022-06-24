package com.collection.hashmap;
 
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;  
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;  


class SortQuantity implements Comparator<Entry<Integer,String>>{
	@Override
	public int compare(Entry<Integer,String> o1, Entry<Integer,String> o2) {
		return (o1.getValue().compareTo(o2.getValue()));
	}
}
public class SortHashMapValue   
{  	
	
public static void main(String[] args)   
{  
//implementing HashMap  
HashMap<Integer, String> hm = new HashMap<Integer, String>();  
hm.put(6, "Tushar");  
hm.put(12, "Ashu");  
hm.put(5, "Zoya");  
hm.put(78, "Yash");  
hm.put(10, "Praveen");  
hm.put(67, "Boby");  
hm.put(1, "Ritesh");  

System.out.println("Before Sorting:");  
Set set = hm.entrySet();  
Iterator iterator = set.iterator();  
while(iterator.hasNext())   
{  
Map.Entry map = (Map.Entry)iterator.next();  
System.out.println("Roll no:  "+map.getKey()+"     Name:   "+map.getValue());  
}  


Set<Entry<Integer, String>> entrySet = hm.entrySet();
List<Entry<Integer, String>> list = new ArrayList<>(entrySet);
Collections.sort(list, new SortQuantity());
System.out.println("After Sorting by values:");
list.forEach(s->{
	System.out.println(s.getKey()+"\t"+s.getValue());
});

}

}
