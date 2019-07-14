package javastart.javastart211;

public class Product {
    String name, category;
    Double price;


    public Product(String name, String category, Double price) {
        this.name = name;
        this.category = category;
        this.price = price;
    }

    public Double getPrice() {
        return price;
    }

    public String getCategory() {
        return category;
    }

    @Override
    public String toString() {
        return "<br><h3>Name :'" + name +", category='" + category + ", price=" + price +"</h3>";
    }
}
