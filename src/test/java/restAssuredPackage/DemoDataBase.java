package restAssuredPackage;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.sql.*;


public class DemoDataBase {
    public Connection connect;

    @BeforeTest
    public void dataBaseBefore() throws ClassNotFoundException, SQLException {

        Class.forName("com.mysql.jdbc.Driver");
        String username = "root";
        String password = "root";
        String url = "jdbc:mysql://localhost:3306/world";
        connect = DriverManager.getConnection(url,username,password);
    }
    @Test
    public void dataBase() throws SQLException {
        String query = "Select * from country";
        Statement stat = connect.createStatement();
        ResultSet result = stat.executeQuery(query);
        while(result.next()){
            System.out.println(result.getString(1));
        }}

    @AfterTest
    public void teardown() throws SQLException {
        if(connect!=null){
            connect.close();
        }
    }

}
