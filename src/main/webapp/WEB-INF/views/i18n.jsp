<%@ page language="java" contentType="text/html; charset=UTF-8"
  pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">

<title>Spring MVC, Internationliaztion-i18n</title>
</head>
<body>
    <h1>Spring MVC internationalization</h1>
    Language :
    <a href="?language=en">English</a>|
    <a href="?language=vi_VN">Vietnamese</a>|
    <a href="?language=ja_JP">Japanese</a>
    <h2>
        hello :
        <spring:message code="hello" text="default text" />
    </h2>

    Current Locale : ${pageContext.response.locale}
</body>
</html>