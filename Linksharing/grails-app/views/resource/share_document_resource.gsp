<%--
  Created by IntelliJ IDEA.
  User: amitgarg
  Date: 20/10/16
  Time: 4:05 PM
--%>

<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <meta name="layout" content="post_login_defaultlayour" />
    <title></title>
</head>

<body>

<g:form controller="resource" action="saveDocumentResource" enctype="multipart/form-data"  method="post">
    <label> Topic: </label>
    <g:select name="topicId" id="topic"  class="form-control" from="${topic}" optionKey="id" optionValue="name"></g:select>
    <label> Description: </label>
    <g:textArea name="description" id="description"  class="form-control"  ></g:textArea>
    <label> Document: </label>
    <input type="file" name="file" />
    <g:submitButton name="submit" value="Submit"></g:submitButton>
</g:form>
</body>
</html>