package restAssuredPackage;

import org.testng.annotations.Test;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;




public class DataBaseImp extends DataBaseTestingTrial{

    @Test
    public void test() throws ClassNotFoundException, SQLException {
        String query = "select * * from country";
        Statement stats = connect.createStatement();
        ResultSet rs = stats.executeQuery(query);
        while(rs.next()){
            System.out.println(rs.getString(1));
            System.out.println(rs.getString(3));
            System.out.println(rs.getString(2));
        }}

}
