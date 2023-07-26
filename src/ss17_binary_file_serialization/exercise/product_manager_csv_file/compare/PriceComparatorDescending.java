package ss17_binary_file_serialization.exercise.product_manager_csv_file.compare;

import ss17_binary_file_serialization.exercise.product_manager_csv_file.model.Product;

import java.util.Comparator;

public class PriceComparatorDescending implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        return (int) (o2.getPrice() - o1.getPrice());
    }
}
