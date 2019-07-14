package javastart.javastart211;

public class Product {
    String name, category;
    Double price;


    public Product(String name, String category, Double price) {
        this.name = name;
        this.category = category;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Name='" + name +", category='" + category + ", price=" + price +"\n\t";
    }
}
