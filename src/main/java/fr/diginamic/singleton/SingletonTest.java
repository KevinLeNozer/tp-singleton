package fr.diginamic.singleton;

import fr.diginamic.singleton.bll.ManagerManage;

import java.sql.SQLException;
import java.util.List;

public class SingletonTest {
    private static ManagerManage instance = null;

    public static List<Object> listObject() throws SQLException {
        instance = ManagerManage.getInstance();
        return instance.list();
    }

    public static void main(String[] args) throws SQLException {
        System.out.println(listObject());
    }
}
