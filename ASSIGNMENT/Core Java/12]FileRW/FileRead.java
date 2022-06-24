import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class FileRead {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		/*
		int ch;
		 
        // check if File exists or not
        FileReader fr=null;
        
        try
        {
            fr = new FileReader("F:\\text.txt");
        }
        catch (FileNotFoundException fe)
        {
            System.out.println("File not found");
        }
 
        // read from FileReader till the end of file
        while ((ch=fr.read())!=-1)
            System.out.print((char)ch);
 
        // close the file
        fr.close();
        
        */
		
		try  {  
            InputStream stream = new FileInputStream("F:\\text.txt");  
            Reader reader = new InputStreamReader(stream);  
            int data = reader.read();  
            while (data != -1) {  
                System.out.print((char) data);  
                data = reader.read();  
            }  
        } catch (Exception e) {  
            e.printStackTrace();  
        }  
		
	}

}
