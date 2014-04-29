package com.websoc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Abhishek Solanki
 */
public class DAO {

    DBCredentials dbObj = new DBCredentials();
    String key = dbObj.getKEY();
    String url = dbObj.getDBUrl();
    String dbUser = dbObj.getDBUser();
    String dbPass = dbObj.getDBPass();

    public DAO() {
    }

    int rmUsr(String id, String userName) throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException {

        Class.forName("com.mysql.jdbc.Driver").newInstance();
        Connection con = DriverManager.getConnection(url, dbUser, dbPass);
        Statement stm = con.createStatement();
        String query = "delete from messaging.main where ID='" + id + "' and userName='" + userName + "'";
        if (stm.executeUpdate(query) == 1) {
            return 1;
        } else {
            return 0;
        }

    }

    int truncatetable(String tableName) throws ClassNotFoundException, InstantiationException, SQLException, IllegalAccessException {
        Class.forName("com.mysql.jdbc.Driver").newInstance();
        Connection con = DriverManager.getConnection(url, dbUser, dbPass);
        Statement stm = con.createStatement();
        String query = "TRUNCATE messaging." + tableName + "";
        if (stm.execute(query) == true) {
            return 1;
        } else {
            return 0;
        }
    }
}
