<%@page language="java" pageEncoding="UTF-8"%>
<title>学生登录</title>
<!-- 由于是转发页面里加载样式文件和js文件，因此，需要获取应用的根路径 -->
<link href="<%=request.getContextPath()%>/css/forget.css" rel="stylesheet">
<script src="<%=application.getContextPath()%>/js/jquery-1.10.2.min.js" type="text/javascript"></script>
<script src="${pageContext.request.contextPath}/js/bootstrap.js" type="text/javascript"></script>
<style>
</style>
<form method="post" action="${pageContext.request.contextPath}/forget">
    <h1>忘记密码 - 修改密码</h1>
    <div>
        <label>用户名：</label>
        <input type="text" name="name" >
    </div>
    <div>
        <label >学号：</label>
        <input type="text" name="student_id" >
    </div>
    <div>
        <label >新密码：</label>
        <input type="password" name="password">
    </div>
    <div>
        <input type="submit" value="修改密码">
    </div>
</form>
