import java.util.ArrayList;

public class Seller {

    public static void main(String[] args) {
        Product product = new Product("bmw", "is a good car", 50000000.6);
        product.setCategory(Category.CAR);
//        Product.allProducts
        product.addSeller(new Seller());
//        Product product1 = new Product();
//        Category.DIGITAL
        //        String name = product.getName();
        //        product.name
//        ArrayList<Product>= ;
        System.out.println(Product.allProducts);
    }

    // Encapsulation --> immutable
    // abstraction
    // Composition

    // Inheritance
    // Polymorphism
}
