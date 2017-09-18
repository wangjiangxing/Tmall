<%@ page language="java" import="java.util.*" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
     <%@ page import="AdminAction.AdminCategoryAction" %>
     <%@ page import="AdminDao.CategoryDao" %>
    <%@taglib prefix="s" uri="/struts-tags"%> 
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html> 
<head>
<script type="text/javascript">
function f1(){
id1=document.form1.category_name.value;
document.form1.action="UploadServlet.do?category_name="+id1; 
}
</script>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<link rel="stylesheet" href="http://localhost:8080/tmall/bootstrap/3.3.6/bootstrap.min.css">  
	<script src="http://localhost:8080/tmall/bootstrap/jquery-2.1.1/jquery.min.js"></script>
	<script src="http://localhost:8080/tmall/bootstrap/3.3.6/bootstrap.min.js"></script>
<title>Insert title here</title>
</head>
<body>
<jsp:include page="../frame/text2"></jsp:include>	
<form class="form-horizontal"   name="form1" method="post" enctype="multipart/form-data">
	<div class="form-group">
		<label for="firstname" class="col-sm-2 control-label">商品号</label>
		<div class="col-sm-10">
      <select name="category_name" style='width:80px'>
      <option value="0">--请选择--</option>
      <c:forEach var="fl" items="${requestScope.ProductList}">
      <option value="${fl.id}">${fl.name}</option>
      </c:forEach>
       </select>
		</div>
	</div>
	<div class="form-group">
		<label for="firstname" class="col-sm-2 control-label">要上传的文件</label>
		<div class="col-sm-10">
			<input type="file" class="form-control"  name="Myfile"
				   placeholder="文件名">
		</div>
	</div>
	<div class="form-group">
		<div class="col-sm-offset-2 col-sm-10">
			<button type="submit" class="btn btn-default" onclick=" f1()">增加</button>
		</div>
	</div>
	</form>
</body>
</html>