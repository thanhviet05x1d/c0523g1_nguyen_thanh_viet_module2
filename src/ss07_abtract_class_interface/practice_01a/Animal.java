package ss07_abtract_class_interface.practice_01a;

abstract class Animal {
    public abstract String makeSound();
}

class Chicken extends Animal {
    public String makeSound() {
        return "Tui là gà";
    }
}

class Tiger extends Animal {
    public String makeSound() {
        return "Tao là cọp";
    }
}

interface Edible {
    public String howToEat();
}

abstract class Fruit implements Edible {

}

class Orange extends Fruit {
    public String howToEat() {
        return "Bóc vỏ là ăn";
    }
}

class Apple extends Fruit {
    public String howToEat() {
        return "Rửa sạch là ăn";
    }
}

class Test {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Tiger();
        animals[1] = new Chicken();
        for (Animal animal : animals) {
            System.out.println(animal.makeSound());
        }

        Fruit[] fruits = new Fruit[2];
        fruits[0] = new Orange();
        fruits[1] = new Apple();
        for (Fruit fruit : fruits) {
            System.out.println(fruit.howToEat());
        }
    }
}