package dao;

import dao.bean.Student;
import dao.bean.teacher;

import java.util.List;

public interface teacherDao {
    boolean isMember(String un, String pwd); //是否为会员？
    List<teacher> queryAll();  //查询所有用户
    teacher queryOne(String un);  //根据主键查找
}
