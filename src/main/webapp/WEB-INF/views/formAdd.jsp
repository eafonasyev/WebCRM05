<%--
  Created by IntelliJ IDEA.
  User: EAfonasyev
  Date: 08-May-20
  Time: 8:25 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>welcome to add  form</title>

    <link type="text/css"
          rel="stylesheet"
          href="${pageContext.request.contextPath}/resources/css/style.css" />

    <link type="text/css"
          rel="srylesheet"
          href="${pageContext.request.contextPath}/resources/css/add-customer-style.css" />
</head>
<body>
<div id ="wrapper">
    <div id="header">
        <h2>CRM Customer Relationship Manager</h2>
    </div>
</div>
<div id="container">
<h3>Save Customer</h3>
    <form:form action="saveCustomer" modelAttribute="customers" method="POST">
        <form:hidden path="id"/>

        <table>
            <tbody>
              <tr>
                  <td><label>FirstName:</label></td>
                  <td><form:input path="firstName"></form:input></td>
              </tr>
              <tr>
                <td><label>LastName:</label></td>
                <td><form:input path="lastName"></form:input></td>
              </tr>
              <tr>
                  <td><label>email:</label></td>
                  <td><form:input path="email"></form:input></td>
              </tr>
              <tr>
                  <td><label></label></td>
                  <td><input type="submit" value="Save" class="save"></td>
              </tr>
            </tbody>
        </table>

    </form:form>
    <div style="clear; both;"></div>
    <p>
    <a href="${pageContext.request.contextPath}/customer/list">Back to list</a>
    </p>

</div>
</body>
</html>
