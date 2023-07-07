package ss04_lop_doi_tuong_java.exercise;

public class FanV {

    static final int SLOW = 1;
    static final int MEDIUM = 2;
    static final int FAST = 3;

    private int speed;
    private boolean on;
    private double radius;
    private String color;

    public FanV() {
        this.speed = SLOW;
        this.on = false;
        this.radius = 5.0;
        this.color = "blue";
    }

    public int getSpeed() {
        return this.speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return this.on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String toStringInfo() {
        String info = null;
        if (this.isOn() == true) {
            info = "fan is on, speed= " + this.speed + " color = " + this.color + " radius =" + this.radius;
        } else if (this.isOn() == false) {
            info = "fan is off, speed= " + this.speed + " color = " + this.color + " radius =" + this.radius;
        }
        return info;
    }

    public static void main(String[] args) {

        // Quạt 1
        FanV fanV1 = new FanV();
        fanV1.setSpeed(FAST);
        fanV1.setRadius(10);
        fanV1.setColor("yellow");
        fanV1.setOn(true);

        // Quạt 2
        FanV fanV2 = new FanV();
        fanV2.setSpeed(MEDIUM);
        fanV2.setRadius(5);
        fanV2.setColor("blue");
        fanV2.setOn(false);

        System.out.println(fanV1.toStringInfo());
        System.out.println(fanV2.toStringInfo());
    }
}
