package controller;

import java.io.IOException;
import java.sql.ResultSet;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import dao.bean.Student;
import dao.bean.teacher;
import dao.imp.StudentDaoImp;
import dao.utils.MyDb;
@SuppressWarnings({"all"})
@WebServlet("/teacherAdmin")
public class teacherAdmin extends HttpServlet {
    private static final long serialVersionUID = 1L;
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        StudentDaoImp studentDaoImp = new StudentDaoImp();
//        Student student_ = studentDaoImp.queryOne(LoginServlet.un);

        ResultSet rs = null;
        try {
            rs = MyDb.getMyDb().query("select * from teacherAdmin where name=?", LoginServlet.un);
            rs.next(); // 定位该会员所的记录
            teacher teacher = new teacher();

            //Student student = new Student();
            teacher.setName(rs.getString("name"));
            teacher.setTeacher_id(rs.getString("teacher_id"));
            teacher.setGender(rs.getString("gender"));
            teacher.setDepartment(rs.getString("department"));
            teacher.setBirthday(rs.getString("birthday"));
            teacher.setMajor(rs.getString("major"));
            request.setAttribute("teacher",teacher);
            request.getRequestDispatcher("/views/Information2.jsp").forward(request, response);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}