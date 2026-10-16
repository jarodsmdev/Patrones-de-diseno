
package builder;

public class Main {
    public static void main(String[] args){

        Product p = Product.builder()
                .setName("Huevos")
                .setPrice(250.0)
                .setProviders("Proveedor A", "Calle Roja #123", "9999-9999")
                .build();
        
        System.out.println(p);
    }
}
