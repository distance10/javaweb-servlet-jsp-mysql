<%@page language="java" pageEncoding="UTF-8"%>
<title>添加学生</title>
<!-- 由于是转发页面里加载样式文件和js文件，因此，需要获取应用的根路径 -->
<link href="<%=request.getContextPath()%>/css/addstudent.css" rel="stylesheet">
<script src="<%=application.getContextPath()%>/js/jquery-1.10.2.min.js" type="text/javascript"></script>
<script src="${pageContext.request.contextPath}/js/bootstrap.js" type="text/javascript"></script>
<style>
</style>
<body>
<form action="${pageContext.request.contextPath}/addstudent" method="post">
    <h1>添加学生</h1>
    <div>
        <p for="student_name">姓名：</p>
        <input type="text" id="name" name="name" required>
    </div>
    <div>
        <p for="gender">性别：</p>
        <select id="gender" name="gender" required>
            <option value="" name="gender">请选择</option>
            <option value="男">男</option>
            <option value="女">女</option>
        </select>
    </div>
    <div>
        <p for="student_id">学号：</p>
        <input type="text" id="student_id" name="student_id" required>
    </div>
    <div>
        <p for="department">院系：</p>
        <input type="text" id="department" name="department" required>
    </div>
    <div>
        <p for="major">专业：</p>
        <input type="text" id="major" name="major" required>
    </div>
    <div>
        <input type="submit" value="添加学生">
    </div>
</form>
</body>
