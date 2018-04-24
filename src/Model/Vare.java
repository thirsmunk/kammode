package Model;

public class Vare {

    private String vareNavn;
    private int varePris;
    private boolean paaLager;

    public Vare (String vareNavn, int varePris, boolean paaLager) {
        this.vareNavn = vareNavn;
        this.varePris = varePris;
        this.paaLager = paaLager;
    }

}
