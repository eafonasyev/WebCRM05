<%--
  Created by IntelliJ IDEA.
  User: EAfonasyev
  Date: 22-Apr-20
  Time: 8:46 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%--<%@ page contentType="text/html;charset=UTF-8" language="java" %>--%>

<html>
<head>
    <title>Student showForm</title>
    <style>
        .error{color:red}
    </style>
</head>
<body>

<form:form action="progess-form" modelAttribute = "student">
    First name: <form:input path="firstName"/>
    <br><br>
    Last name: <form:input path="lastName"/>
    <br><br>
    Country:
    <br>
    <br>
    <form:select path="country">
        <form:options items= "${student.countryOptions}"/>
    </form:select>
    <br>
    <br>
    JAVA<form:radiobutton path="favoriteRadioButton" value="JAVA"/>
    C#<form:radiobutton path="favoriteRadioButton" value="C#"/>
    PYTON<form:radiobutton path="favoriteRadioButton" value="PYTON"/>
    PL/SQL<form:radiobutton path="favoriteRadioButton" value="PL/SQL"/>
     <br>
     <br>
    Linux <form:checkbox path="operationSystem" value="Linux" />
    Mac OS <form:checkbox path="operationSystem" value="Mac OS" />
    MS Windows <form:checkbox path="operationSystem" value="MS Window" />
    <br>
    <br>
    <input type="submit" value = "Submit">
</form:form>

</body>
</html>
