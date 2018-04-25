package Model;

public class Product {

    private String productName;
    private String productDescription;
    private int productPrice;
    private boolean inStock;
    private Order owner;

    public Product(String productName, String productDescription, int productPrice, boolean inStock, Order o) {
        this.productName = productName;
        this.productDescription = productDescription;
        this.productPrice = productPrice;
        this.inStock = inStock;
        this.owner = o;
    }

}
