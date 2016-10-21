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

    <link rel="stylesheet" href="${resource(dir: 'css', file: 'common.css')}" />
<g:layoutHead />

</head>

<body>
%{--<div class="blog-masthead">
    <div class="container">
        <div row>
            <div class="input-group col-md-8" style="float: left;">
                <nav class="blog-nav">
                    <div class="blog-nav-item" >Link Sharing</div>
                </nav>
            </div>
            <div id="custom-search-input">
                <div class="input-group col-md-4">
                    <input type="text" class="  search-query form-control" placeholder="Search">
                    <span class="input-group-btn">
                        <button class="btn btn-default" type="button">
                            <span class=" glyphicon glyphicon-search"></span>
                        </button>
                    </span>
                </div>
            </div>
     </div>
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
                    <li class="active"><a href="index.html#">Link <span class="sr-only">(current)</span></a></li>
                    <li><a href="index.html#">Link</a></li>
                    <li class="dropdown">
                        <a href="index.html#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-expanded="false">Dropdown <span class="caret"></span></a>
                        <ul class="dropdown-menu" role="menu">
                            <li><a href="index.html#">Action</a></li>
                            <li><a href="index.html#">Another action</a></li>
                            <li><a href="index.html#">Something else here</a></li>
                            <li class="divider"></li>
                            <li><a href="index.html#">Separated link</a></li>
                            <li class="divider"></li>
                            <li><a href="index.html#">One more separated link</a></li>
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
                    <li><a href="index.html#">Link</a></li>
                </ul>
            </div>
        </div>
    </nav>
</div>
<g:layoutBody />

</body>
</html>

