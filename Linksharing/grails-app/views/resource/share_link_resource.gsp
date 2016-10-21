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
    <g:form controller="resource" action="saveLinkResource">
        <label> Link: </label>
        <g:textField name="url" id="resLink"  class="form-control"   ></g:textField>
        <label> Description: </label>
        <g:textArea name="description" id="description"  class="form-control"  ></g:textArea>
        <label> Topic: </label>
        <g:select name="topicId" id="topic"  class="form-control" from="${topic}" optionKey="id" optionValue="name"></g:select>
        <g:submitButton name="submit" value="Submit"></g:submitButton>
    </g:form>
</body>
</html>