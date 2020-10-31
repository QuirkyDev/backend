<%@ page import="be.thomasmore.graduaten.voorbeeld.backend.entity.Klas" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Single record example</title>
</head>
<body>
    <h1>
        Single record example
    </h1>

    <%
        Klas klas = (Klas) request.getAttribute("klas");
        out.print("<p>Naam klas: " + klas.getNaam() + "</p>");
    %>

</body>
</html>
