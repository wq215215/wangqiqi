<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
 <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!-- 写一个变量 -->
<c:set var="path" value="${pageContext.request.contextPath}" scope="page"/>
<!-- 引入css样式 -->
<link rel="stylesheet" type="text/css" href="${path}/resource/css/css.css"/>
<!-- 引入jquery插件 -->
<script type="text/javascript" src="${path}/resource/jquery/jquery-3.2.1.js"></script>
<!-- 引入js文件 -->
<script type="text/javascript" src="${path}/resource/js/list.js"></script>
</head>
<body>
  <table>
  	<tr>
  		<td>编号</td>
  		<td>用户姓名</td>
  		<td>密码</td>
  		<td>操作</td>
  		 
  	</tr>
  	<c:forEach items="${list}" var="b">
  		<tr>
	  		<td>${b.id}</td>
	  		<td>${b.username}</td>
	  		<td>${b.password}</td>
	  		<td>
	  			<input type="button" value="添加">
	  			<input type="button" value="删除">
	  			<input type="button" value="修改">
	  		</td>
  		 
  	  </tr>
  		
  	</c:forEach>
  </table>
</body>
</html>