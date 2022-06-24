package com.collection.hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class BookMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> hmap = new HashMap<Integer, String>();
		hmap.put(5, "ABC");
        hmap.put(11, "DEF");
        hmap.put(4, "GHI");
        hmap.put(77, "JKL");
        hmap.put(9, "MNO");
        hmap.put(66, "PQR");
        hmap.put(0, "STU");
        
        if(hmap.containsKey(11)) {
        	System.out.println("Key Exist");
        }
        
        hmap.remove(11);
        
        System.out.println("Before Sorting:");
        for(Map.Entry m : hmap.entrySet()){    
            System.out.println(m.getKey()+" "+m.getValue());    
           }
        System.out.println();
        System.out.println("After Sorting by keys:");
        Map<Integer, String> map = new TreeMap<Integer, String>(hmap);
        for(Map.Entry m1 : map.entrySet()){    
            System.out.println(m1.getKey()+" "+m1.getValue());    
           }
        
	}

}
