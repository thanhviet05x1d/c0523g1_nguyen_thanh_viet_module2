package ss07_abtract_class_interface.practice_01;

import ss07_abtract_class_interface.practice_01.animal.Animal;
import ss07_abtract_class_interface.practice_01.animal.Chicken;
import ss07_abtract_class_interface.practice_01.animal.Tiger;
import ss07_abtract_class_interface.practice_01.edible.Edible;
import ss07_abtract_class_interface.practice_01.fruit.Apple;
import ss07_abtract_class_interface.practice_01.fruit.Fruit;
import ss07_abtract_class_interface.practice_01.fruit.Orange;

public class AbstractAndInterfaceTests {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Tiger();
        animals[1] = new Chicken();
        for (Animal animal : animals) {
            System.out.println(animal.makeSound());
            if (animal instanceof Chicken) {
                Edible edible = (Chicken) animal;
                System.out.println(edible.howToEat());
            }
        }
        Fruit[] fruits = new Fruit[2];
        fruits[0] = new Orange();
        fruits[1] = new Apple();
        for (Fruit fruit : fruits) {
            System.out.println(fruit.howToEat());
        }
    }
}
