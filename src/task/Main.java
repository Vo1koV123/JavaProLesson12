package task;

import java.time.LocalDate;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        List<Product> books = new ArrayList<>();
        books.add(new Product("Book", 100, 10 ,true, LocalDate.ofYearDay(2023, 10)));
        books.add(new Product("Book", 200, 11 ,false, LocalDate.ofYearDay(2022, 10)));
        books.add(new Product("Book", 300, 12 ,true, LocalDate.ofYearDay(2021, 10)));
        books.add(new Product("Book", 400, 13 ,false, LocalDate.ofYearDay(2020, 10)));
        books.add(new Product("Book", 50, 14 ,false, LocalDate.ofYearDay(2019, 10)));
        books.add(new Product("Magazine", 750, 15,true, LocalDate.now()));


        Methods.getExpensiveBooks(books);

        Methods.getDiscountedBooks(books);

        try {
            Methods.cheapestBook(books);
        } catch (Exception e) {
            System.err.println("Something went wrong :(");
        }

        Methods.getLastAddedProducts(books);

        Methods.getTotalSum(books);

        Methods.groupProductsByType(books);
    }
}