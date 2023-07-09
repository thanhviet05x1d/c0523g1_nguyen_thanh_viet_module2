package ss06_ke_thua.practice;

public class Square extends Rectangle {
    public Square() {

    }

    public Square(double side) {
        super(side, side);
    }

    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    public double getSide(){
        return this.getWidth();
    }
    public void setSide(double side) {
        this.setWidth(side);
        this.setHeight(side);
    }

    @Override
    public void setWidth(double side) {
        this.setWidth(side);
    }
    @Override
    public void setHeight(double side) {
        this.setHeight(side);
    }
    @Override
    public String toString() {
        return "A Square with side="
                + getSide()
                + ", which is a subclass of "
                + super.toString();
    }
}
