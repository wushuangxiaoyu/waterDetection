<%@ page import="java.io.Writer" %><%--
  Created by IntelliJ IDEA.
  User: yu
  Date: 2017/9/20
  Time: 19:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page contentType="text/html;charset=UTF-8" isErrorPage="true"%>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<c:set var="basePath" value="${pageContext.request.contextPath}"/>
<!DOCTYPE html>
<html>
<head>
    <title>出错了！</title>
</head>
<body>
<% Exception e = null != exception ? (Exception) exception : (Exception)request.getAttribute("ex"); %>
<h2>错误: <%= e.getClass().getSimpleName()%></h2>
<hr />
<h5>错误描述：</h5>
<%= e.getMessage()%>
<h5>错误信息：</h5>
<pre>
<% e.printStackTrace(new java.io.PrintWriter(out)); %>
</pre>
</body>
</html>
