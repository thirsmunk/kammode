package Model;

public class Product {

    //Variables declared
    private String productName;
    private String productDescription;
    private int productPrice;
    private int stock;
    private Order owner;

    //No-arg constructor
    public Product() {

    }

    //Constructor with parameters
    public Product(String productName, String productDescription, int productPrice, int stock, Order o) {
        this.productName = productName;
        this.productDescription = productDescription;
        this.productPrice = productPrice;
        this.stock = stock;
        this.owner = o;
    }

    //Getters & setters
    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public int getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(int productPrice) {
        this.productPrice = productPrice;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public Order getOwner() {
        return owner;
    }

    public void setOwner(Order owner) {
        this.owner = owner;
    }
}
