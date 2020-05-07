<%--
  Created by IntelliJ IDEA.
  User: EAfonasyev
  Date: 22-Apr-20
  Time: 9:04 AM
  To change this template use File | Settings | File Templates.
  <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<head>
    <title>Auntification</title>
</head>
<body>
FirstName confirm: ${student1.firstName}
<br>
<br>
LastName confirm: ${student1.lastName}

<br>
<hr>
Country:           ${student1.country}
<br>
<hr>
Favorite LanguageL: ${student1.favoriteRadioButton}
<br>
<hr>
Operation System:
<ul>
    <c:forEach var ="temp" items="${student1.operationSystem}">
        <br>
    <il>${temp}</il>
    </c:forEach>
</ul>
<br>
<hr>
</body>
</html>
