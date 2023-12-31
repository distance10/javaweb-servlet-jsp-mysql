<%--
  Created by IntelliJ IDEA.
  User: wuche
  Date: 2023/11/27
  Time: 1:20
  To change this template use File | Settings | File Templates.
--%>
<%@page language="java" pageEncoding="UTF-8"%>
<title>教师登录</title>
<!-- 由于是转发页面里加载样式文件和js文件，因此，需要获取应用的根路径 -->
<link href="<%=request.getContextPath()%>/css/login.css" rel="stylesheet">
<script src="<%=application.getContextPath()%>/js/jquery-1.10.2.min.js" type="text/javascript"></script>
<script src="${pageContext.request.contextPath}/js/bootstrap.js" type="text/javascript"></script>
<style>
    img {
        width: 280px;
        height: 370px;
    }
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
            <a href="${pageContext.request.contextPath}/LoginServlet"><p class="header_2">网站首页 &gt;</p></a>
        </div>

    </div>

    <div class="body1">
        <p class="body_p1">教师信息</p>
        <hr>
        <div class="body_left">
            <ul>
                <a href="${pageContext.request.contextPath}/teacherAdmin"><li class="li_1"><br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;个人信息</li></a>
                <a href="${pageContext.request.contextPath}/studentmanageServlet"><li><br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;学生管理</li></a>
                <a href="${pageContext.request.contextPath}/views/addstudent.jsp"><li><br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;添加学生</li></a>
                <a href="${pageContext.request.contextPath}/examArra"> <li><br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</li></a>
                <a href="${pageContext.request.contextPath}/LoginServlet"> <li><br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;退出</li></a>

            </ul>
        </div>
        <div class="body_right">
            <div class="body_right_left">
                <img src="images/${teacher.teacher_id}.jpg">
            </div>
            <div class="body_right_right">
                <ul class="body_ul" >
                    <li class="body_li"><br>&nbsp;&nbsp;&nbsp;姓名 :&nbsp;&nbsp;&nbsp;<a href="">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;${teacher.name}</a></li>
                    <li class="body_li"><br>&nbsp;&nbsp;&nbsp;性别 :&nbsp;&nbsp;&nbsp;<a href="">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;${teacher.gender}</a></li>
                    <li class="body_li"><br>&nbsp;&nbsp;&nbsp;学号 :&nbsp;&nbsp;&nbsp;<a href="">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;${teacher.teacher_id}</a></li>
                    <li class="body_li"><br>&nbsp;&nbsp;&nbsp;院系 :&nbsp;&nbsp;&nbsp;<a href="">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;${teacher.department}</a></li>
                    <li class="body_li"><br>&nbsp;&nbsp;&nbsp;专业 :&nbsp;&nbsp;&nbsp;<a href="">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;${teacher.major}</a></li>
                </ul>
            </div>
        </div>

    </div>
</div>