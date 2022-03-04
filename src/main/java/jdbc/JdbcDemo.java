package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcDemo {


    public static void main(String[] args) throws SQLException {
        //creating a connection
        String url = "jdbc:postgresql://localhost/test";
        Connection conn = null;

        int rollno = 3;
        String name = "daniel";
        int age = 21;
        String sql = "insert into student(rollno, name, age) " + "values(" + rollno + ",'" + name + "'," + age + ")" ;

        //String sql1 = "insert into student(rollno, name, age) " + "values(" + rollno + ",'" + name + "'," + age + ")" ;

        try {
            conn = DriverManager.getConnection(url, "postgres", "anthonia");

            Statement st = conn.createStatement();
            int m = st.executeUpdate(sql);
            if (m == 1)
                System.out.println("inserted successfully: " + sql);
        else
                System.out.println("insertion failed");
        }catch (Exception ex){
            System.err.println(ex);
        }finally {
            conn.close();
        }


    }

}
