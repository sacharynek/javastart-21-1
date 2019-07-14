package javastart.javastart211;

public class Product {

    private String name, category;
    private Double price;


    Product(String name, String category, Double price) {
        this.name = name;
        this.category = category;
        this.price = price;
    }

    Double getPrice() {
        return price;
    }

    String getCategory() {
        return category;
    }

    @Override
    public String toString() {
        return "<br><h3>Name :'" + name + ", category='" + category + ", price=" + price + "</h3>";
    }
}
