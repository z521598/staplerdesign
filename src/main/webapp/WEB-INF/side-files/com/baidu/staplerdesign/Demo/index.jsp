<%@ page import="com.baidu.staplerdesign.Demo" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%=((Demo) request.getAttribute("it")).name%>
</body>
</html>
