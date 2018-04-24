package Model;

import Model.Ordre;

import java.util.ArrayList;

public class Kunde {

    private String navn;
    private char koen;
    private int alder;
    private ArrayList<Ordre> ordrer;

    public Kunde (String navn, char koen, int alder, ArrayList<Ordre> ordrer) {
        this.navn = navn;
        this.koen = koen;
        this.alder = alder;
        this.ordrer = ordrer;
    }

    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public char getKoen() {
        return koen;
    }

    public int getAlder() {
        return alder;
    }
}
