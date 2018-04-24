package Controller;

import Model.Kunde;
import Model.Ordre;

import java.util.ArrayList;
import java.util.Scanner;

public class MainController {

    ArrayList<Ordre> ordre = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    Kunde kunde1 = new Kunde("Lasse", 'm', 21, ordre);
    public void logIn(String navn) {
        if(navn.equals(kunde1.getNavn())) {
            System.out.println("Velkommen, " + kunde1.getNavn());
            System.out.println("Du har nu foelgende valgmuligheder:");
            System.out.println("1. Aendr dit navn");
            System.out.println("2. Foobar");

            int choice = sc.nextInt();

            if(choice == 1) {
                String nytNavn;
                System.out.println("Vaelg dit nye navn");
                nytNavn = sc.next();
                System.out.println("Dit nye navn opdateres i systemet...");
                kunde1.setNavn(nytNavn);
                System.out.println("Dit navn er nu opdateret, " + kunde1.getNavn());
            }
        }

    }
}
