import java.util.Scanner;

class YoungerAgeException extends RuntimeException{	
			YoungerAgeException(String msg){
			super(msg);
		}
}

public class Voting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		System.out.print("Enter your age");
		
		int age= s.nextInt();
		try {
			if(age<18) {
				throw new YoungerAgeException("Not eligible");
			}
			else {
				System.out.print("Welcome");
			}
		}
		catch(YoungerAgeException e) {
			System.out.println("Exception occured: " + e);  
		}
		System.out.print("Exception handled");

	}

}
