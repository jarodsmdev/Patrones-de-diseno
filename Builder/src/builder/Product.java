package builder;

import java.util.ArrayList;
import java.util.List;

public class Product {

    private String name;
    private Double price;
    private List<Provider> providers;

    private Product(String name, Double price, List<Provider> providers) {
        this.name = name;
        this.price = price;
        this.providers = providers;
    }

    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }

    public List<Provider> getProviders() {
        return providers;
    }

    @Override
    public String toString() {
        return "Product{" + "name=" + name + ", price=" + price + ", providers=" + providers + '}';
    }
    
    public static ProductBuilder builder(){
        return new ProductBuilder();
    }
    

    public static class ProductBuilder implements IBuilder<Product>{
        private String name;
        private Double price;
        private List<Provider> providers = new ArrayList();
        
        public ProductBuilder setName(String name){
            this.name = name;
            return this;
        }
        
        public ProductBuilder setPrice(Double price){
            this.price = price;
            return this;
        }
        
        
        public ProductBuilder setProviders(String name, String address, String phoneNumber){
            Provider p = new Provider(name, address, phoneNumber);
            providers.add(p);
            return this;
        }
        
        @Override
        public Product build(){
            return new Product(name, price, providers);
        }
    }
}
