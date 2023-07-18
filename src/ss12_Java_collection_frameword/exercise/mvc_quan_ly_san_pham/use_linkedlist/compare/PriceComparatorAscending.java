package ss12_Java_collection_frameword.exercise.mvc_quan_ly_san_pham.use_linkedlist.compare;

import ss12_Java_collection_frameword.exercise.mvc_quan_ly_san_pham.use_linkedlist.model.Product;

import java.util.Comparator;

public class PriceComparatorAscending implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        return o1.getPrice()-o2.getPrice();
    }
}
