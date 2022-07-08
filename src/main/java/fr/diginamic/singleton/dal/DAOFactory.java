package fr.diginamic.singleton.dal;


public class DAOFactory {
    public static ManagerJDBImpl getManagerDAO(){
        return new ManagerJDBImpl();
    }
}
