package service.imp;

import dao.StudentDao;
import dao.bean.Student;
import dao.bean.teacher;
import dao.imp.StudentDaoImp;
import dao.imp.teacherDaoImp;
import dao.teacherDao;
import service.teacherService;

import java.util.List;

public class teacherServiceImp implements teacherService {

    teacherDaoImp teacherDaoImp = new teacherDaoImp();

    @Override
    public boolean isMember(String un, String pwd) {
        return teacherDaoImp.isMember(un, pwd);
    }

    @Override
    public List<teacher> queryAll() {
        teacherDao teacherDaoImp = new teacherDaoImp();
        try {
            List<teacher> teacherList = teacherDaoImp.queryAll();
            System.out.println("在服务层输出从数据库查询到的"+teacherList.size()+"条技术文档记录");
            return teacherList;
            //return newsDaoImp.queryAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
