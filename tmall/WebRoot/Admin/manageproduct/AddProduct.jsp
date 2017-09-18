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
<form class="form-horizontal" action="AddProduct2.action"  role="form" method="post" enctype="multipart/form-data">
	<div class="form-group"><br>
		<label for="firstname" class="col-sm-2 control-label">商品名</label>
		<div class="col-sm-10">
			<input type="text" class="form-control"  name="name"
				   placeholder="请输入新的商品名">
		</div>
	</div>
	<div class="form-group">
		<label for="firstname" class="col-sm-2 control-label">副标题名</label>
		<div class="col-sm-10">
			<input type="text" class="form-control"  name="subTitle"
				   placeholder="请输入新的副标题名">
		</div>
	</div>
	<div class="form-group">
		<label for="firstname" class="col-sm-2 control-label">原价</label>
		<div class="col-sm-10">
			<input type="text" class="form-control"  name="orignalPrice"
				   placeholder="请输入新商品的原价">
		</div>
	</div>
	<div class="form-group">
		<label for="firstname" class="col-sm-2 control-label">现价</label>
		<div class="col-sm-10">
			<input type="text" class="form-control"  name="promotePrice"
				   placeholder="请输入新商品的现价">
		</div>
	</div>
	<div class="form-group">
		<label for="firstname" class="col-sm-2 control-label">商品类别</label>
		<div class="col-sm-10">
      <select name='category_name' style='width:80px'>
      <option value="0">--请选择--</option>
      <c:forEach var="fl" items="${requestScope.Categorylist}">
      <option value="${fl.id}">${fl.name}</option>
      </c:forEach>
       </select>
		</div>
	</div>
	<div class="form-group">
		<label for="firstname" class="col-sm-2 control-label">库存</label>
		<div class="col-sm-10">
			<input type="text" class="form-control" id="name" name="stock"
				   placeholder="请输入新商品的库存">
		</div>
	</div>
	<div class="form-group">
		<label for="firstname" class="col-sm-2 control-label">生产日期</label>
		<div class="col-sm-10">
			<input type="text" class="form-control"  name="createDate"
				   placeholder="请输入商品生产日期，格式为年-月-日">
		</div>
	</div>
	
	
	
	<div class="form-group">
		<div class="col-sm-offset-2 col-sm-10">
			<button type="submit" class="btn btn-default">增加</button>
		</div>
	</div>
	</form>
</body>
</html>