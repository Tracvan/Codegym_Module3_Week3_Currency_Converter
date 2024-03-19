<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Currence Converter</title>
</head>
<body>
<h2>Currence Converter</h2>
<form action="/convert" method="post">
    <label>Rate:</label><br>
    <input type="text" name="rate" placeholder="rate" value="22000"><br>
    <label>USD:</label><br>
    <input type="text" name="usd" placeholder="usd" value="0"><br>
    <input type="submit" name="submit" placeholder="submit" value="Convert">
</form>

</html>