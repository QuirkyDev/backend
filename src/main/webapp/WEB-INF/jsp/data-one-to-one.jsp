<%@ page import="be.thomasmore.graduaten.voorbeeld.backend.entity.Kaart" %>
<%@ page import="java.util.List" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>One to one relation example</title>
</head>
<body>
    <h1>
        One to one relation example
    </h1>

    <%
        List<Kaart> kaarten = (List<Kaart>) request.getAttribute("kaarten");
        out.print("<table border='1'>");
        out.print("<tr><th>Student</th><th>Krediet</th></tr>");
        for (Kaart kaart: kaarten) {
            out.print("<tr><td>" + kaart.getStudent().getNaam() + "</td><td>" + kaart.getKrediet() + "</td></tr>");
        }
        out.print("</table>");
    %>

</body>
</html>
