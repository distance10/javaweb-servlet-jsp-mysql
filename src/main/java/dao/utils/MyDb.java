package dao.utils;
/**
 *
 * 改进的访问MySQL数据库的通用Java类MyDb
 * 在使用本类的程序里，不需要创建MyDb的实例对象，避免了对服务器的重复连接
 * 定义了一个获取MyDb实例对象的静态方法getMyDb()
 * 两个主要的支持参数式查询的方法：选择查询方法query()和操作查询方法cud()
 *
 * 与之前的工具类相比，增加了分页查询方法 ：
 * queryAllWithPage(String sql, Integer page, int pageSize,HttpServletRequest request, Object... args)，返回值类似为Pager
 */

import java.sql.*;
import javax.servlet.http.HttpServletRequest;  //协作接口，作为分页方法的参数类型
@SuppressWarnings({"all"})
public class MyDb { // 类定义
    private Connection conn = null; //
    private PreparedStatement pst = null; // 参数式查询必须
    private static MyDb mydb = null;
    // 单例模式：私有的构造方法，外部不能创建实例
    private MyDb() throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/memmana?serverTimezone=UTC&characterEncoding=utf-8";
        String username = "root";
        String password = "1234567890wcf.";
        conn = DriverManager.getConnection(url, username, password); // 创建连接对象
    }
    // 获取私有成员的Getter方法
    public static MyDb getMyDb() throws Exception {
        if (mydb == null){
            mydb = new MyDb();  //单例模式避免了对数据库服务器重复的连接
        }
        return mydb;
    }
    // 选择查询方法
    public String getStr(String sql) throws SQLException {
        // 创建Statement对象
        Statement stmt = conn.createStatement();
        // 执行SQL语句
        ResultSet rs = stmt.executeQuery(sql);
        rs.next();
        return rs.getString("department");
    }

    public ResultSet query(String sql, Object... args) throws Exception {
        // SQL命令中含有通配符，使用可变参数使得可以传离散或数组两种方式的参数
        pst = conn.prepareStatement(sql);
        for (int i = 0; i < args.length; i++) {
            pst.setObject(i + 1, args[i]);
        }
        return pst.executeQuery();
    }
    // 增加_c，修改_u，删除_d
    public boolean cud(String sql, Object... args) throws Exception {
        pst = conn.prepareStatement(sql);
        for (int i = 0; i < args.length; i++) {
            pst.setObject(i + 1, args[i]);
        }
        return pst.executeUpdate() >= 1 ? true : false; // 返回操作查询是否成功？
    }
    // 关闭数据库访问方法
    public void closeConn() throws Exception {
        if (pst != null && !pst.isClosed()) {
            pst.close();
        }
        if (conn != null && !conn.isClosed()) {
            conn.close();
        }
    }
}
