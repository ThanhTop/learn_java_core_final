import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Product> listProduct = new ArrayList<>();
        Product product = new Product();
        product.addProduct();
        System.out.println(product.toString());
        listProduct.add(product);
        System.out.println(listProduct.size());
        listProduct.forEach(x -> {
            System.out.println(x.getProductName());
        });
    }
}
