package javastart.javastart211;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ProductRepository {

    List<Product> productList = new ArrayList<>();

    public ProductRepository(){
        addProduct(new Product("Proszek", "AGD", 10.99));
        addProduct(new Product("Soda", "Food", 10.99));
        addProduct(new Product("Płyta Cd", "Other", 10.99));
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }

    public void addProduct(Product product){
        this.getProductList().add(product);
    }

    public List<Product> search(String category) {
        List<Product> output = new ArrayList<>();
        for(Product product : getProductList()){
            if(product.category.equals(category)){
                output.add(product);
            }
        }
        return output;

    }
}
