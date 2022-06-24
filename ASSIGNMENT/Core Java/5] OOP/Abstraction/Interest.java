public class Interest extends Consumer {
   private double interest;   
   
   public Interest(String name, String address, int id, double interest) {
      super(name, address, id);
      setInterest(interest);
   }
   
 
   public double getInterest() {
      return interest;
   }
   
   public void setInterest(double newInterest) {
         interest = newInterest;
   }
   
   public double computeMaturity() {
      System.out.println("Computing 1 year maturity amount for " + getName());
      return interest*12;
   }
}