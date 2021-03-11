import java.util.ArrayList;

public class Product {
    // Field -->
    // Method -->
    private String name;
    private String productDescription;
    private double price; // 12.4

    // Composition
    private Category category;
    private ArrayList<Seller> allSellers;

    public static ArrayList<Product> allProducts;// = new ArrayList<>(); // Inline

    // Initialization Block
    static {
        allProducts = new ArrayList<>();
    } // once

//    {
//        allSellers = new ArrayList<>();
//    }

    public Product(String productName, String productDescription, double price) {
//        this.name = productName;
//        this.productDescription = productDescription;
//        this.price = price;
        if(price > 1000000) {
            setPrice(-1);
            System.out.println("price is invalid!");
            // Exception Handling!
        } else {
            setPrice(price);
        }
        setName(productName);
        setProductDescription(productDescription);
        this.allSellers = new ArrayList<>(); // Constructor
        // this --> object
        allProducts.add(this);
    }

    private void setName(String name) {
        this.name = name;
    }

    private void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    private void setPrice(double price) {
        this.price = price;
    } // mutable
    // immutable

    // field --> private
    // setter -
    // setter --> private

    public String getName() {
        return name;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public double getPrice() {
        return price;
    }

    // mutable
    public void setCategory(Category category) {
        this.category = category;
    }

    public void addSeller(Seller seller) {
        this.allSellers.add(seller); // Composition
    }
}
