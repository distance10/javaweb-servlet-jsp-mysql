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
                <a href="${pageContext.request.contextPath}/timetable"><li class="li_1"><br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;课程表</li></a>
                <a href="${pageContext.request.contextPath}/examArra"> <li><br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;考试安排</li></a>
                <a href="${pageContext.request.contextPath}/LoginServlet"> <li><br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;退出</li></a>
            </ul>
        </div>
        <div class="body_right">

            <table>
                <tr>
                    <th>时间</th>
                    <th>周一</th>
                    <th>周二</th>
                    <th>周三</th>
                    <th>周四</th>
                    <th>周五</th>
                </tr>
                <tr>
                    <td>8:00-9:00</td>
                    <td>数学</td>
                    <td>英语</td>
                    <td>音乐</td>
                    <td>体育</td>
                    <td>化学</td>
                </tr>
                <tr>
                    <td>9:00-10:00</td>
                    <td>语文</td>
                    <td>历史</td>
                    <td>地理</td>
                    <td>数学</td>
                    <td>物理</td>
                </tr>
                <tr>
                    <td>10:00-11:00</td>
                    <td>英语</td>
                    <td>美术</td>
                    <td>体育</td>
                    <td>化学</td>
                    <td>生物</td>
                </tr>
                <tr>
                    <td>11:00-14:00</td>
                    <td>午休</td>
                    <td>午休</td>
                    <td>午休</td>
                    <td>午休</td>
                    <td>午休</td>
                </tr>
                <tr>
                    <td>14:00-16:00</td>
                    <td>英语</td>
                    <td>美术</td>
                    <td>体育</td>
                    <td>化学</td>
                    <td>生物</td>
                </tr>
                <tr>
                    <td>16:00-18:00</td>
                    <td>英语</td>
                    <td>美术</td>
                    <td>体育</td>
                    <td>化学</td>
                    <td>生物</td>
                </tr>
                <tr>
                    <td>18:00-20:00</td>
                    <td>英语</td>
                    <td>美术</td>
                    <td>体育</td>
                    <td>化学</td>
                    <td>生物</td>
                </tr>
                <tr>
                    <td>20:00-22:00</td>
                    <td>英语</td>
                    <td>美术</td>
                    <td>体育</td>
                    <td>化学</td>
                    <td>生物</td>
                </tr>
            </table>
        </div>
    </div>
</div>