<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <%@taglib prefix="s" uri="/struts-tags"%>  
   
<!DOCTYPE html>
<html>
<head>
<script type="text/javascript">
function checkid(){
if(submitId.SelectID.value==""){
alert("没有输入查询Id");
document.submitId.SelectID.focus();
return ;
}
else{
document.submitId.submit();
}
}
function checkname(){
if(submitName.SelectName.value==""){
alert("没有输入查询商品名");
document.submitName.SelectName.focus();
return ;
}
else{
document.submitName.submit();
}
}

</script>
	<meta charset="utf-8"> 
	<title>Bootstrap </title>
	<link rel="stylesheet" href="http://localhost:8080/tmall/bootstrap/3.3.6/bootstrap.min.css">  
	<script src="http://localhost:8080/tmall/bootstrap/jquery-2.1.1/jquery.min.js"></script>
	<script src="http://localhost:8080/tmall/bootstrap/3.3.6/bootstrap.min.js"></script>
</head>
<body>
<jsp:include page="../frame/text2"></jsp:include>
<form action="ProductList1.action" name="submitId" id="submitId">
<div class="form-group"><br>
		<label for="firstname" class="col-sm-2 control-label">商品ID</label>
		<div class="col-sm-10">
			<input type="text" class="form-control"  name="SelectID"
				   placeholder="请输入查询商品的ID">
				   <input type="button" value="查询" onclick="checkid()">
		</div>
	</div>
	</form>
	<form action="ProductList2.action" name="submitName" id="submitName">
	<div class="form-group"><br>
		<label for="firstname" class="col-sm-2 control-label">商品名</label>
		<div class="col-sm-10">
			<input type="text" class="form-control"  name="SelectName"
				   placeholder="请输入新商品">
				   <input type="button" value="查询" onclick="checkname()">
		</div>
	</div>
	</form>
	<table class="table table-striped">
	<caption style="text-align:center">商品表</caption>
	<thead>
		<tr>
			<th>ID</th>
			<th>商品名</th>
			<th>副标题</th>
			<th>原价</th>
			<th>现价</th>
			<th>库存量</th>
			<th>生产日期</th>
			<th >操作</th>
		</tr>
	</thead>
	<tbody>
	<s:iterator value="#request.ProductList" id="myproductlist" status="status">  
		<tr align="center">
			<th><s:property value="#myproductlist.id"/></th>
			<th><s:property value="#myproductlist.name"/></th>
			<th><s:property value="#myproductlist.subTitle"/></th>
			<th><s:property value="#myproductlist.orignalPrice"/></th>
			<th><s:property value="#myproductlist.promotePrice"/></th>
			<th><s:property value="#myproductlist.stock"/></th>
			<th><s:property value="#myproductlist.createDate"/></th>
			<th><a href="ProductDelete.action?id=<s:property value="id"/>">删除</a></th>
		</tr>
		</s:iterator> 
	</tbody>
	</table>
</body>
</html>