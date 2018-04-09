/*
 * Developer: Arab Hossain
 * Email: green.arab1995@gmail.com
 */
package Config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/**
 *
 * @author emonh
 */
public class Database {
    // init database constants
    private static final String MAX_POOL = "250";

    // init connection object
    private static Connection connection;
    // init properties object
    private static Properties properties;

    // create properties
    private static Properties getProperties() {
        if (properties == null) {
            properties = new Properties();
            properties.setProperty("user", AppVars.getDbUser());
            properties.setProperty("password", AppVars.getDbPass());
            properties.setProperty("MaxPooledStatements", MAX_POOL);
        }
        return properties;
    }

    // connect database
    public static Connection connect() {
        if (connection == null) {
            try {
                Class.forName("com.mysql.jdbc.Driver");
                 Notify.console(AppVars.getDRIVER_Type());
                connection = DriverManager.getConnection(AppVars.getDB_Url()+AppVars.getDbName(), getProperties());
            } catch (ClassNotFoundException | SQLException e) {
                Notify.exceptionMessage(e);
            }
        }
        return connection;
    }

    // disconnect database
    public static Connection disconnect() {
        if (connection != null) {
            try {
                connection.close();
                connection = null;
            } catch (SQLException e) {
                Notify.exceptionMessage(e);
            }
        }
        return connection;
    }

}
