package ex3.initializer.task4;

import java.util.ArrayList;
import java.util.List;

public class FruitList {

    private List<Fruit> fruits = new ArrayList<>();

    public FruitList() {
        fruits.add(new Fruit("Apple"));
        fruits.add(new Fruit("Banana"));
        fruits.add(new Fruit("Orange"));
    }

    public List<Fruit> getFruits() {
        return fruits;
    }

    public void setFruits(List<Fruit> fruits) {
        this.fruits = fruits;
    }

    public Fruit findFruit(String name) {
        return fruits.stream()
                .filter(fruit -> fruit.getName().equals(name))
                .findFirst()
                .get();
    }
}
