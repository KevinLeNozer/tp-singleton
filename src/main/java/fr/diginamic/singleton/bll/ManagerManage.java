package fr.diginamic.singleton.bll;

import fr.diginamic.singleton.dal.DAOFactory;
import fr.diginamic.singleton.dal.ManagerJDBImpl;

import java.sql.SQLException;
import java.util.List;

public class ManagerManage {
    public static volatile ManagerManage instance=null;

    private static ManagerJDBImpl impl;

    private ManagerManage() {
        impl = DAOFactory.getManagerDAO();
    }

    public final static ManagerManage getInstance() {
        if (ManagerManage.instance == null) {
            synchronized (ManagerManage.class) {
                if (ManagerManage.instance == null) {
                    ManagerManage.instance = new ManagerManage();
                }
            }
        }
        return ManagerManage.instance;
    }

    public List<Object> list () throws SQLException {
        List<Object> newList = null;
        try {
            newList = impl.listclient();
        }catch (SQLException e) {
            throw new SQLException(e);
        }
        return newList;
    }
}
