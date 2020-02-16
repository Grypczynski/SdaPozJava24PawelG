package zajecia6.Program_2012.pdf;

public class Pracownik {

    //    tworzenie instancji klasy, cechy prywatne
    private String imie;
    private String nazwisko;
    private char plec;                     // 'K' kobieta, 'M' meżczyzna.
    private int nr_dzialu;
    private float placa;
    private int wiek;
    private int dzieci;
    private boolean stan_cywilny;          // true mężatka / żonaty

    //    konstruktor alt+insert pozwoli nam stworzyc instancje klasy - zywy obiekt z ktorym bedziemy mogli cos robic
    public Pracownik(String imie, String nazwisko, char plec, int nr_dzialu, float placa, int wiek, int dzieci, boolean stan_cywilny) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.plec = plec;
        this.nr_dzialu = nr_dzialu;
        this.placa = placa;
        this.wiek = wiek;
        this.dzieci = dzieci;
        this.stan_cywilny = stan_cywilny;
    }
//sprawdzenie czy pensja jest powyżej podanej wartości // funkcja (zwraca true – powyżej, false – poniżej lub
//równa) z parametrem, który oznacza pensję do porównania (float)
    public boolean czyPlacaJestPowyzejPodanejWartosci(float podanaWartosc){
        return placa > podanaWartosc;
    }



    // wyświetlanie okrojone – tylko imię, nazwisko i płaca // procedura bez parametrów;
    public void wypiszOkrojoneDane(int index) {
        String napis = "index:" + index + "|Pracownik{" +
                "imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", placa=" + placa +
                '}';
        System.out.println(napis);
    }

//wyświetlanie specjalne – tylko imię i nazwisko (wszystko drukowanymi literami), // procedura bez parametrów
    public void wypiszSpecjalnie() {
        String napis = "Pracownik{" +
                "imie='" + imie.toUpperCase() + '\'' +
                ", nazwisko='" + nazwisko.toUpperCase() + '\'' +
                '}';
    }


    // wytowrzenie metody toString alt+insert
    @Override
    public String toString() {
        return "Pracownik{" +
                "imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", plec=" + plec +
                ", nr_dzialu=" + nr_dzialu +
                ", placa=" + placa +
                ", wiek=" + wiek +
                ", dzieci=" + dzieci +
                ", stan_cywilny=" + stan_cywilny +
                '}';
    }

    //    gettery i settery alt+insert
    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public char getPlec() {
        return plec;
    }

    public void setPlec(char plec) {
        this.plec = plec;
    }

    public int getNr_dzialu() {
        return nr_dzialu;
    }

    public void setNr_dzialu(int nr_dzialu) {
        this.nr_dzialu = nr_dzialu;
    }

    public float getPlaca() {
        return placa;
    }

    public void setPlaca(int placa) {
        this.placa = placa;
    }

    public int getWiek() {
        return wiek;
    }

    public void setWiek(int wiek) {
        this.wiek = wiek;
    }

    public int getDzieci() {
        return dzieci;
    }

    public void setDzieci(int dzieci) {
        this.dzieci = dzieci;
    }

    public boolean isStan_cywilny() {
        return stan_cywilny;
    }

    public void setStan_cywilny(boolean stan_cywilny) {
        this.stan_cywilny = stan_cywilny;
    }

}


