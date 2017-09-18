<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <%@taglib prefix="s" uri="/struts-tags"%>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" href="http://localhost:8080/tmall/bootstrap/3.3.6/bootstrap.min.css">  
	<script src="http://localhost:8080/tmall/bootstrap/jquery-2.1.1/jquery.min.js"></script>
	<script src="http://localhost:8080/tmall/bootstrap/3.3.6/bootstrap.min.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
<jsp:include page="../frame/text2"></jsp:include>
<div class="table-responsive">
	<table class="table">
		<caption style="text-align:center">类别表</caption>
		<thead>
			<tr>
				<th>ID</th>
				<th>类别</th>
				<th>操作</th>
			</tr>
		</thead>
		<tbody>
		<s:iterator value="#request.Categorylist" id="mycategorylist" status="status">
			<tr>
				<td><s:property value="#mycategorylist.id"/></td>
				<td><s:property value="#mycategorylist.name"/></td>
				<td><a href="categoryDelete.action?id=<s:property value="id"/>">删除</a></td>
			</tr>   
			</s:iterator>
	</tbody>
</table>
</div>  	
</body>
</html>