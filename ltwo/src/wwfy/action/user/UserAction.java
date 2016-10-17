package wwfy.action.user;
//import java.sql.*; 
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.*;
//查找作者所著书
public class UserAction {
	Statement stmt;
	
	private String username;
	private ArrayList<String> BookList = new ArrayList<String>();
	
    public String getUsername() {
        return username;
    }
    public void setUsername(String user) {
        this.username = new String(user);
    }
    public ArrayList<String> getBookList(){
		return BookList;
	}
    public String execute() throws Exception {
    	try{
			Class.forName("com.mysql.jdbc.Driver");
		}catch(Exception e){
			System.out.println("Fail"+e.getMessage());
			e.printStackTrace();
		}
    	Connection connect=DriverManager.getConnection("jdbc:mysql://xyvpgmhlzicd.rds.sae.sina.com.cn:10663/library","library","1140310214abcd");
    	try { 
    		String sql = "select * from Author";
			stmt = (Statement)connect.createStatement();
			ResultSet res = stmt.executeQuery(sql);
			boolean flag = false;
			int TeAuthorID = 0;
			
			while(res.next()){
				if(username.equals(res.getString("Name"))){
					TeAuthorID=res.getInt("AuthorID");
					flag = true;
					break;
				}
			}
			if(flag){
				String sq2 = "select * from Book";
				res = stmt.executeQuery(sq2);
				while(res.next())
					if(TeAuthorID==res.getInt("AuthorID"))
						BookList.add(new String(res.getString("Title")));
				connect.close();
				return "success";
			}	
			else{ 
				connect.close();
				return "error";
			}
		}catch(Exception e){
			return "error";
		}
    }
}
