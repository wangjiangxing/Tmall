<%@ page language="java" import="java.util.*" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
     <%@ page import="AdminAction.AdminCategoryAction" %>
     <%@ page import="AdminDao.CategoryDao" %>
    <%@taglib prefix="s" uri="/struts-tags"%> 
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html> 
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<link rel="stylesheet" href="http://localhost:8080/tmall/bootstrap/3.3.6/bootstrap.min.css">  
	<script src="http://localhost:8080/tmall/bootstrap/jquery-2.1.1/jquery.min.js"></script>
	<script src="http://localhost:8080/tmall/bootstrap/3.3.6/bootstrap.min.js"></script>
<title>Insert title here</title>
</head>
<body>
<jsp:include page="../frame/text2"></jsp:include>	
<body>
<form class="form-horizontal" action="ProductModifyInsert.action"  role="form" method="post">
 <c:forEach var="fl" items="${requestScope.ProductList}">
 <br>商品号
			<input type="text"   name="SelectID"  value="${fl.id}" readonly="readonly"><br>
		商品名
			<input type="text"   name="mname"  value="${fl.name}"><br>
		副标题
			<input type="text"   name="msubTitle"  value="${fl.subTitle}"><br>
		原价
			<input type="text"   name="morignalPrice" value="${fl.orignalPrice}"><br>
		现价
			<input type="text"   name="mpromotePrice"  value="${fl.promotePrice}"><br>
		库存
			<input type="text"   name="mstock"  value="${fl.stock}"><br>
		生产日期
			<input type="text"   name="mcreateDate"  value="${fl.createDate}"><br>
</c:forEach>
	
	
	<div class="form-group">
		<div class="col-sm-offset-2 col-sm-10">
			<button type="submit" class="btn btn-default">修改</button>
		</div>
	</div>
	</form>
</body>
</html>