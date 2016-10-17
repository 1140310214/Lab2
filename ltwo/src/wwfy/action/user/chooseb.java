package wwfy.action.user;
import java.util.*;
import java.sql.*;

public class chooseb {
	private int ISBN;
	
	public int getISBN(){
		return ISBN;
	}
	public void setISBN(int ISBN){
		this.ISBN=ISBN;
	}
	
	public String execute()throws Exception{
		return "success";
	}
}
