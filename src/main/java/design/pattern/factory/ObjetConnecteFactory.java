package design.pattern.factory;

public class ObjetConnecteFactory{
    public static ObjetConnecte createObjetConnecte(Enum<TypeObjet> type) {
        if (type.equals(TypeObjet.PORTABLE)) {
            return new TelephonePortable(5);
        } else if (type.equals(TypeObjet.TABLETTE)) {
            return new Tablette(5);
        } else if (type.equals(TypeObjet.ENCEINTE)) {
            return new EnceinteConnectee(12);
        }
        return null;
    }
}
