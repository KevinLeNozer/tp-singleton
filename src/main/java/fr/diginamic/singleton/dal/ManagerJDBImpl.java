package fr.diginamic.singleton.dal;

import fr.diginamic.singleton.bll.ManagerManage;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ManagerJDBImpl {
    private static final String SQL_SELECT_ALL="select * from client";

    public List<Object> listclient() throws SQLException {
        Statement stmt=null;
        ResultSet rs=null;
        List<Object> listClient = new ArrayList<>();
        Connection cnx=Tools.getConnection();
        try {
            stmt=cnx.createStatement();
            rs=stmt.executeQuery(SQL_SELECT_ALL);
            while(rs.next()) {
                listClient.add(rs.getString(2));
            }


        } catch (SQLException e) {
            // TODO Auto-generated catch block
            throw new SQLException("erreur du select all",e.getCause());
        }
        return listClient;
    }
}
