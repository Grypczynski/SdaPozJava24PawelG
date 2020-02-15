package zajecia5.jKozakZadanie1PodstawyObiektowosci;

public class Zamowienie {
    private final static int DOMYSLNY_ROZMIAR_ZAMOWIENIA = 10;
    private Pozycja[] pozycje;
    private int ileDodanych;
    private int maxRozmiar;


    //    konstruktor bezparametrowy moze sluzyc do ustawienia wartosci domyslnych
    public Zamowienie() {
        this(DOMYSLNY_ROZMIAR_ZAMOWIENIA);
    }

    public Zamowienie(int maxRozmiar) {
        this.maxRozmiar = maxRozmiar;
        pozycje = new Pozycja[maxRozmiar];
    }

    public void dodajPozycje(Pozycja poz) {
        if (this.ileDodanych >= maxRozmiar) {
            System.out.println("Nie można dodać zamówienia - osiągnięto maksymalną ilość pozycji zamówienia ");
        } else {
            this.pozycje[ileDodanych] = poz;
            ileDodanych++;

//           lub w 1 linijce
//           this.pozycje[ileDodanych++] = p;

        }
    }

    public double obliczWartosc() {
        double wartoscZamowienia = 0;
        for (Pozycja p : pozycje)
            if (p != null) {
                wartoscZamowienia += p.ObliczWartosc();

            }
        return wartoscZamowienia;
    }

    public String toString() {
        String result = "Zamówienie: \n";
        for (int i = 0; i < ileDodanych; i++) {
            result += pozycje[i].toString() + "\n";
        }
        return result;

    }

}
