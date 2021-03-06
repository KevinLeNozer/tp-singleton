package org.patternBuilder.director;

import org.patternBuilder.builder.ZooBuilder;
import org.patternBuilder.zoo.Animal;

public class Director {

        public void constructZooBeauval(ZooBuilder zooBuilder) {

            zooBuilder.appendZone("Zone aux lions", 2);
            zooBuilder.appendZone("Zone aux Dauphin", 2);
            zooBuilder.appendZone("Zone aux Singes", 2);

            zooBuilder.appendAnimal("Zone aux lions", new Animal("Lion"));
            zooBuilder.appendAnimal("Zone aux Dauphin", new Animal("Dauphin"));
            zooBuilder.appendAnimal("Zone aux Singes", new Animal("Singe"));
        }
}