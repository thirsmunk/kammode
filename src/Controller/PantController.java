package Controller;

import DBConnection.DB;
import Model.Product;

import java.util.ArrayList;
import java.util.Scanner;

public class PantController {

    //Declaring variables
    DB db;
    Scanner sc;

    //Constructor receiving db-object from MainController
    public PantController(DB db) {
        this.db = db;
        this.sc = new Scanner(System.in);

    }

    //Method responsible for showing the available pants in the system
    public void showPants() {
        //Read (aflaesning) from database
        ArrayList<Product> products = db.getProducts();
        String stockStatus = "No";
        int productId = 1;
        int amount=0;

        //ConsoleView?
        System.out.println("#" + "\t" + "Name \t\t\t\t\t Description \t\t\t\t Price \t\t\t In stock?");
        for(Product p : products) {
            if (p.getStock() > 0) {
            stockStatus = "Yes";
            }
            System.out.println(productId++ + "\t" + p.getProductName() + "\t " + p.getProductDescription() + "\t " + p.getProductPrice() + "\t\t\t " + stockStatus);
        }

        //ConsoleView
        System.out.println("Select a product, choose #");

        int choice = sc.nextInt();

        if (choice == 1) {
            System.out.println("How many would you like to purchase?");
            amount = sc.nextInt();
        } else {
            System.out.println("Not available for this prototype");
        }

        System.out.println("1.Add to cart\n2.Buy now");

        int secondChoice = sc.nextInt();

        if (secondChoice == 2) {
            //Calculation (beregning)
            System.out.println("Pay DDK "+ amount*550 + "?\nPress 1 to confirm");
        }

        int confirmPurchase = sc.nextInt();

        if (confirmPurchase == 1) {
            //Update (opdatering)
            db.productPurchased(amount);

            System.out.println("Dear ... Thank you for your purchase!");



        }
    }
}
