<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<c:set var="ctx" value="${pageContext.request.contextPath}" />
<title>添加用户信息</title>
</head>
<body>
<form id="addUserForm" method="post" action="${ctx}/user/addUser">
	<table>
		<tr><td>姓名：<input id="name" name="name" type="text" value="" /></td></tr>
		<tr><td>年龄：<input id="age" name="age" type="text" value="" /></td></tr>
		<tr><td><input id="submit" type="submit" value="提交" onclick="addUser();" /></td></tr>
	</table>
</form>
<script src="${ctx }/js/jquery/jquery-1.9.1.min.js"></script>
<script type="text/javascript">
var ctx = "${ctx}";
function addUser(){
	var url_path = ctx+"/user/addUser";
	$.ajax({
		url: url_path,
		type:'POST',
		data:$("#addUserForm").serialize(),
		success:function(res){
			alert("成功");
		}
	});
}
</script>
</body>
</html>