package wwfy.action.user;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class deleteb {
	private int ISBN;
	Statement stmt;
	
	public void setISBN(int ISBN){
		this.ISBN = ISBN;
	}
	public int getISBN(){
		return ISBN;
	}
	public String execute()throws Exception{
		try{
			Class.forName("com.mysql.jdbc.Driver");
		}catch(Exception e){
			System.out.println("Fail"+e.getMessage());
			e.printStackTrace();
		}
    	Connection connect=DriverManager.getConnection("jdbc:mysql://xyvpgmhlzicd.rds.sae.sina.com.cn:10663/library","library","1140310214abcd");
    	try
    	{ 
    		String sql = "delete from Book where ISBN = '" + ISBN + "'";
			stmt = (Statement)connect.createStatement();
			int count = stmt.executeUpdate(sql);
			System.out.println("Delete Successful.Delete DataNum:"+count);
			connect.close();
			return "success";
		}
    	catch(Exception e)
    	{
			return "error";
		}
	}
}
