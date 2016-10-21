<%--
  Created by IntelliJ IDEA.
  User: amitgarg
  Date: 18/10/16
  Time: 11:15 PM
--%>

<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <meta name="layout" content="post_login_defaultlayour" >
    <title></title>
</head>

<body>
Login SUceessFul
<g:if test="${user.admin}">
    You are a admin and have some special priviliges
</g:if>

</body>
</html>