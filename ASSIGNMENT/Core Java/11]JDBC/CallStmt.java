package jdbc;
import java.sql.*; 

public class CallStmt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try{  
			Class.forName("com.mysql.jdbc.Driver");  
			Connection con=DriverManager.getConnection(  
			"jdbc:mysql://localhost:3306/jdbc_practice?characterEncoding=utf8","root","abc456");  
			
			CallableStatement stmt=con.prepareCall("{?= call f1(?,?)}"); 
			stmt.setInt(2,10);  
			stmt.setInt(3,43);  
			stmt.registerOutParameter(1,Types.INTEGER);  
			stmt.execute();  
			  
			System.out.println(stmt.getInt(1));
			  
			con.close();  
			 
			}catch(Exception e){ System.out.println(e);}  

	}

}
