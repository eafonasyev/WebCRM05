<%--
  Created by IntelliJ IDEA.
  User: EAfonasyev
  Date: 24-Apr-20
  Time: 7:23 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
    <title>Customer form</title>
    <style>
        .error{color:red}
    </style>
</head>
<body>
<form:form action="progess-form" modelAttribute = "customer">
    First name: <form:input path="firstName"/>
    <br><br>
    Last name: <form:input path="lastName"/>
    <form:errors path="lastName" cssClass="error"/>
    <br><br>
    Free course: <form:input path="freeCourse"/>
    <form:errors path="freeCourse" cssClass="error"/>
    <br><br>
    Postal Code: <form:input path="postalCode"/>
    <form:errors path="postalCode" cssClass="error"/>
    <br><br>
    Course Code: <form:input path="corseCode"/>
    <form:errors path="corseCode" cssClass="error"/>
    <br><br>
    <input type="submit" value = "Submit">
</form:form>
</body>
</html>
