<%--
  Created by IntelliJ IDEA.
  User: amitgarg
  Date: 19/10/16
  Time: 4:24 PM
--%>

<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>Link Sharing</title>

    <link rel="stylesheet" href="${resource(dir:'css',file:'bootstrap.min.css')}" />
    <link rel="stylesheet" href="${resource(dir:'css',file:'ie10-viewport-bug-workaround.css')}" />
    <link rel="stylesheet" href="${resource(dir:'css',file:'blog.css')}" />
    <g:javascript src="jquery.min.js" />
    <g:javascript src="bootstrap.min.js" />


    <g:layoutHead />

</head>

<body>
%{--<div class="blog-masthead">
    <div class="container">
        <nav class="blog-nav">
            <div class="blog-nav-item active" >Link Sharing</div>
            <g:link controller="userManagement" action="getUserProfile" id="getProfile" class="blog-nav-item" > Update Profile</g:link>

            <g:form controller="logout" class="blog-nav-item">
                <g:submitButton name="logout" value="Logout" />
            </g:form>

            <g:link controller="resource" action="getCreateTopicView" id="topicView" class="blog-nav-item" > Create Topic</g:link>

            <a class="blog-nav-item" href="http://getbootstrap.com/examples/blog/#">New hires</a>
            <a class="blog-nav-item" href="http://getbootstrap.com/examples/blog/#">About</a>
        </nav>
    </div>
</div>--}%


<div class="bs-component">
    <nav class="navbar navbar-default">
        <div class="container-fluid">
            <div class="navbar-header">
                <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <a class="navbar-brand" href="index.html#">Brand</a>
            </div>

            <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                <ul class="nav navbar-nav">
                    <li><g:link controller="resource" action="getCreateTopicView" id="topicView" > Create Topic</g:link></li>
                    <li class="active"><li><g:link controller="resource" action="getShareLinkResourceView" id="shareLinkResource" > Share Link Resource</g:link></li></li>
                    <li class="active"><li><g:link controller="resource" action="getShareDocumentResourceView" id="shareDocResource" > Share Document Resource</g:link></li></li>
                    <li class="dropdown">
                        <a href="index.html#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-expanded="false">Dropdown <span class="caret"></span></a>
                        <ul class="dropdown-menu" role="menu">
                            <li><g:link controller="userManagement" action="getUserProfile" id="getProfile"> Update Profile</g:link></li>
                            <li><a href="index.html#">Another action</a></li>
                            <li><a href="index.html#">Something else here</a></li>
                            <li class="divider"></li>
                            <li><a href="index.html#">Separated link</a></li>
                            <li class="divider"></li>
                            <li><g:form controller="logout" class="blog-nav-item">
                                <g:submitButton class=".btn-link" name="logout" value="Logout" />
                            </g:form></li>
                        </ul>
                    </li>
                </ul>
                <form class="navbar-form navbar-left" role="search">
                    <div class="form-group">
                        <input type="text" class="form-control" placeholder="Search">
                    </div>
                    <button type="submit" class="btn btn-default">Submit</button>
                </form>
                <ul class="nav navbar-nav navbar-right">
                    <li><img src="${createLink(controller:'commoan', action:'avatar')}" style="height: 75px;width: 75px;"/></li>
                    <li><a href="index.html#">Link</a></li>

                </ul>
            </div>
        </div>
    </nav>
</div>
<g:layoutBody />

</body>
</html>