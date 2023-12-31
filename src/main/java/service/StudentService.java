package service;

import dao.bean.Student;

import java.util.List;

public interface StudentService {
    public boolean isMember(String un, String pwd); //是否为会员？
    //public void updateStudent(User user);

    // 保存用户
    //public boolean saveUser(User user);

    // 查询所有用户信息
    public List<Student> queryAll();

    // 删除用户
    public boolean deleteUser(String un);

    //boolean deleteUser(User user);
}
