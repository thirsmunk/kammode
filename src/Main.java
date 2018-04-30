import Controller.MainController;
import java.util.Scanner;

public class Main {

    public static void main(String args[]) {
        MainController mc = new MainController();
        Scanner sc = new Scanner(System.in);

        System.out.println("*****Welcome to KAMMODE.COM*****");
        System.out.println("Choose one of the following options:");
        System.out.println("1. Existing customer? View your orders");
        System.out.println("2. View shop");

        int i = sc.nextInt();

        //If i == 1 or 2...


    }
}
