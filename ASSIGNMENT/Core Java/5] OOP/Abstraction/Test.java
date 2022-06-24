public class Test {

   public static void main(String [] args) {
      
      Consumer c = new Interest("Om Ghagare", "India, BE", 2, 60000.00);
      
      System.out.print(" Maturity amount is "+c.computeMaturity());
   }
}