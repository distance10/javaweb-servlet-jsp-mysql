package dao;

import dao.bean.Student;

import java.util.List;

public interface StudentDao {
    boolean isMember(String un, String pwd); //是否为会员？
    List<Student> queryAll();  //查询所有用户
    Student queryOne(String un);  //根据主键查找
    int updateUser(Student student); //根据用户名和密码查询
    boolean addMember(Student student);  //插入记录
    boolean deleteMem(String un); //根据主键删除
}
