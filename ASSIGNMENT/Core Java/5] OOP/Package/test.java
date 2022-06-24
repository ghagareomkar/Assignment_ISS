import com.interest.CalcInterest;
import java. util. Scanner;

public class test {
public static void main(String args[]) {
	CalcInterest c= new CalcInterest();
	Scanner input = new Scanner(System. in);
	System.out.println("Enter principal amount");
	double principal = input.nextDouble();
	System.out.println("Enter rate of intetest");
	float rate= input.nextFloat();
	System.out.println("Enter number of years");
	int time= input.nextInt();
	System.out.println(c.Calculate(principal,time,rate));
	
}
}
