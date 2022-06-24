import java.util.ArrayList;
import java.util.Collections;

public class Sales implements Comparable<Sales> {
    private String item;
    private int quantity;
   
    public Sales(int quantity, String item) {
         this.quantity = quantity;
         this.item = item;
         
    }

    
    @Override
    public int compareTo(Sales s){    
    	 if(quantity==s.quantity)    
    	 return 0;    
    	 else if(quantity>s.quantity)    
    	 return 1;    
    	 else    
    	 return -1;    
    	 }  
    
    public static void main(String args[]){
 	   ArrayList<Sales> arraylist = new ArrayList<Sales>();
 	   arraylist.add(new Sales(223, "Apple"));
 	   arraylist.add(new Sales(245, "Orange"));
 	   arraylist.add(new Sales(209, "Mango"));

 	   Collections.sort(arraylist);

 	   for(Sales st: arraylist){
 		  System.out.println(st.quantity+" "+st.item);
 	   }
 	}
}