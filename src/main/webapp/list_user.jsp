<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'list_user.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
    This is user_list page. <br>
    <ol>
         <s:iterator value="userList">
	  		<li>
	  			<s:property value="loginName" />
	  			
	  			<s:property value="name" /> 
	  			<s:url action='editUser' var='editUrl'>
	  				<s:param name='id' value='id' />
	  			</s:url>
	  			<s:url action='deleteUser' var='deleteUrl'>
	  				<s:param name='id' value='id' />
	  			</s:url>
	  			<a href="<s:property value='editUrl' />">Edit</a>
	  			<a href="<s:property value='deleteUrl' />">Delete</a>
	  		</li>
		</s:iterator>
       </ol>
   	<a href="<s:url action='createUser' />">Create</a>
  </body>
</html>
