<%@page language="java" pageEncoding="UTF-8"%>
<title>学生登录</title>
<!-- 由于是转发页面里加载样式文件和js文件，因此，需要获取应用的根路径 -->
<link href="<%=request.getContextPath()%>/css/login.css" rel="stylesheet">
<script src="<%=application.getContextPath()%>/js/jquery-1.10.2.min.js" type="text/javascript"></script>
<script src="${pageContext.request.contextPath}/js/bootstrap.js" type="text/javascript"></script>
<style>
	button{
		background-color: #ffffff;
		width: 300px;
		height: 30px;
		margin-left: 100px;
		margin-top: 30px;
		background-color: #10646f;
	}
</style>
<div class="body">
	<div class="header">
		<div class="header_left">
			<img class="header_img" src="images/logoOn.png"  alt="">
		</div>
		<div class="header_center">
			<a><p class="header_1">学生工作部</p></a>
		</div>
		<div class="header_right">
			<a href="${pageContext.request.contextPath}/LoginServlet"><p class="header_2">网站首页 &gt;</p></a>
		</div>
	</div>
	<div class="body1">
		<p class="body_p1">用户登录</p>
		<hr>
			<form class="body_left" method="post" action="${pageContext.request.contextPath}/LoginServlet">
				<input class="input_key" placeholder="用户名/手机号码" name="name" type="text" value="" />
				<input class="input_value" placeholder="密码" name="password" type="password" value="" />
				<button type="submit">登 录</button>
			</form>
		<div class="right">
			<br><br><br>
			<a href="${pageContext.request.contextPath}/views/public/forget.jsp" class="link">忘记密码？</a><br>
			<span>我不是学生？</span>
			<a href="${pageContext.request.contextPath}/teacherServlet" class="link" >教师登录</a>
		</div>
	</div>
</div>