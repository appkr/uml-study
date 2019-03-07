package uml.study;

import java.util.ArrayList;
import java.util.List;

public class ZooKeeper {

    List<Animal> animals = new ArrayList<>();

    public ZooKeeper() { }

    public void addAnimal(Animal animal) {
        animals.add(animal);
    }

    public void removeAnimal(Animal animal) {
        animals.remove(animal);
    }

    public void feedAnimals(FoodStock foodStock) {
        try {
            animals.stream().forEach(a -> a.eat(foodStock));
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
            throw e;
        }
    }
}
