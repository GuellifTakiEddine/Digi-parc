package admingui;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database {

    private static final String URL;

    static {

        // jpackage stores jar + db inside "app"
        String installDir = System.getProperty("user.dir");

        File dbFile = new File(installDir + "/app/parc.db");

        URL = "jdbc:sqlite:" + dbFile.getAbsolutePath();

        System.out.println("DB PATH: " + dbFile.getAbsolutePath());
    }

    public static Connection connect() {

        try {

            return DriverManager.getConnection(URL);

        } catch (SQLException e) {

            e.printStackTrace();
            return null;
        }
    }
}