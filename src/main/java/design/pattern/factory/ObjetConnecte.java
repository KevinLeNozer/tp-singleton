package design.pattern.factory;

public class ObjetConnecte {

    private int limiteVolts;

    public ObjetConnecte(int limiteVolts) {
        this.limiteVolts = limiteVolts;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ObjetConnecte{");
        sb.append("limiteVolts=").append(limiteVolts);
        sb.append('}');
        return sb.toString();
    }
}
