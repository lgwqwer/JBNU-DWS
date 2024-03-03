package example.spring.demo.db;

import java.sql.*;

public class DBManager {
    public static double getScore(String prov, String ct) {

        String url = "jdbc:mysql://localhost:3306/jbnudws";
        String userName = "root";
        String password = "0000";

        double distanceScore;

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(url, userName, password);

            Statement statement = connection.createStatement();

            String query = "select distanceScore from distancescore WHERE province = ? AND city = ?";
            //ResultSet resultSet = statement.executeQuery(query);
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, prov);
            preparedStatement.setString(2, ct);
            preparedStatement.executeUpdate();

            ResultSet resultSet = preparedStatement.executeQuery();


            resultSet.next();
            distanceScore = resultSet.getDouble("distanceScore");

            return distanceScore;

        } catch (SQLException e) {
            e.printStackTrace();
            return 0.1;
        } catch(ClassNotFoundException se) {
            System.out.println(se.getMessage());
            return 0.2;
        }
    }

}
