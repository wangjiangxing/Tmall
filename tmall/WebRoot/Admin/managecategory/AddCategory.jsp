<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8"> 
	<title>增加类别</title>
	<link rel="stylesheet" href="http://localhost:8080/tmall/bootstrap/3.3.6/bootstrap.min.css">  
	<script src="http://localhost:8080/tmall/bootstrap/jquery-2.1.1/jquery.min.js"></script>
	<script src="http://localhost:8080/tmall/bootstrap/3.3.6/bootstrap.min.js"></script>
</head>

<body>
<jsp:include page="../frame/text2"></jsp:include>
<form class="form-horizontal" action="categoryAdd.action"  role="form" method="post">
	<div class="form-group">
		<label for="firstname" class="col-sm-2 control-label">新的类别</label>
		<div class="col-sm-10">
			<input type="text" class="form-control" id="name" name="name"
				   placeholder="请输入新的类别名">
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