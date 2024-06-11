package restAssuredPackage;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.sql.*;

@Test
public class DataBaseTestingTrial {
    public static Connection connect;

    @BeforeTest
    public void setUp() throws Exception {
        Class.forName("com.mysql.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/world";
        String userName = "root";
        String password = "root";
        connect = DriverManager.getConnection(url,userName,password);
    }
    @AfterTest
    public void tearDown() throws SQLException {
        if (connect != null) {
            connect.close();
        }

        }


}
