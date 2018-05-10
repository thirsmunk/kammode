package Controller;

import DBConnection.DB;
import Model.Product;
import View.ConsoleView;

import java.util.ArrayList;
import java.util.Scanner;

public class PantController {

    //Declaring variables
    DB db;
    Scanner sc;
    ConsoleView cw;

    //Constructor receiving db-object, cw-object from MainController
    public PantController(DB db, ConsoleView cw) {
        this.db = db;
        this.cw = cw;
        this.sc = new Scanner(System.in);

    }

    //No-arg constructor
    public PantController() {

    }

    //Method responsible for showing the available pants in the system
    public void showPants() {
        //Read (aflaesning) from database
        ArrayList<Product> products = db.getProducts();
        String stockStatus = "No";
        int productId = 1;

        //Print the shop columns
        cw.shopLayout();

        //Iterate through ArrayList
        for (Product p : products) {
            if (p.getStock() > 0) {
                stockStatus = "Yes";
            }
            System.out.println(productId++ + "\t" + p.getProductName() + "\t " + p.getProductDescription() + "\t " + p.getProductPrice() + "\t\t\t " + stockStatus);
        }

        //Let customer select amount of products and complete order
        cw.orderSelection();
    }

}

