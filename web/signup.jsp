<%-- 
    Document   : signup
    Created on : Mar 20, 2014, 1:03:31 PM
    Author     : Abhishek Solanki
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        
        <title>Sign Up</title>
    </head>
    <body>
        <h1> </h1>
  
        <form class="centered"action="signup" method="post">
		<h1>Join US</h1>
		<table>
                <tr>
		<td><b>First name<b></td><td><input type="text" name="firstname"/></td>
		</tr>
                <tr>
		<td><b>Last name<b></td><td><input type="text" name="lastname"/></td>
		</tr>
                 <tr>
                     <td><b>Gender<b></td><td>Male <input type="radio" name="gender" value="male"/>&nbsp;Female <input type="radio" name="gender" value="female"/></td>
		</tr>
                <tr>
		<td><b>Username<b></td><td><input type="text" name="username"/></td>
		</tr>
                <tr>
                <td><b>Password<b></td><td><input type="password" name="password"/></td>
		</tr>
		<tr>
		<td><b>Repeat Password<b></td><td><input type="password" name="repeatPassword"/></td>
		<tr>
                <tr>
		<td><b>Email Address<b></td><td><input type="text" name="email"/></td>
		</tr>
                <tr>
		<td><b>Repeat Email<b></td><td><input type="text" name="repeatEmail"/></td>
		</tr>
                <tr>
		<td><b>Location<b></td><td><input type="text" name="location"/></td>
		</tr>
                <tr>
                    <td></td><td><input type="checkbox" name="tc"/><a href="" >Accept Terms and Conditions</a></td>
		</tr>
		
		<td></td>
                <td><input type="submit" value="Sign Up !" onClick="" />&nbsp; &nbsp;<input type="button" value="Reset" onClick="" /></td>
		</tr>
		</table>
		</form>
        
    </body>
</html>
