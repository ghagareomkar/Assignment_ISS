public abstract class Consumer {
   private int id;
   private String name;
   private String address;
  

   public Consumer(String name, String address, int id) {
      System.out.println("New consumer");
      this.name = name;
      this.address = address;
      this.id = id;
   }
   public int getId() {
	   return id;
   }
   public String getAddress() {
	   return address;
   }
   public abstract double computeMaturity();
   

   public String getName() {
      return name;
   }
 
}