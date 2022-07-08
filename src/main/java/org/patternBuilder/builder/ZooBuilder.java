package org.patternBuilder.builder;

import org.patternBuilder.zoo.Animal;
import org.patternBuilder.zoo.Zone;
import org.patternBuilder.zoo.Zoo;

import java.util.ArrayList;
import java.util.List;

public class ZooBuilder {

    private String nom;

    private List<Zone> zoneList;

    public ZooBuilder(String nom) {
        this.nom = nom;
        this.zoneList = new ArrayList<Zone>();
    }

    public void appendZone(String nom, int capacite) {
        this.zoneList.add(new Zone(nom, capacite));
    }

    public void appendAnimal(String nomZone, Animal animal) {
        for (int i = 0; i < this.zoneList.size(); i++) {

            Zone zone = zoneList.get(i);

            if (zone.getNom() == nomZone) {

                List<Animal> animalList = zone.getAnimalList();

                if (animalList.size() == zone.getCapacite()) {
                    throw new IllegalStateException("La capacité de la zone est atteinte");
                }

                if (zoneList.get(i).getNom() == nomZone) {
                    List<Animal> animals = zoneList.get(i).getAnimalList();
                    animals.add(animal);
                    zoneList.get(i).setAnimalList(animals);
                    break;
                }
            }
        }
    }

    public Zoo get() {
        return new Zoo(nom, zoneList);
    }
}
