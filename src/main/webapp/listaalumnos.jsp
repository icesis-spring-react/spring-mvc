<%--
  Created by IntelliJ IDEA.
  User: javargas
  Date: 30/08/23
  Time: 1:39 p. m.
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html xmlns:th="http://www.thymeleaf.org">
<head>
    <meta charset="UTF-8">
    <title>Insert title here</title>
</head>
<body>

<p>
    ${alumno}
</p>
<ul th:each="alumno : ${listaalumnos}">
    <li th:text="${alumno.nombre}"></li>
    <li th:text="${alumno.edad}"></li>
</ul>
</body>
</html>
