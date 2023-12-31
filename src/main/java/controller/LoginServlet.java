package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.StudentDao;
import dao.imp.StudentDaoImp;
import service.StudentService;
import service.imp.StudentServiceImp;
import service.imp.teacherServiceImp;
import service.teacherService;
@SuppressWarnings({"all"})
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	public static String un;
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		request.setCharacterEncoding("utf8");  //按照utf-8编码格式接受数据，防止中文乱码
		//接收表单提交的信息
		un=request.getParameter("name");
		System.out.println(un);
		String pwd=request.getParameter("password");
		System.out.println(pwd);
		StudentService studentService = new StudentServiceImp();
		teacherService teacherService = new teacherServiceImp();
		//UserService userServiceImp = new UserServiceImp();  //创建服务层实现类对象
		if(studentService.isMember(un,pwd)){   //调用服务接口方法
			//HttpSession session = request.getSession();
			//session.setAttribute("name", un);  //设置会话
			response.sendRedirect("studentInformation"); //重定向到主控制器
		} else if (teacherService.isMember(un, pwd)) {

			response.sendRedirect("teacherAdmin");

		} else{
			if (un == null) {
				response.sendRedirect("HomeServlet"); //重定向到主控制器

			}else {
				request.setAttribute("message", "用户名或密码错误!"); //属性设置,向请求页面传参
				//转发
				request.getRequestDispatcher("/views/public/forget.jsp").forward(request, response);
			}
		}
	}
}
