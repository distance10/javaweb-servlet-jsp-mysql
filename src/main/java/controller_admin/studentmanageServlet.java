package controller_admin;

import java.io.IOException;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import controller.LoginServlet;
import dao.bean.Student;
import dao.imp.StudentDaoImp;
import dao.utils.MyDb;
import service.imp.StudentServiceImp;
@SuppressWarnings({"all"})
@WebServlet("/studentmanageServlet")
public class studentmanageServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        StudentServiceImp studentServiceImp = new StudentServiceImp();
        String un=req.getParameter("un"); //获取GET请求传参
        if(un != null){   //如果传递了用户名
            studentServiceImp.deleteUser(un);   //删除
        }
        try {
            String sql = "select * from student";
            ResultSet rs = null;  //记录
            rs = MyDb.getMyDb().query(sql);  //记录
            List<Student> studentlist = new ArrayList<>();
            System.out.println("执行...");
            while (rs.next()) {
                Student student = new Student();
                student.setName(rs.getString("name"));
                student.setStudent_id(rs.getString("student_id"));
                student.setGender(rs.getString("gender"));
                student.setDepartment(rs.getString("department"));
                student.setPassword(rs.getInt("password"));
                student.setMajor(rs.getString("major"));
                System.out.println(student.toString());
                studentlist.add(student);
            }
            req.setAttribute("studentlist", studentlist); // 转发记录
            System.out.println(studentlist);
            req.getRequestDispatcher("views/admin/studentlist.jsp").forward(req, resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req, resp);
    }
}
