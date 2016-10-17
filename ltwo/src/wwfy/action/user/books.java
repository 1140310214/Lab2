package wwfy.action.user;
import java.util.*;
import java.sql.*;

public class books { 
	private int ISBN;
	private int AuthorID;
	private String Publisher;
	private String PublishDate;
	private int Price;
	
	private String BookTitle = null;
	public String getBookTitle(){
		return BookTitle;
	}
	public void setBookTitle(String BookTitle){
		this.BookTitle = new String(BookTitle);
	}
	
	public int getISBN(){
		return ISBN;
	}
	public int getAuthorID(){
		return AuthorID;
	}
	public String getPublisher(){
		return Publisher;
	}
	public String getPublishDate(){
		return PublishDate;
	}
	public int getPrice(){
		return Price;
	}
	
	Statement stmt;
	public String execute() throws Exception {
    	try{
			Class.forName("com.mysql.jdbc.Driver");
		}catch(Exception e){
			System.out.println("Fail"+e.getMessage());
			e.printStackTrace();
		}
    	Connection connect=DriverManager.getConnection("jdbc:mysql://xyvpgmhlzicd.rds.sae.sina.com.cn:10663/library","library","1140310214abcd");
    	System.out.println(BookTitle);
    	try
    	{ 
    		String sql = "select * from Book";
			stmt = (Statement)connect.createStatement();
			ResultSet res = stmt.executeQuery(sql);
			String sql1 = "select * from Book where Title = '" + BookTitle + "'";
			res = stmt.executeQuery(sql1);
			if(!res.next())
			{
				return "error";
			}
			else
			{
				ISBN = res.getInt("ISBN");
				AuthorID = res.getInt("AuthorID");
				Publisher = new String(res.getString("Publisher"));
				PublishDate = new String(res.getString("PublishDate"));
				Price = res.getInt("Price");
				connect.close();
				return "success";
			}
			
		}
    	catch(Exception e)
    	{
			return "error";
		}
    }
}
