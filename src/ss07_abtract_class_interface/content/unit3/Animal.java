package ss07_abtract_class_interface.content.unit3;

public interface Animal {
    public void animalSound(); // method của interface ko có phần thân

    public void sleep();// method của interface ko có phần thân
}

class Pig implements Animal {

    // Pig "implements"  Interface  Animal
    public void animalSound() {
        // phần thân của interface sẽ được code  trong class Pig
        System.out.println("The pig says: wee wee");
    }

    // phần thân của interface sẽ được code  trong class Pig
    public void sleep() {
        System.out.println("Zzz");
    }
}
