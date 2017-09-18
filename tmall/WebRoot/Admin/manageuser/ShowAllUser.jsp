<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <%@taglib prefix="s" uri="/struts-tags"%>  
   
<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8"> 
	<title>Bootstrap 实例 - 条纹表格</title>
	<link rel="stylesheet" href="http://localhost:8080/tmall/bootstrap/3.3.6/bootstrap.min.css">  
	<script src="http://localhost:8080/tmall/bootstrap/jquery-2.1.1/jquery.min.js"></script>
	<script src="http://localhost:8080/tmall/bootstrap/3.3.6/bootstrap.min.js"></script>
</head>
<body>
<jsp:include page="../frame/text2"></jsp:include>
<table class="table table-striped">
	<caption style="text-align:center">用户表</caption>
	<thead>
		<tr>
			<th>ID</th>
			<th>姓名</th>
			<th>密码</th>
			<th>会员等级</th>
			<th>金币余额</th>
			<th>操作</th>
		</tr>
	</thead>
	<tbody>
	<s:iterator value="#request.Userlist" id="myuserlist" status="status">  
		<tr align="center">
			<th><s:property value="#myuserlist.id"/></th>
			<th><s:property value="#myuserlist.name"/></th>
			<th><s:property value="#myuserlist.password"/></th>
			<th><s:property value="#myuserlist.level"/></th>
			<th><s:property value="#myuserlist.goldcoin_amount"/></th>
			<th><a href="UserDelete.action?id=<s:property value="id"/>">删除</a></th>
		</tr>
		</s:iterator> 
	</tbody>
</table>
</body>
</html>