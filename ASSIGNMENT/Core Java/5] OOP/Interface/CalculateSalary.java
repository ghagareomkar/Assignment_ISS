
interface Salary
{ 
	double calc(double x,int y);
}

class Clerk implements Salary
{
	public double calc(double x,int y)
	{
		return (x*y);
	}
}
class Manager implements Salary
{
	public double calc(double x,int y)
	{
	return (x*y+2000);
	}
}
class CalculateSalary
{
	public static void main(String args [])
	{
		Clerk c1=new Clerk();
		Manager m1=new Manager();
		System.out.println("Salary of manager "+ m1.calc(2000.0,25));
		
		System.out.println("Salary of Clerk "+ c1.calc(1000.0,25));
	}
}
