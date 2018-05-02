package View;

import java.util.Scanner;

public class ConsoleView {
    Scanner sc = new Scanner(System.in);

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
}
