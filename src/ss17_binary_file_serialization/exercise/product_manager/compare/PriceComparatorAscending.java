package ss17_binary_file_serialization.exercise.product_manager.compare;

import ss17_binary_file_serialization.exercise.product_manager.model.Product;

import java.util.Comparator;

public class PriceComparatorAscending implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        return (int) (o1.getPrice()-o2.getPrice());
    }
}

