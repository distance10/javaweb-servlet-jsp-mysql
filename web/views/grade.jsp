<%@page language="java" pageEncoding="UTF-8"%>
<title>学生登录</title>
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
                <a href="${pageContext.request.contextPath}/grade"><li class="li_1"><br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;成绩查询</li></a>
                <a href="${pageContext.request.contextPath}/timetable"><li><br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;课程表</li></a>
                <a href="${pageContext.request.contextPath}/examArra"> <li><br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;考试安排</li></a>
                <a href="${pageContext.request.contextPath}/LoginServlet"> <li><br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;退出</li></a>
            </ul>
        </div>
        <div class="body_right">
            <table>
                <tr>
                    <th>课程号</th>
                    <th>课程名</th>
                    <th>课程属性</th>
                    <th>学分</th>
                    <th>成绩</th>
                    <th>绩点</th>
                </tr>
                <tr>
                    <td>001</td>
                    <td>数学</td>
                    <td>必修课</td>
                    <td>4</td>
                    <td>${score.mathScore}</td>
                    <td>4.0</td>
                </tr>
                <tr>
                    <td>002</td>
                    <td>英语</td>
                    <td>必修课</td>
                    <td>3</td>
                    <td>${score.englishScore}</td>
                    <td>3.5</td>
                </tr>
                <tr>
                    <td>003</td>
                    <td>物理</td>
                    <td>选修课</td>
                    <td>4</td>
                    <td>${score.physicsScore}</td>
                    <td>4.0</td>
                </tr>
                <tr>
                    <td>004</td>
                    <td>地理</td>
                    <td>选修课</td>
                    <td>3</td>
                    <td>${score.geographyScore}</td>
                    <td>3.7</td>
                </tr>

                <tr>
                    <td>005</td>
                    <td>语文</td>
                    <td>必修课</td>
                    <td>4</td>
                    <td>${score.chineseScore}</td>
                    <td>4.0</td>
                </tr>
                <tr>
                    <td>006</td>
                    <td>生物</td>
                    <td>必修课</td>
                    <td>3</td>
                    <td>${score.biologyScore}</td>
                    <td>3.5</td>
                </tr>
                <tr>
                    <td>007</td>
                    <td>科学</td>
                    <td>选修课</td>
                    <td>4</td>
                    <td>${score.scienceScore}</td>
                    <td>4.0</td>
                </tr>
                <tr>
                    <td>008</td>
                    <td>历史</td>
                    <td>选修课</td>
                    <td>3</td>
                    <td>${score.historyScore}</td>
                    <td>3.7</td>
                </tr>
            </table>
        </div>

    </div>
</div>