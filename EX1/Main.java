import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product("Notebook",   12.99, true));
        products.add(new Product("Headphones", 89.99, true));
        products.add(new Product("USB Cable",   8.49, true));
        products.add(new Product("Keyboard",   45.00, false));
        products.add(new Product("Mouse",      29.99, true));
        products.add(new Product("Monitor",   199.99, true));
        products.add(new Product("Pen Set",     6.99, true));
        products.add(new Product("Webcam",     49.99, false));

        Predicate<Product> isAffordable = p -> p.price < 50 && p.inStock;

        products.removeIf(isAffordable.negate());

        System.out.println("Affordable & in-stock products:");
        products.forEach(System.out::println);
    }
}