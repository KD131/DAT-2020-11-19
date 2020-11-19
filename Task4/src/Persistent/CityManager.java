package Persistent;

import Models.City;

import java.sql.*;
import java.util.ArrayList;

public class CityManager {
    private final String URL = "jdbc:mysql://localhost/world";
    private final String username = "root";
    private final String password = "1234";
    private Connection con = null;
    private PreparedStatement pstmt = null;

    ArrayList<City> cities = new ArrayList<>();

    public CityManager()
    {
        try
        {
            con = DriverManager.getConnection(URL, username, password);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public void countCities()
    {
        try {
            String sql = "SELECT COUNT(*) as count FROM world.city";

            pstmt = con.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();

            rs.next();

            System.out.println("Total count of cities in database = " + rs.getInt("count") + "\n");

            rs.close();
            pstmt.close();

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public void cities5Mil()
    {
        try
        {
            String sql = "SELECT * FROM world.city WHERE population > 5000000";

            pstmt = con.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();

            System.out.println("Cities with population above 5 million:");

            while(rs.next())
            {
                cities.add(new City(rs.getInt("ID"), rs.getString("Name"), rs.getString("CountryCode"), rs.getString("District"), rs.getInt("Population")));
                // could've also had an empty constructor in City and used setters instead to populate.
                // like Daniel did in his Pizza example.

                System.out.println(rs.getInt("ID"));
                System.out.println(rs.getString("Name"));
                System.out.println(rs.getString("CountryCode"));
                System.out.println(rs.getString("District"));
                System.out.println(rs.getInt("Population"));
                System.out.println();
            }

            rs.close();
            pstmt.close();

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public void printCities()
    {
        System.out.println("Cities with population above 5 million:");
        for(City c : cities)
        {
            System.out.println(c.toString());
        }
    }
}
