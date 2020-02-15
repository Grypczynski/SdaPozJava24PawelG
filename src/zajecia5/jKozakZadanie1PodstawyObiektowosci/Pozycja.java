package zajecia5.jKozakZadanie1PodstawyObiektowosci;

import zajecia5.Osoba;

public class Pozycja {
    private String nazwaTowaru;
    private int ileSztuk;
    private double cena;

    public Pozycja(String nazwaTowaru, int ileSztuk, double cena) {
        this.nazwaTowaru = nazwaTowaru;
        this.ileSztuk = ileSztuk;
        this.cena = cena;
    }

    public String getNazwaTowaru() {
        return nazwaTowaru;
    }

    public int getIleSztuk() {
        return ileSztuk;
    }

    public double getCena() {
        return cena;
    }

    public void setNazwaTowaru(String nazwaTowaru) {
        this.nazwaTowaru = nazwaTowaru;
    }

    public void setIleSztuk(int ileSztuk) {
        this.ileSztuk = ileSztuk;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }

    public double ObliczWartosc() {
        return cena * ileSztuk;
    }

    public String toString() {
        return this.nazwaTowaru + " " + cena + " zł" + ileSztuk + " szt. " + ObliczWartosc() + "zł";

    }


}
