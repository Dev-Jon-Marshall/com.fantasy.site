<%@ page contentType="text/html" pageEncoding="UTF-8" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
    <%--JQUERY--%>
    <c:url value="/webjars/jquery/2.1.4/jquery.min.js" var="jquery" />
        <script src="${jquery}"></script>
    <%--Bootstrap--%>
    <c:url value="/webjars/bootstrap/3.3.4/js/bootstrap.min.js" var="bootstrapJS" />
        <script src="${bootstrapJS}"></script>
    <%--Bootstrap CSS--%>
    <%--<link href="${contextPath}/static/css/bootswatch.min.css" rel="stylesheet">--%>
    <%--<link href="${contextPath}/static/css/fantasyfootball.css" rel="stylesheet">--%>
    <%--<c:url value="/webjars/bootstrap/3.3.4/css/bootstrap.min.css" var="bootstrapCSS" />--%>
    <%--<link href="${bootstrapCSS}" rel="stylesheet" media="screen">--%>



    <c:url value="/static/css/bootswatch.min.css" var="bootstrapCSS" />
        <link href="${bootstrapCSS}" rel="stylesheet" media="screen">
    <%--Custom JS--%>
    <c:url value="/static/js/common.js" var="common" />
        <script src="${common}"></script>



    <%--&lt;%&ndash;Custom CSS&ndash;%&gt;--%>
    <%--<c:url value="/static/css/fantasyfootball.css" var="bootstrapCUSTOM" />--%>
        <%--<link href="${bootstrapCUSTOM}" rel="stylesheet" media="screen">--%>

    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!--[if lt IE 9]>
    <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
    <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->

    <!-- Latest Sortable -->
    <%--<script src="//rubaxa.github.io/Sortable/Sortable.js"></script>--%>

    <title>Fantasy Football Application</title>
</head>

<body>