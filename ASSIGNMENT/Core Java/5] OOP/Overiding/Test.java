class Vehicle 
{ 
  void Petrol() 
  { 
    System.out.println("The mileage of the Car petrol vehicle is 20km/l"); 
  } 
// Overridden method. 
   void Diesel() 
   { 
      System.out.println("The mileage of the Car diesel vehicle is 22km/l"); 
   } 
}

class Scooty extends Vehicle{
	void Petrol() 
	  { 
	    System.out.println("The mileage of scooty petrol version is 30km/l"); 
	  } 
}
public class Test {
	public static void main(String args[]) {
	Vehicle obj1= new Vehicle();
	Vehicle obj2= new Scooty();
	obj1.Diesel();
	obj2.Petrol();
}
}
