package task;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Product {
    List<Product> products = new ArrayList<>();
    private String type;
    private double price;
    private int idNumber;

    private boolean discount;

    private LocalDate createDate;

    public Product(String type, double price, int idNumber, boolean discount, LocalDate createDate) {
        this.type = type;
        this.price = price;
        this.idNumber = idNumber;
        this.discount = discount;
        this.createDate = createDate;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }

    public boolean isDiscount() {
        return discount;
    }

    public void setDiscount(boolean discount) {
        this.discount = discount;
    }

    public LocalDate getCreateDate() {
        return createDate;
    }

    public void setCreateDate(LocalDate createDate) {
        this.createDate = createDate;
    }

    @Override
    public String toString() {
        return "Product{" +
                "products=" + products +
                ", type='" + type + '\'' +
                ", price=" + price +
                ", idNumber=" + idNumber +
                ", discount=" + discount +
                ", createDate=" + createDate +
                '}';
    }
}
