<%--
  Created by IntelliJ IDEA.
  User: EAfonasyev
  Date: 22-Apr-20
  Time: 9:04 AM
  To change this template use File | Settings | File Templates.
  <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>


<html>
<head>
    <title>Auntification</title>
</head>
<body>
FirstName confirm: ${customer.firstName}
<br>
<br>
LastName confirm: ${customer.lastName}
<br>
<br>
Free courses: ${customer.freeCourse}
<br>
<hr>
Postal Code: ${customer.postalCode}
<hr>
Course Code: ${customer.corseCode}
<hr>
</body>
</html>
