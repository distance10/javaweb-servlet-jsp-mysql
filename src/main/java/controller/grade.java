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
import dao.bean.score;
import dao.utils.MyDb;
@SuppressWarnings({"all"})
@WebServlet("/grade")
public class grade extends HttpServlet {
    private static final long serialVersionUID = 1L;
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //创建服务层实现类对象，以供控制层调用
        ResultSet rs = null;
        try {
            rs = MyDb.getMyDb().query("select * from score where name=?", LoginServlet.un);
            rs.next(); // 定位该会员所的记录
            score score = new score();
            score.setName(rs.getString("name"));
            score.setBiologyScore(rs.getInt("biology_score"));
            score.setChineseScore(rs.getInt("chinese_score"));
            score.setEnglishScore(rs.getInt("english_score"));
            score.setGeographyScore(rs.getInt("geography_score"));
            score.setHistoryScore(rs.getInt("history_score"));
            score.setMathScore(rs.getInt("math_score"));
            score.setPhysicsScore(rs.getInt("physics_score"));
            score.setScienceScore(rs.getInt("science_score"));
            request.setAttribute("score",score);
            request.getRequestDispatcher("/views/grade.jsp").forward(request, response);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        //请求转发，地址栏里的url不变,没有产生新的请求对象
        //request.getRequestDispatcher("/views/grade.jsp").forward(request, response);
        //request.getRequestDispatcher("/views/grade.jsp").forward(request, response);
    }
    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}