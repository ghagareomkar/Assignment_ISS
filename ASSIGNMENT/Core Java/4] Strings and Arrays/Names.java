import java.util.Scanner;


public class Names {
	public static String largestName(String[] array) {
		int maxLength = 0;
	    String longestString = null;
	    for (String s : array) {
	        if (s.length() > maxLength) {
	            maxLength = s.length();
	            longestString = s;
	        }
	    }
	    return longestString;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner myObj = new Scanner(System.in);
		String[] studentNames = new String[4];
		System.out.print("Enter names of student");
		for(int i=0;i<studentNames.length;i++) {
			String userName = myObj.nextLine();
			studentNames[i]=userName;	
		}
		
		String longestString = largestName(studentNames);
		System.out.format("longest string: '%s'\n", longestString.toUpperCase());
		
	}

	

}
