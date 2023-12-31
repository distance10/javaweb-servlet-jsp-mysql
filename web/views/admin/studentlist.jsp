<%@page language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<title>教师登录</title>
<!-- 由于是转发页面里加载样式文件和js文件，因此，需要获取应用的根路径 -->
<link href="<%=request.getContextPath()%>/css/login.css" rel="stylesheet">
<script src="<%=application.getContextPath()%>/js/jquery-1.10.2.min.js" type="text/javascript"></script>
<script src="${pageContext.request.contextPath}/js/bootstrap.js" type="text/javascript"></script>
<style>
    table {
        width: 100%;
        border-collapse: collapse;
    }
    td {
        border: 1px solid black;
        padding: 8px;
        text-align: center;
    }
    th{
        background-color: #0080ff;
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
                <a href="${pageContext.request.contextPath}/teacherAdmin"><li><br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;个人信息</li></a>
                <a href="${pageContext.request.contextPath}/studentmanageServlet"><li class="li_1"><br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;学生管理</li></a>
                <a href="${pageContext.request.contextPath}/views/addstudent.jsp"><li><br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;添加学生</li></a>
                <a href="${pageContext.request.contextPath}/examArra"> <li><br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</li></a>
                <a href="${pageContext.request.contextPath}/LoginServlet"> <li><br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;退出</li></a>
            </ul>
        </div>
        <div class="body_right">
            <table>
                <thead>
                <tr>
                    <th>姓名</th>
                    <th>性别</th>
                    <th>学号</th>
                    <th>院系</th>
                    <th>专业</th>
                    <th>删除</th>
                </tr>
                </thead>
                <c:forEach items="${studentlist}" var="student">
                    <tr>
                        <td>${student.name}</td>
                        <td>${student.gender}</td>
                        <td>${student.student_id}</td>
                        <td>${student.department}</td>
                        <td>${student.major}</td>
                        <td><a href="${pageContext.request.contextPath}/studentmanageServlet?un=${student.name }"
                               onclick="return window.confirm('Are you sure?')">删除</a></td>
                    </tr>
                </c:forEach>
            </table>
        </div>

    </div>
</div>