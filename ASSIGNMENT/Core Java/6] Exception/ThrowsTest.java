import java.io.FileInputStream;
import java.io.FileNotFoundException;

class Read{
	void readFile() throws FileNotFoundException{
		FileInputStream fis = new FileInputStream("F:\\text1.txt");
	}
}
public class ThrowsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Read r= new Read();
		try {
			r.readFile();
		}
		catch(FileNotFoundException e) {
			System.out.println("Exception occured: " + e);
		}
		System.out.println("Exception handled");
	}

}
