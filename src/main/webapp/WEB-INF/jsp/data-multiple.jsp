<%@ page import="be.thomasmore.graduaten.voorbeeld.backend.entity.Klas" %>
<%@ page import="java.util.List" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Multiple records example</title>
</head>
<body>
    <h1>
        Multiple records example
    </h1>

    <%
        List<Klas> klassen = (List<Klas>) request.getAttribute("klassen");
        out.print("<table border='1'>");
        out.print("<tr><th>Id</th><th>Naam</th></tr>");
        for (Klas klas: klassen) {
            out.print("<tr><td>" + klas.getId() + "</td><td>" + klas.getNaam() + "</td></tr>");
        }
        out.print("</table>");
    %>

</body>
</html>
