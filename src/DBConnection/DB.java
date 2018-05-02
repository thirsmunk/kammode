package DBConnection;

import Model.Product;

import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;

public class DB {

    //Variables used for establishing connection
    private static final String URL = "jdbc:mysql://localhost:3306/kammode?useSSL=false&serverTimezone=UTC";
    private static final String USERNAME = "dev";
    private static final String PASSWORD = "dev123";
    private static Connection connection = null;

    /**
     * Attempts to create the connection to database
     */
    public DB() {
        try {
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /**
     * Dives into the database and retrieves the SQL table and turns it into an ArrayList
     * @return the pants in the DB (arraylist)
     */
    public ArrayList<Product> getProducts() {
    ResultSet resultSet = null;
    ArrayList<Product> products = new ArrayList<>();
    try {
        PreparedStatement getProducts = connection.prepareStatement(
                "SELECT product_category.productname, product_category.productdescription, product_category.productprice, product_category.productstock FROM product_category"
        );
        resultSet = getProducts.executeQuery();

        while (resultSet.next()) {
            Product product = new Product();
            product.setProductName(resultSet.getString("productname"));
            product.setProductDescription(resultSet.getString("productdescription"));
            product.setProductPrice(resultSet.getInt("productprice"));
            product.setStock(resultSet.getInt("productstock"));

            products.add(product);
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }
    return products;
    }

    /**
     * Subtracts the amount of pants purchased from the stock
     * @param amount amount of pants the customer purchased
     */
    public void productPurchased(int amount) {

        try {
            PreparedStatement productPurchased = connection.prepareStatement("UPDATE product_category SET productstock = productstock - ? WHERE idproduct_category = 1");
            productPurchased.setInt(1, amount);
            productPurchased.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    /**
     * Method responsible for terminating the database connection.
     */
    private static void close() {
        try {
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
