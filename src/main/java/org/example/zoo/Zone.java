package org.example.zoo;

import java.util.ArrayList;
import java.util.List;

public class Zone {

    private String nom;
    private int capacite;

    List<Animal> animalList = new ArrayList<>();

    public Zone(String nom, int capacite) {
        this.setNom(nom);
        this.setCapacite(capacite);
    }

    public int getCapacite() {
        return capacite;
    }

    public void setCapacite(int capacite) {
        this.capacite = capacite;
    }

    public List<Animal> getAnimalList() {
        return animalList;
    }

    public void setAnimalList(List<Animal> animalList) {
        this.animalList = animalList;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Zone{");
        sb.append("nom='").append(nom).append('\'');
        sb.append(", capacite=").append(capacite);
        sb.append(", animalList=").append(animalList);
        sb.append('}');
        return sb.toString();
    }
}
