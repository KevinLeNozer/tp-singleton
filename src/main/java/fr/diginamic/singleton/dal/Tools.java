package fr.diginamic.singleton.dal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class Tools {

    public static Connection getConnection()throws SQLException {
        ResourceBundle configuration = ResourceBundle.getBundle("configuration") ;
        String valeur = configuration.getString("db.url");
        String user = configuration.getString("db.user");
        String pass = configuration.getString("db.password");
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(valeur).append("?").append("user=").append(user).append("&").append("password=").append(pass);

        try {
            return DriverManager.getConnection(stringBuilder.toString());
        } catch (SQLException e) {
            throw new SQLException(e);
        }
    }
}
