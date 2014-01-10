<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<%@ taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>My JSP 'edit_user.jsp' starting page</title>

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

	<s:if test="user.id > 0">
		<h3>Edit Person</h3>
		<s:form action='updateUser'>

			<p>
				<s:textfield name="user.loginName" label="Login name" />
				<br />
				<s:textfield name="user.Name" label="Display name" />
				<br />
				<s:textfield name="user.Password" label="Password" />
			</p>

			<s:hidden name="user.id" />
			<s:submit value="Save" />

		</s:form>
	</s:if>
	<s:else>
		<h3>Create Person</h3>
		<s:form action='saveUser'>

			<p>
				<s:textfield name="user.loginName" label="Login name" />
				<br />
				<s:textfield name="user.Name" label="Display name" />
				<br />
				<s:textfield name="user.Password" label="Password" />
			</p>

			<s:hidden name="user.id" />
			<s:submit value="Save" />

		</s:form>
	</s:else>



</body>
</html>
