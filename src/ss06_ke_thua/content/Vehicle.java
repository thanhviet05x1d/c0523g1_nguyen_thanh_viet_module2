package ss06_ke_thua.content;

class Vehicle {
    protected String model = "Ford";
    protected String color = "Red";

    public void run() {
        System.out.println("Tuut, tuut!");
    }

    public static void main(String[] args) {
        Bicycle myBike = new Bicycle();
        myBike.run();
        System.out.println(myBike.color + " " + myBike.model);

        Car myCar = new Car();
        myCar.run();
        System.out.println(myCar.color + " " + myCar.model);
    }
}

class Bicycle extends Vehicle {
}

class Car extends Vehicle {
    private String modelName = "Mustang";

    @Override
    public void run() {
        System.out.println("Vroom, vroom!");
    }
}
