package ss12_Java_collection_frameword.content.unit2_bai_doc_java_cfw;

import java.util.ArrayList;
import java.util.Collection;

public class TestCollection {
    public static void main(String[] args) {
        ArrayList collection1 = new ArrayList<>();
        collection1.add("New York");
        collection1.add("Atlanta");
        collection1.add("Dallas");
        collection1.add("Madison");
        System.out.println("A list of cities in collection1:");
        System.out.println(collection1);
        System.out.println("\nIs Dallas in collection1? " + collection1.contains("Dallas"));
        collection1.remove("Dallas");
        System.out.println("\n" + collection1.size() + "  are in collection1 now");

        Collection collection2 = new ArrayList<>();
        collection2.add("Seattle");
        collection2.add("Portland");
        collection2.add("Los Angeles");
        collection2.add("Atlanta");
        System.out.println("\nA list of cities in collection2:");
        System.out.println(collection2);
        ArrayList c1 = (ArrayList) collection1.clone();
        /*
       The reason why the code ArrayList c1= (ArrayList) collection1.clone() still has
to cast the type of collection1 to ArrayList is because the clone() method of the
ArrayList class returns an object of type Object. This is because the clone() method
 is declared as follows:

public Object clone()
         */
        c1.addAll(collection2);
        System.out.println("\nCities in collection1 or collection2: ");
        System.out.println(c1);
        c1 = (ArrayList) (collection1.clone());
        c1.retainAll(collection2);
        System.out.print("\nCities in collection1 and collection2: ");
        System.out.println(c1);

        c1 = (ArrayList)(collection1.clone());
        c1.removeAll(collection2);
        System.out.print("\nCities in collection1, but not in 2: ");
        System.out.println(c1);
    }
}
