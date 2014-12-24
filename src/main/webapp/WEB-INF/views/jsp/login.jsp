<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Ruwi Login</title>
<script>
	function setFocus() {
		document.getElementById("j_username").focus();
	}
</script>
</head>

<body onload="setFocus();">
	<div align="center">
		<h1>Hello World, Ruwi App!</h1>
		<h2>The world's latest financial accounting package</h2>
		<h3>And a programmer's dream program</h3>
		<form action="j_spring_security_check" method="post">

			<table style="background-color: #E9FFFF; border: #CCABC1 5px solid;"
				cellspacing="2" cellpadding="5">
				<tr>
					<td><label for="j_username">Login</label>: <input
						id="j_username" name="j_username" size="20" maxlength="50"
						type="text" /></td>
				</tr>

				<tr>
					<td><label for="j_password">Password</label>: <input
						id="j_password" name="j_password" size="20" maxlength="50"
						type="password" /></td>
				</tr>

				<tr>
					<td><input id="_spring_security_remember_me"
						name="_spring_security_remember_me" type="checkbox" value="true" />
						<label for="_spring_security_remember_me">Remember Me?</label></td>
				</tr>
				<tr>
					<td align="right"><input type="submit" value="Login" /></td>
				</tr>
			</table>
		</form>
	</div>
</body>
</html>