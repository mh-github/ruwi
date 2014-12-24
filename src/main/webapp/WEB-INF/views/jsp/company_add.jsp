<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@page isELIgnored="false" %>

<head>
	<%@ include file="common/menubar.head.html" %>
	<style type="text/css">
		@import "<%=request.getContextPath()%>/css/jquery.datepick.css";
	</style>
	<script type="text/javascript"
		src="<%=request.getContextPath()%>/js/jquery.datepick.js">
	</script>
	<script type="text/javascript">
		$(document).ready(function() {
			$("#date_incorporated").datepick({
				yearRange : '-50:+0',
				dateFormat : 'dd/mm/yyyy'
			});
		});
	</script>
</head>

<body>
	<%@ include file="common/menubar.body.html" %>
	<div class="content">
		<h2>Add A New Company</h2>
	</div>
	
	<form:form method="POST" commandName="companyFormBean" action="add">
		<form:errors path="*" cssClass="errorblock" element="div" />
		<table style="background-color:#E9FFFF;border:#CCABC1 5px solid;" cellspacing="2" cellpadding="5">
			<tr>
				<td>Code : <font color="red">*</font></td>
				<td><form:input path="name" /></td>
				<td><form:errors path="name" cssClass="error" /></td>
			</tr>
			<tr>
				<td>Date Incorporated : </td>
				<td><form:input path="date_incorporated" /></td>
				<td><form:errors path="date_incorporated" cssClass="error" /></td>
			</tr>
			<tr>
				<td>Currency : </td>
				<td> 
			</tr>
			<tr>
				<td>Street Details1 : </td>
				<td><form:input path="streetDetails1" /></td>
				<td><form:errors path="streetDetails1" cssClass="error" /></td>
			</tr>
			<tr>
				<td>Street Details2 :</td>
				<td><form:input path="streetDetails2" /></td>
				<td><form:errors path="streetDetails2" cssClass="error" /></td>
			</tr>
			<tr>
				<td>City :</td>
				<td><form:input path="city" /></td>
				<td><form:errors path="city" cssClass="error" /></td>
			</tr>
			<tr>
				<td>State :</td>
				<td><form:input path="state" /></td>
				<td><form:errors path="state" cssClass="error" /></td>
			</tr>
			<tr>
				<td colspan="3"><input type="submit" /></td>
			</tr>
		</table>
	</form:form>
		
	<%@ include file="common/footer.html" %>
</body>