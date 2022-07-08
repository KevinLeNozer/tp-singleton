package org.example.zoo;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
    private String nom;

    List<Zone> zones = new ArrayList<>();
    public Zoo(String nom, List<Zone> zoneList) {
        this.nom = nom;
        this.zones = zoneList;
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Zoo{");
        sb.append("nom='").append(nom).append('\'');
        sb.append(", zones=").append(zones);
        sb.append('}');
        return sb.toString();
    }
}
