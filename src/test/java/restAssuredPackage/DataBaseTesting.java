package restAssuredPackage;

import org.testng.annotations.Test;

import java.sql.*;

public class DataBaseTesting {
        private static Connection connection =null;
        private static Statement statement = null;
        public static void  main(String[] args) throws ClassNotFoundException, SQLException, InstantiationException, IllegalAccessException {
            //Load the jdbc class
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/world";
            String username = "root";
            String password = "root";
            String query = "select * from city;";
            //For connection with url and credential
            connection = DriverManager.getConnection(url, username, password);
            Statement stmt = connection.createStatement();
            ResultSet rs= stmt.executeQuery(query);
            while (rs.next()){
            System. out.println( rs.getString(2));
                System. out.println( rs.getString(1));
                System. out.println( rs.getString(3));
                System. out.println( rs.getString(4));
            }


    }

}
