package dao.imp;

import dao.StudentDao;
import dao.bean.Student;
import dao.utils.MyDb;

import javax.xml.registry.infomodel.User;
import java.sql.ResultSet;
import java.util.List;

public class StudentDaoImp implements StudentDao {
    @Override
    public boolean isMember(String name, String password) {
        try {
            ResultSet rs= MyDb.getMyDb().query("select * from student where name= ? and password = ? ",name,password);
            if(rs.next()){
                return true;  //是会员
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;  //不是会员
    }

    @Override
    public List<Student> queryAll() {
        return null;
    }

    @Override
    public Student queryOne(String name) {
        try {
            ResultSet rs=MyDb.getMyDb().query("select * from student where name=?",name);
            if(rs.next()){
                Student student = new Student();
                student.setName(name);
                return student;  //有会员
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;  //没有
    }

    @Override
    public int updateUser(Student student) {
        return 0;
    }

    public int updateUser(User user) {
        return 0;
    }

    @Override
    public boolean addMember(Student student){ //添加数据（用户）
        try {
            String sql="insert into student (name,gender,student_id,department,major,password) values(?,?,?,?,?,?)";
            Object[] paras=new Object[]{
                //user.getUsername(),user.getPassword(),user.getRealname(),user.getMobile(),user.getAge()
                student.getName(),student.getGender(),student.getStudent_id(),
                    student.getDepartment()
                    ,student.getMajor(),student.getPassword()
            };
            return MyDb.getMyDb().cud(sql,paras);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean deleteMem(String un) { //删除用户
        try {
            boolean yn = MyDb.getMyDb().cud("delete from Student where name=?",un);
            if(yn){
                return true;  //删除成功
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;  //删除失败
    }
}
