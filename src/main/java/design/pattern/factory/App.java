package design.pattern.factory;

public class App {
    public static void main(String[] args) {
        ObjetConnecte objPortable = ObjetConnecteFactory.createObjetConnecte(TypeObjet.PORTABLE);
        ObjetConnecte objTablette = ObjetConnecteFactory.createObjetConnecte(TypeObjet.TABLETTE);
        ObjetConnecte objEnceinte = ObjetConnecteFactory.createObjetConnecte(TypeObjet.ENCEINTE);

        System.out.println(objPortable.getClass());
        System.out.println(objTablette.getClass());
        System.out.println(objEnceinte.getClass());
    }
}
