package ss05_access_modifier_static_getter_setter.practice.car;

public class TestStaticProperty {
    public static void main(String[] args) {
        Car car1=new Car("Mazda3","Skeyactiv 6");
        System.out.println(Car.numberOfCars);
        Car car2=new Car("Mazda6","Skyactiv 6");
        System.out.println(Car.numberOfCars);
    }
}
