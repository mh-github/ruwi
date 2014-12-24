<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@page isELIgnored="false" %>

<head>
	<%@ include file="common/menubar.head.html" %>
</head>

<body class="content">
	<%@ include file="common/menubar.body.html" %>
	<div class="content">
		<h2>Add A New Currency</h2>
	</div>
	
	<form:form method="POST" commandName="currencyFormBean" action="add">
		<form:errors path="*" cssClass="errorblock" element="div" />
		
		<table style="background-color:#E9FFFF;border:#CCABC1 5px solid;" cellspacing="2" cellpadding="5">
			<tr>
				<td>Code : <font color="red">*</font></td>
				<td><form:input path="code" /></td>
				<td><form:errors path="code" cssClass="error" /></td>
			</tr>
			<tr>
				<td>Description : <font color="red">*</font></td>
				<td><form:input path="description" /></td>
				<td><form:errors path="description" cssClass="error" /></td>
			</tr>
			<tr>
				<td colspan="3"><input type="submit" /></td>
			</tr>
		</table>
	</form:form>
		
	<%@ include file="common/footer.html" %>
</body>