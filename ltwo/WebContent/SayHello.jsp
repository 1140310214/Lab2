<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page language="java" import="java.util.*" pageEncoding="GB2312"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">

<html>
    <head>
        <title>图书数据库</title>
    </head>
    <body>
        <center>   
        <s:form action="loginUser">
        		<body bgcolor="Bisque">
                <s:textfield name="username" label="请输入要查询的作者名"></s:textfield>
                <s:submit value="确定"/>
                <s:reset value="重置"/>
        </s:form>
    </center>
    </body>
</html>