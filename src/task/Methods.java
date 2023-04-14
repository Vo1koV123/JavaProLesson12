package task;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Methods {
    public static List<Product> getExpensiveBooks(List<Product> products) {
        return products.stream()
                .filter(p -> p.getType().equals("Book") && p.getPrice() > 250)
                .collect(Collectors.toList());
    }

    public static List<Product> getDiscountedBooks(List<Product> product) {
        return product.stream()
                .filter(p -> p.getType().equals("Book") && p.isDiscount())
                .peek(p -> p.setPrice(p.getPrice() * 0.9))
                .collect(Collectors.toList());
    }

    public static List<Product> cheapestBook(List<Product> products) throws Exception {
        List<Product> cheapestBooks = products.stream()
                .filter(p -> p.getType().equals("Book"))
                .sorted(Comparator.comparing(Product::getPrice))
                .collect(Collectors.toList());

        if (cheapestBooks.isEmpty()) {
            throw new Exception("Product category: Book not found");
        }
        return cheapestBooks;
    }

    public static List<Product> getLastAddedProducts(List<Product> products) {
        return products.stream()
                .sorted(Comparator.comparing(Product::getCreateDate).reversed())
                .limit(3)
                .toList();
    }

    public static double getTotalSum(List<Product> products) {
        LocalDate now = LocalDate.now();
        return products.stream()
                .filter(p -> p.getCreateDate().getYear() == now.getYear() && p.getType().equals("Book") && p.getPrice() <= 75)
                .mapToDouble(p -> p.isDiscount() ? p.getPrice() * 0.9 : p.getPrice())
                .sum();
    }

    public static Map<String, List<Product>> groupProductsByType(List<Product> products) {
        return products.stream()
                .collect(Collectors.groupingBy(Product::getType));
    }


}
