<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>书籍信息</title>
<script src="http://ajax.aspnetcdn.com/ajax/jQuery/jquery-1.8.0.js">
</script>
<script type="text/javascript">
function deletes(e)
{
	var ISBN = document.getElementById("ISBN");
	alert(ISBN.innerHTML);
	window.location.href = "delete?ISBN="+ISBN.innerHTML;
}
</script>
</head>
<body>
<body bgcolor="Bisque">
<h1>书籍信息</h1>
		<p id="ISBN">
		<s:property value = "ISBN"/></p>
		<hr/>
		AuthorID:<s:property value = "AuthorID"/>
		<hr/>
		Publisher:<s:property value = "Publisher"/>
		<hr/>
		PublishDate:<s:property value = "PublishDate"/>
		<hr/>
		Price:<s:property value = "Price"/>
		<hr/>
		<p  onclick="deletes(this);">
		<a href='<s:url action="newlogin.action" >
				</s:url>'> 删除</a>
		</p>
</body>
</html>