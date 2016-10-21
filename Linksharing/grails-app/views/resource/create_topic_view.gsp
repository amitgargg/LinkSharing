<%--
  Created by IntelliJ IDEA.
  User: amitgarg
  Date: 19/10/16
  Time: 11:37 PM
--%>

<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <meta name="layout" content="post_login_defaultlayour" >
    <title></title>
</head>

<body>
Create Topic
<g:form controller="resource" action="createTopic">
    <g:textField name="name" id="name"  class="form-control"  placeholder="Topic Name" ></g:textField>
    <g:select name="visibility" from="${['PRIVATE','PUBLIC']}"  class="form-control"  ></g:select>
    <g:submitButton name="Submit" value="Submit" />
</g:form>
</body>
</html>