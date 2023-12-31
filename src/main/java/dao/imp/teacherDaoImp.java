package dao.imp;

import dao.bean.Student;
import dao.bean.teacher;
import dao.teacherDao;
import dao.utils.MyDb;

import java.sql.ResultSet;
import java.util.List;

public class teacherDaoImp implements teacherDao {
    @Override
    public boolean isMember(String name, String password) {
        try {
            ResultSet rs= MyDb.getMyDb().query("select * from teacherAdmin where name= ? and password = ? ",name,password);
            if(rs.next()){
                return true;  //是会员
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;  //不是会员
    }

    @Override
    public List<teacher> queryAll() {
        return null;
    }

    @Override
    public teacher queryOne(String name) {
        try {
            ResultSet rs=MyDb.getMyDb().query("select * from teacherAdmin where name=?",name);
            if(rs.next()){
                teacher teacher = new teacher();
                teacher.setName(name);
                return teacher;  //有会员
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;  //没有
    }
}
