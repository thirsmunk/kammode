package Controller;

import DBConnection.DB;
import Model.Customer;
import Model.Order;
import View.ConsoleView;

public class MainController {

    //Declare variables for use in the system
    PantController pc;
    DB db;
    ConsoleView cw;

    //Constructor for MainController, initializing objects
    public MainController() {
        db = new DB();
        cw = new ConsoleView();
        //Transmits initialized objects to the PantController class
        pc = new PantController(db, cw);
    }

    public void run() {

        int choice = cw.welcome();

        switch (choice) {
            case 1: //Show menu
                break;
            case 2: //Show cart
                break;
            case 3: //Show Jackets
                break;
            case 4: //Show Suits
                break;
            case 5:
                pc.showPants();
                break;
            default:
                System.out.println("You didn't select a number from 1-4");
                break;
        }
    }


}

