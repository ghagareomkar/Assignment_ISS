package com.collection.hashmap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

class SortByValue implements Comparator<Entry<Employee,Employee>>{
	@Override
	public int compare(Entry<Employee,Employee> o1, Entry<Employee,Employee> o2) {
		return (o1.getValue().getName().compareTo(o2.getValue().getName()));
	}
}
public class CustomObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee emp1= new Employee(101,"Omkar");
		Employee emp2= new Employee(102,"Rajesh");
		Employee emp3= new Employee(103,"Nitin");
		Employee emp4= new Employee(104,"Suresh");
		Employee emp5= new Employee(105,"Manish");
		Employee emp6= new Employee(106,"Manav");
		Employee emp7= new Employee(107,"Hrithik");
		Employee emp8= new Employee(108,"Chaitanya");
		
		
		Map<Employee,Employee> empHashMap =  new HashMap<>();
		
		empHashMap.put(emp1, emp1);
		empHashMap.put(emp2, emp2);
		empHashMap.put(emp3,emp3);
		empHashMap.put(emp4, emp4);
		empHashMap.put(emp5, emp5);
		empHashMap.put(emp6, emp6);
		empHashMap.put(emp7, emp7);
		empHashMap.put(emp8, emp8);
	
		
		System.out.println(empHashMap);
		
		empHashMap.remove(emp1); 
		empHashMap.forEach((k, v) -> System.out.println(k + " => " + v));
		
		System.out.println(empHashMap.size());
		
		Set<Entry<Employee, Employee>> entrySet = empHashMap.entrySet();
		List<Entry<Employee, Employee>> list = new ArrayList<>(entrySet);
		Collections.sort(list, new SortByValue());
		
		System.out.println("After Sorting by values:");
		list.forEach(s->{
			System.out.println(s.getKey()+"\t"+s.getValue());
		});
		
		
	}

}
