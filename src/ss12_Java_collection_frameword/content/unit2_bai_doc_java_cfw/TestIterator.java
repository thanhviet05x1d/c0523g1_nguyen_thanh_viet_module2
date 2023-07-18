package ss12_Java_collection_frameword.content.unit2_bai_doc_java_cfw;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class TestIterator {
    public static void main(String[] args) {
        Collection collection=new ArrayList<>();
        collection.add("New York");
        collection.add("Atlanta");
        collection.add("Dallas");
        collection.add("Madison");
        Iterator iterator = collection.iterator();
        while (iterator.hasNext()){
            System.out.print(iterator.next().toString().toUpperCase()+" ");
        }
        System.out.println();
    }
}
