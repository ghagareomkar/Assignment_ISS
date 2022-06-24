import java.util.*;

public class Subjects {
   public static void main(String args[]) {
      
      ArrayList<String> obj = new ArrayList<String>();

     
      obj.add("Maths");
      obj.add("Hindi");
      obj.add("Physics");
      obj.add("Chemistry");
  

      // Displaying elements
      System.out.println("Original ArrayList:");
      for(String str:obj)
         System.out.println(str);

      
      obj.add(0, "Biology"); // Add element at the given index
      obj.set(1, "English");  // Set element at the given index
      obj.remove("Physics"); //Removes "Physics" from ArrayList


      
      System.out.println("Final ArrayList:");
      for(String str:obj)
         System.out.println(str);
      
      Collections.sort(obj);
      System.out.println("Sorted ArrayList:");
      for (String str : obj) {
         System.out.println(str);
      }
   }
}