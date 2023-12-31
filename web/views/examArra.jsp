<%@page language="java" pageEncoding="UTF-8"%>
<title>学生登录</title>
<!-- 由于是转发页面里加载样式文件和js文件，因此，需要获取应用的根路径 -->
<link href="<%=request.getContextPath()%>/css/examArra.css" rel="stylesheet">
<script src="<%=application.getContextPath()%>/js/jquery-1.10.2.min.js" type="text/javascript"></script>
<script src="${pageContext.request.contextPath}/js/bootstrap.js" type="text/javascript"></script>
<style>
        th{
            background-color: #0080ff;
        }
        a {
            text-decoration: none;
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
        <p class="body_p1">学生信息</p>
        <hr>
        <div class="body_left">
            <ul>
                <a href="${pageContext.request.contextPath}/studentInformation"><li><br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;学籍信息</li></a>
                <a href="${pageContext.request.contextPath}/grade"><li><br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;成绩查询</li></a>
                <a href="${pageContext.request.contextPath}/timetable"><li><br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;课程表</li></a>
                <a href="${pageContext.request.contextPath}/examArra"> <li class="li_1"><br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;考试安排</li></a>
                <a href="${pageContext.request.contextPath}/LoginServlet"> <li><br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;退出</li></a>
            </ul>
        </div>
        <div class="body_right">
            <div class="container">
                <table>
                    <tr>
                        <th>科目</th>
                        <th>日期</th>
                        <th>地点</th>
                    </tr>
                    <tr>
                        <td>数学</td>
                        <td>${exam.math_exam_time}</td>
                        <td>${exam.math_exam_location}</td>
                    </tr>
                    <tr>
                        <td>英语</td>
                        <td>${exam.english_exam_time}</td>
                        <td>${exam.english_exam_location}</td>
                    </tr>
                    <tr>
                        <td>物理</td>
                        <td>${exam.physics_exam_time}</td>
                        <td>${exam.physics_exam_location}</td>
                    </tr>
                    <tr>
                        <td>语文</td>
                        <td>${exam.physics_exam_time}</td>
                        <td>${exam.physics_exam_location}</td>
                    </tr>
                    <tr>
                        <td>生物</td>
                        <td>${exam.physics_exam_time}</td>
                        <td>${exam.physics_exam_location}</td>
                    </tr>
                    <tr>
                        <td>历史</td>
                        <td>${exam.physics_exam_time}</td>
                        <td>${exam.physics_exam_location}</td>
                    </tr>
                    <tr>
                        <td>化学</td>
                        <td>${exam.physics_exam_time}</td>
                        <td>${exam.physics_exam_location}</td>
                    </tr>
                    <tr>
                        <td>政治</td>
                        <td>${exam.physics_exam_time}</td>
                        <td>${exam.physics_exam_location}</td>
                    </tr>
                </table>
            </div>
        </div>

    </div>
</div>
