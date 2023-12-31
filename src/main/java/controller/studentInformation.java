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
import dao.imp.StudentDaoImp;
import dao.utils.MyDb;

@SuppressWarnings({"all"})
@WebServlet("/studentInformation")
public class studentInformation extends HttpServlet {
    private static final long serialVersionUID = 1L;
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        StudentDaoImp studentDaoImp = new StudentDaoImp();
//        Student student_ = studentDaoImp.queryOne(LoginServlet.un);

        ResultSet rs = null;
        try {
            rs = MyDb.getMyDb().query("select * from student where name=?", LoginServlet.un);
            rs.next(); // 定位该会员所的记录
            Student student = new Student();
            student.setName(rs.getString("name"));
            student.setStudent_id(rs.getString("student_id"));
            student.setGender(rs.getString("gender"));
            student.setDepartment(rs.getString("department"));
            student.setPassword(rs.getInt("password"));
            student.setMajor(rs.getString("major"));
            request.setAttribute("student",student);
            request.getRequestDispatcher("/views/Information.jsp").forward(request, response);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}