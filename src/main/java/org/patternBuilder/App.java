package org.patternBuilder;

import org.patternBuilder.builder.ZooBuilder;
import org.patternBuilder.director.Director;
import org.patternBuilder.zoo.Zoo;

public class App {
    public static void main(String[] args) {
        Director director= new Director();

        String nomDuZoo = "Beauval";
        ZooBuilder zooBeauvalBuilder = new ZooBuilder(nomDuZoo);

        director.constructZooBeauval(zooBeauvalBuilder);

        Zoo zooBeauval = zooBeauvalBuilder.get();

        System.out.println(zooBeauval);
    }
}
