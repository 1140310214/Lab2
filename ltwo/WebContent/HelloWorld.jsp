<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<script src="http://ajax.aspnetcdn.com/ajax/jQuery/jquery-1.8.0.js">
	</script>
	<script type="text/javascript">
	function details(e)
	{
		var BookTitle = document.getElementById("BookTitle");
		window.location.href = "booklist?BookTitle="+e.innerHTML;
	}
	</script>
    <head>
        <title>显示书籍</title>
    </head>
    <body bgcolor="Bisque">
   
    <body>
    	<p align="center">作者名是:<s:property value="username"></s:property></p>
    	
    	<table border="1">
			<s:iterator value="BookList" id="String" status = "status">
			<tr>
			<td>
				<p id="BookTitle"><p  onclick="details(this);"><s:property value="String"/> </p> </p> 
				
			</td>
			</tr>
			</s:iterator>
		</table>
			
  	</body>
  
</html>