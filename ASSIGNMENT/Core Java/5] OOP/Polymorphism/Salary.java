
public class Salary {
	public double mySal(double MonthlySalary, int month, double bonus)
	   {
	      System.out.println("Best Employee's salary");
	      return (MonthlySalary*month+bonus);
	   }
	public double mySal(double MonthlySalary, int month)
	   {
	      System.out.println("Employee's salary");
	      return (MonthlySalary*month);
	   }
	
	public static void main(String args[]) {
		Salary s = new Salary();
		System.out.println(s.mySal(55000, 8, 5000));
		System.out.println(s.mySal(55000, 8));
	}
}
