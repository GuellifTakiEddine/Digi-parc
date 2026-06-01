package admingui;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AuthenticationHandler {

    private static final String url =
            "jdbc:sqlite:" + System.getProperty("user.dir") + "/parc.db";

    // USER LOGIN
    public static boolean authenticateUser(String username, String password) {

        String query =
                "SELECT username,password FROM employe WHERE username = ? AND password = ?";

        try (
                Connection conn = DriverManager.getConnection(url);
                PreparedStatement stmt = conn.prepareStatement(query)
        ) {

            stmt.setString(1, username);
            stmt.setString(2, password);

            ResultSet resultSet = stmt.executeQuery();

            return resultSet.next();

        } catch (SQLException e) {

            e.printStackTrace();
            return false;
        }
    }

    // ADMIN LOGIN
    public static boolean authenticateAdmin(String username, String password) {

        String query =
                "SELECT usernameA,passwordA FROM manager WHERE usernameA = ? AND passwordA = ?";

        try (
                Connection conn = DriverManager.getConnection(url);
                PreparedStatement stmt = conn.prepareStatement(query)
        ) {

            stmt.setString(1, username);
            stmt.setString(2, password);
            System.out.println(username);
            System.out.println(password);
            ResultSet resultSet = stmt.executeQuery();

            return resultSet.next();

        } catch (SQLException e) {

            e.printStackTrace();
            return false;
        }
    }

    // GET USER ID
    public int getLoggedInUserID(String username) {

        int userID = -1;

        String sql =
                "SELECT IdEmp FROM employe WHERE username = ?";

        try (
                Connection conn = DriverManager.getConnection(url);
                PreparedStatement stmt = conn.prepareStatement(sql)
        ) {

            stmt.setString(1, username);

            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {

                userID = rs.getInt("IdEmp");
            }

        } catch (SQLException ex) {

            ex.printStackTrace();
        }

        return userID;
    }

    // GET USER NAME
    public String getLoggedInUserName(String username) {

        String userName = null;

        String sql =
                "SELECT NomEmp FROM employe WHERE username = ?";

        try (
                Connection conn = DriverManager.getConnection(url);
                PreparedStatement stmt = conn.prepareStatement(sql)
        ) {

            stmt.setString(1, username);

            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {

                userName = rs.getString("NomEmp");
            }

        } catch (SQLException ex) {

            ex.printStackTrace();
        }

        return userName;
    }
}