<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page isELIgnored="false" %>

<head>
<%@ include file="common/menubar.head.html"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<link rel="stylesheet"
	href="http://cdn.datatables.net/1.10.4/css/jquery.dataTables.min.css"
	type="text/css" media="screen, projection" />
<script type="text/javascript"
	src="http://cdn.datatables.net/1.10.4/js/jquery.dataTables.min.js"></script>

<link rel="stylesheet"
	href="http://cdn.datatables.net/plug-ins/3cfcc339e89/integration/foundation/dataTables.foundation.css"
	type="text/css" media="screen, projection" />
<script type="text/javascript"
	src="http://cdn.datatables.net/plug-ins/3cfcc339e89/integration/foundation/dataTables.foundation.js"></script>

<script type="text/javascript">
	$(document).ready(function() {
		$('#myTable').DataTable();
	});
</script>
</head>

<body class="content">
	<%@ include file="common/menubar.body.html"%>
	<br>
	<div style="background-color: #CCABC1;text-align:center;">
		<h2>List of Companies</h2>
	</div>
	
	<%@ include file="common/footer.html" %>
</body>