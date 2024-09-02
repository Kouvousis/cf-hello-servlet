<%@ page import="java.time.LocalDateTime" %>
<%@ page import="java.time.format.DateTimeFormatter" %>
<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" language="java" %>
<html>
<head>
    <title>Current Date</title>
</head>
<body>
    <%
        LocalDateTime now = LocalDateTime.now();

        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String date = now.format(dateFormat);

        pageContext.setAttribute("now", date);


    %>

    <h1>
        <%= pageContext.getAttribute("now") %>
    </h1>

    <h1>${pageScope.now}</h1>
</body>
</html>
