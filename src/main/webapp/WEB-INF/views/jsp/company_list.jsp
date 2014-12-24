<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page isELIgnored="false" %>

<head>
	<%@ include file="common/menubar_for_list_screen.script" %>
	<link href="<%=request.getContextPath()%>/datatables/datatables/sources/css/jquery.dataTables.css" rel="stylesheet">
	<script src="<%=request.getContextPath()%>/datatables/datatables/sources/js/jquery.dataTables.min.js"></script>
</head>

<body class="content">
	<%@ include file="common/menubar_for_list_screen.body" %>
	<div class="content">
		<h2>List of Companies</h2>
	</div>
	
	<%@ include file="common/footer.html" %>
</body>