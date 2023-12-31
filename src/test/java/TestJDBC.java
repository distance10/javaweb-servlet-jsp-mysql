import dao.utils.MyDb;
import org.junit.Test;

import java.sql.ResultSet;

public class TestJDBC {
    @Test
    public void printUsers() throws  Exception{
        ResultSet users = MyDb.getMyDb().query("select * from user");
        while (users.next()){
            System.out.println(users.getString("username"));
        }
    }
    //其他方法
}
