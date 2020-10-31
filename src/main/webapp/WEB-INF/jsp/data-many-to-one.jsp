<%@ page import="be.thomasmore.graduaten.voorbeeld.backend.entity.Student" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Many to one relation example</title>
</head>
<body>
    <h1>
        Many to one relation example
    </h1>
    <%
        Student student = (Student) request.getAttribute("student");
        out.print("<p>Naam: " + student.getNaam() + "</p>");
        out.print("<p>studentennummer: " + student.getStudentNummer() + "</p>");
        out.print("<p>Klas: " + student.getKlas().getNaam() + "</p>");
    %>
</body>
</html>
