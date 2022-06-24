import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class FileWrite {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*try{    
	           FileWriter fw=new FileWriter("F:\\out.txt");    
	           fw.write("Hello Omkar");    
	           fw.close();    
	          }
		catch(Exception e){System.out.println(e);}    
	          System.out.println("File created.");  
	}*/
		
		try {  
            OutputStream outputStream = new FileOutputStream("F:\\out.txt");  
            Writer outputStreamWriter = new OutputStreamWriter(outputStream);  
  
            outputStreamWriter.write("Hello World");  
  
            outputStreamWriter.close();  
        } catch (Exception e) {  
            e.getMessage();  
        }  

}
}
