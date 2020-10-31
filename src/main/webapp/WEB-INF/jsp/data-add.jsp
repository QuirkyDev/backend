<%@ page import="be.thomasmore.graduaten.voorbeeld.backend.entity.Klas" %><%--
  Created by IntelliJ IDEA.
  User: Joeri
  Date: 30-10-2020
  Time: 17:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Adding record example</title>
</head>
<body>
    <h1>
        Adding record example
    </h1>
    <form action="/data-add-result" method="post">
        <p>
            <label for="naam">Naam</label>
            <input type="text" name="naam" id="naam">
        </p>
        <p>
            <input type="submit" value="Registreer nieuwe klas">
        </p>
    </form>
</body>
</html>
