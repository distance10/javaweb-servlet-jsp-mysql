package service;

import dao.bean.Student;
import dao.bean.teacher;

import java.util.List;

public interface teacherService {
    public boolean isMember(String un, String pwd); //是否为会员？
    public List<teacher> queryAll();
}
