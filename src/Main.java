import Controller.MainController;
import java.util.Scanner;

public class Main {

    public static void main(String args[]) {
        MainController mc = new MainController();
        Scanner sc = new Scanner(System.in);

        System.out.println("*****Velkommen til KAMMODE.COM*****");
        System.out.println("Vaelg en af foelgende muligheder:");
        System.out.println("1. Eksisterende kunde? Log ind");
        System.out.println("2. Se udbudte varer");

        int i = sc.nextInt();

        if (i == 1) {
            String navn;
            System.out.println("Indtast dit navn for at logge ind");
            navn = sc.next();
            //Go to log-in
            mc.logIn(navn);
        } else if (i == 2) {
            //Show wares
        } else {
            System.out.println("Du skal taste 1 eller 2!");
        }


    }
}
