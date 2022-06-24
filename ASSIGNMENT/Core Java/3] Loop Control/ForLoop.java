
public class ForLoop {

	 public static double[] calculateGPA(int[] studentIdList, char[][] studentsGrades) {
	        // your code
	        double[] answer = new double[studentsGrades.length];
	        for(int i=0;i<studentsGrades.length;i++){
		int len=studentsGrades[i].length;
		double sum=0,res=0;
		for(int j=0;j<len;j++){
			if(studentsGrades[i][j]=='A'){
				res=4;
			}
			else if(studentsGrades[i][j]=='B'){
				res=3;	
			}
			else{
				res=2;
			}
			sum+=res;
		}
			double ans=sum/len;
			answer[i]=ans;	
		
		}

		return answer;
		
	    }
	 
	 public static void getStudentsByGPA(double lower, double higher, int[] studentIdList, char[][] studentsGrades) {
	       
	        // invoke calculateGPA
	        
	        // construct the result array and return it. You would need an extra for loop to compute the size of the resulting array
	        double[] GPA = calculateGPA(studentIdList,studentsGrades);
		int count=0;			
		for(int i=0;i<GPA.length;i++){
			if((lower<GPA[i])&&(GPA[i]<higher)){
				count++;
			}
		}
		int[] Student= new int[count];
		int x;
		for(int i=0;i<GPA.length;i++){
			
			if((lower<GPA[i])&&(GPA[i]<higher)){
				int j=0;
				Student[j]=studentIdList[i];
				x=Student[j];
				System.out.print("ID of student GPA within limits is "+x);
				j++;
			}
		}

		
	    }
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] studentIdList= {1001,1002};
		char[][] studentsGrades = {{'A','A','A','B'},{'A','B','B'}};
		getStudentsByGPA(3.2,3.5,studentIdList,studentsGrades);
		
	}

}
