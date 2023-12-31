<%--
  Created by IntelliJ IDEA.
  User: wuche
  Date: 2023/11/27
  Time: 0:04
  To change this template use File | Settings | File Templates.
--%>
<%@page language="java" pageEncoding="UTF-8"%>
<title>教师登录</title>
<!-- 由于是转发页面里加载样式文件和js文件，因此，需要获取应用的根路径 -->
<link href="<%=request.getContextPath()%>/css/teacherLogin.css" rel="stylesheet">
<script src="<%=application.getContextPath()%>/js/jquery-1.10.2.min.js" type="text/javascript"></script>
<script src="${pageContext.request.contextPath}/js/bootstrap.js" type="text/javascript"></script>
<style>
</style>

<div class="body">
  <div class="header">
    <div class="header_left">
      <img class="header_img" src="images/logoOn.png" alt="">
    </div>
    <div class="header_center">
      <a><p class="header_1">学生工作部</p></a>
    </div>
    <div class="header_right">
      <a href="${pageContext.request.contextPath}/LoginServlet"><p class="header_2"> 网站首页 &gt;</p></a>
    </div>
  </div>

  <div class="body1">
    <p class="body_p1"> 教师登录 </p>
    <hr>

    <form class="body_left" method="post" action="${pageContext.request.contextPath}/LoginServlet" class="form">
      &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
      姓名:<input class="input_key" placeholder="教师姓名" name="name" type="text" value="" /><br>
      &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
      账号:<input class="input_value" placeholder="账号/电话号码" name="teacher_id" type="teacher_id" value="" /><br>
      &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
      密码:<input class="input_value" placeholder="密码" name="password" type="password" value="" />

      <button type="submit" class="botton">登 录</button>
    </form>

    <div class="right">
      <br><br><br>
      <a>  </a>
      <a class="link">忘记密码？</a><br>
      <span>我不是教师？</span><a href="${pageContext.request.contextPath}/studentServlet" class="link" >学生登录</a>

    </div>
  </div>
</div>