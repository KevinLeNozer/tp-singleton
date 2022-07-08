package org.patternBuilder.zoo;

public class Animal {

    private String nom;

    public Animal(String nom) {
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Animal{");
        sb.append("nom='").append(nom).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
