package Controller;

import DBConnection.DB;
import Model.Customer;
import Model.Order;

import java.util.Scanner;

public class MainController {

    //Declare variables for use in the system
    Scanner sc;
    PantController pc;
    DB db;

    //Constructor for MainController, initializing objects
    public MainController() {
        sc = new Scanner(System.in);
        db = new DB();
        //Transmits the two initialized objects to the PantController class
        pc = new PantController(db, sc);
    }
    //Takes an integer as parameter from the consoleView
    public void run() {
        //consoleView
        System.out.println("*****Welcome to KAMMODE.COM*****");
        System.out.println("1 = ***MENU***");
        System.out.println("2 = ***CART***");
        System.out.println("3 = ***Jackets***");
        System.out.println("4 = ***Suits***");
        System.out.println("5 = ***Pants*** - Vertical");

        //Revise
        int choice = sc.nextInt();

        switch (choice) {
            case 1: //Show menu
                break;
            case 2: //Show cart
                break;
            case 3: //Show Jackets
                break;
            case 4: //Show Suits
                break;
            case 5: pc.showPants();
                break;
            default: System.out.println("You didn't select a number from 1-4");
                break;
        }
    }


    }

