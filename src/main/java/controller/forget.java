package controller;
/*
 * 更新记录
 */
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.bean.Student;
import dao.utils.MyDb;
@SuppressWarnings({"all"})
@WebServlet("/forget")
public class forget extends HttpServlet {
    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        req.setCharacterEncoding("utf8");  //在Servlet程序里，当接收请求参数（表单元素）里含有中文时必须使用
        Student student = new Student();
        student.setName(req.getParameter("name"));
        student.setPassword(Integer.parseInt(req.getParameter("password")));
        try {
            MyDb.getMyDb().cud("update student set password=? where name=?", student.getPassword(),student.getName());
            req.setAttribute("message","修改成功");
            req.getRequestDispatcher("views/mLogin.jsp").forward(req, resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}