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
import dao.bean.exam;
import dao.utils.MyDb;
@SuppressWarnings({"all"})
@WebServlet("/examArra")
public class examArra extends HttpServlet {
    private static final long serialVersionUID = 1L;
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ResultSet rs = null;
        try {
            rs = MyDb.getMyDb().query("select * from exam_schedule");
            rs.next(); // 定位该会员所的记录
            exam exam = new exam();
            exam.setChinese_exam_location(rs.getString("chinese_exam_location"));
            exam.setChinese_exam_time(rs.getString("chinese_exam_time"));
            exam.setMath_exam_location(rs.getString("math_exam_location"));
            exam.setMath_exam_time(rs.getString("math_exam_time"));
            exam.setPhysics_exam_location(rs.getString("physics_exam_location"));
            exam.setPhysics_exam_time(rs.getString("physics_exam_time"));
            exam.setEnglish_exam_location(rs.getString("english_exam_location"));
            exam.setEnglish_exam_time(rs.getString("english_exam_time"));
            request.setAttribute("exam",exam);
            System.out.println(exam.toString());
            request.getRequestDispatcher("/views/examArra.jsp").forward(request, response);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}