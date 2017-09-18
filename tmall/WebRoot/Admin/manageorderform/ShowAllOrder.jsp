<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <%@taglib prefix="s" uri="/struts-tags"%>  
   
<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8"> 
	<title>订单表</title>
	<link rel="stylesheet" href="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/css/bootstrap.min.css">  
	<script src="http://cdn.static.runoob.com/libs/jquery/2.1.1/jquery.min.js"></script>
	<script src="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>
<jsp:include page="../frame/text2"></jsp:include>
<table class="table table-striped">
	<caption style="text-align:center">订单表</caption>
	<thead>
		<tr>
		<th>订单ID</th>
			<th>用户ID</th>
			<th>产品ID</th>
			<th>订单状态</th>
		</tr>
	</thead>
	<tbody>
	<s:iterator value="#request.orderList" id="orderlist" status="status">  
		<tr align="center">
			<th><s:property value="#orderlist.id"/></th>
			<th><s:property value="#orderlist.uid"/></th>
			<th><s:property value="#orderlist.pid"/></th>
			<th><s:property value="#orderlist.status"/></th>
		</tr>
		</s:iterator> 
	</tbody>
</table>
</body>
</html>