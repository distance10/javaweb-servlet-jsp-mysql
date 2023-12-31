package service.imp;

import dao.StudentDao;
import dao.bean.Student;
import dao.imp.StudentDaoImp;
import service.StudentService;

import java.util.List;

public class StudentServiceImp implements StudentService {

    StudentDaoImp studentDaoImp = new StudentDaoImp();

    @Override
    public boolean isMember(String un, String pwd) {
        return studentDaoImp.isMember(un, pwd);
    }

    @Override
    public List<Student> queryAll() {
        StudentDao studentDaoImp = new StudentDaoImp();

        try {
            List<Student> studentList = studentDaoImp.queryAll();
            System.out.println("在服务层输出从数据库查询到的"+studentList.size()+"条技术文档记录");
            return studentList;
            //return newsDaoImp.queryAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public boolean deleteUser(String un) {
        return studentDaoImp.deleteMem(un);
    }
}
