package ss07_abtract_class_interface.content.unit3a;

abstract class Animal {
    // abstract class không có phần thân
    public abstract void animalSound();

    // abstract class có phần thân
    public void sleep() {
        System.out.println("Zzz");
    }

}
class Pig extends Animal{
    @Override
    public void animalSound() {
        // Phần code thực thi của Abstract method được viết bởi lớp con kế thừa
        System.out.println("The pig says: wee wee");
    }
}

