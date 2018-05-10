package View;

import Controller.PantController;
import DBConnection.DB;

import java.util.Scanner;

public class ConsoleView {
    Scanner sc = new Scanner(System.in);
    //temp db object
    DB db = new DB();

    public int welcome() {

        int choice;

        System.out.println("*****Welcome to KAMMODE.COM*****");
        System.out.println("1 = ***MENU***");
        System.out.println("2 = ***CART***");
        System.out.println("3 = ***Jackets***");
        System.out.println("4 = ***Suits***");
        System.out.println("5 = ***Pants*** - Vertical");

        choice = sc.nextInt();

        return choice;

    }

    public void shopLayout() {
        System.out.println("#" + "\t" + "Name \t\t\t\t\t Description \t\t\t\t Price \t\t\t In stock?");
    }

    public void orderSelection() {
        int amount;

        System.out.println("Select a product, choose #");

        int choice = sc.nextInt();

        if (choice == 1) {
            System.out.println("How many would you like to purchase?");
            amount = sc.nextInt();
            //Call next method
            confirmPurchase(amount);

        } else {
            System.out.println("Not available for this prototype");
        }
    }

    public void confirmPurchase(int amount) {
        System.out.println("1.Add to cart\n2.Buy now");

        int secondChoice = sc.nextInt();

        if (secondChoice == 1) {
            //To be implemented
            System.out.println("Not implemented yet!");
            return;
        }

        if (secondChoice == 2) {
            //Calculation (beregning)
            System.out.println("Pay DDK " + amount * 550 + "?\nPress 1 to confirm");
        }

        int confirmPurchase = sc.nextInt();

        if (confirmPurchase == 1) {
            //Update (opdatering) bad fix, but temp for this prototype - move to controller in next build
            db.productPurchased(amount);

            System.out.println("Dear ... Thank you for your purchase!");
        }
    }
}
