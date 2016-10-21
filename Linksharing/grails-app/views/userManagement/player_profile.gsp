<%--
  Created by IntelliJ IDEA.
  User: amitgarg
  Date: 19/10/16
  Time: 9:58 PM
--%>

<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <meta name="layout" content="post_login_defaultlayour" >
    <title></title>
</head>

<body>
<g:form controller="userManagement" action="updateUserProfile">
        <fieldset>
            <div class="form-group">
                <g:textField name="firstName" id="firstName" value="${user.firstName}" class="form-control"  placeholder="First Name" ></g:textField>
            </div>
            <div class="form-group">
                <g:textField name="lastName" id="lastName" value="${user.lastName}" class="form-control" placeholder="Last Name" ></g:textField>
            </div>
            <div class="form-group">
                <g:textField name="username" id="username" value="${user.username}" disabled="disabled"  class="form-control" placeholder="User Name" ></g:textField>
            </div>
            <div class="form-group">
                <g:textField name="email" id="email" value="${user.email}" class="form-control" placeholder="Email" ></g:textField>
            </div>
            <g:submitButton class="btn btn-lg btn-success btn-block"  name="Submit" id="submit" value="Submit"></g:submitButton>

        </fieldset>
</g:form>
</body>
</html>