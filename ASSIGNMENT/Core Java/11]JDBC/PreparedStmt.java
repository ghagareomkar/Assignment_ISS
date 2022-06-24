package jdbc;
import java.sql.*; 

public class PreparedStmt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try{  
			Class.forName("com.mysql.jdbc.Driver");  
			Connection con=DriverManager.getConnection(  
			"jdbc:mysql://localhost:3306/regdb?characterEncoding=utf8","root","abc456");  
			
			PreparedStatement pst = con.prepareStatement("insert into users(uname,upwd,uemail,umobile) values(?,?,?,?)");
			pst.setString(1, "ketan");
			pst.setString(2, "ketan@123");
			pst.setString(3, "ketan@yahoo.com");
			pst.setString(4, "9988774566");
			
			int i=pst.executeUpdate();  
			System.out.println(i+" records inserted");  
			  
			con.close();  
			 
			}catch(Exception e){ System.out.println(e);}  
	}
		
	}


