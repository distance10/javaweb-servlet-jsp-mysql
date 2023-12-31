package controller;
/**
 *  添加 用户
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
@WebServlet("/addstudent")
public class addstudent extends HttpServlet {
    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        req.setCharacterEncoding("utf8");  //在Servlet程序里，当接收请求参数（表单元素）里含有中文时必须使用
        Student student = new Student();
        student.setName(req.getParameter("name"));
        student.setGender(req.getParameter("gender"));
        student.setStudent_id(req.getParameter("student_id"));
        student.setDepartment(req.getParameter("department"));
        student.setMajor(req.getParameter("major"));
        student.setPassword(123456);//新用户默认密码为 ：123456
        System.out.println(student);
        try {
            MyDb.getMyDb().cud("INSERT INTO student VALUES (?,?,?,?,?,?)",
                    student.getName(), student.getGender(), student.getStudent_id(),
                    student.getDepartment(), student.getMajor(), "123456");
            req.setAttribute("message","修改成功");
            req.getRequestDispatcher("studentmanageServlet").forward(req, resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}