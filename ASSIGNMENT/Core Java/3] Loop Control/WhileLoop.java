import java.util.*;
public class WhileLoop {

	private int[] marks= new int[10];
	
	void enterMarks(int n) {
		int amount,i=0;
		Scanner s = new Scanner (System.in); 
        
		do {
		System.out.print("Enter the marks of subject "+(i+1));  
        amount = s.nextInt(); 
		marks[i]=amount;	
		i++;
		}while(i<=n);
		
		//input.close(); 
	}
	double total(int n)
	{	int sum=0;
		for(int j=0;j<=n;j++) {
			System.out.println(marks[j]);
			sum+=marks[j];
		}
		return sum;
	}
	
	public static void main(String[] args) {
		WhileLoop obj= new WhileLoop();
		obj.enterMarks(4);
		System.out.println("Total marks"+(obj.total(4)));
	}			
}
