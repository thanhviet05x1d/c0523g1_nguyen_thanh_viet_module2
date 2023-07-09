package ss06_ke_thua.unit4_ghi_de;

public class CircleFromSimpleGeometricObject extends SimpleGeometricObject {
    // Other methods are omitted
    // Override the toString method defined in the superclass
    public String toStringInfo() {
      double radius=3.0;
        return super.toStringInfo() + "\nradius is " + radius;
    }
}
