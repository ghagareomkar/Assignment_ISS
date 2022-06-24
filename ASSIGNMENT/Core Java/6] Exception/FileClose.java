import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileClose {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream fis= null;
		try {
			fis= new FileInputStream("F:\\text1.txt");
		}
		catch(FileNotFoundException e)
		{
			System.out.println("File not found");
		}
		finally
		{
			if(fis!=null) {
				fis.close();
			}
			System.out.print("file closed");
		}
		
	}

}
