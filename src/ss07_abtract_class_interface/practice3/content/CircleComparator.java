package ss07_abtract_class_interface.practice3.content;

import java.util.Comparator;

public class CircleComparator implements Comparator<Circle> {


    @Override
    public int compare(Circle o1, Circle o2) {
        if (o1.getRadius() - o2.getRadius() > 0) {
            return 1;
        } else if (o1.getRadius() - o2.getRadius() < 0) {
            return -1;
        } else return 0;
    }
}
