package zajecia5;

public class Osoba {
    //    pola w klasie
    public String imie;
    public String nazwisko;
    public int wiek;
    public double wzrost;
    public double waga;

    //konstruktor bezparametrowy
//    jesli nie ma zadnego konstruktora to pusty  konstruktor jest generowany automatycznie
//    jesli potrzebujemy JAWNIE konstruktor parametrowy, to ten konstruktor juz nie jest generowany automatycznie
//    jesli potrzebujemy domyslnego konstruktora to musimy do zdefiniowac JAWNIE
//    jesli usuniemy ten konstruktor to bedziemy musieli zawsze tworzyc obiekty osoba
//    za pomoca konstruktora 3 argumentowego
    public Osoba() {
        System.out.println("Tworzę obiekt typu Osoba...");
    }

    public Osoba(String imie, String nazwisko, int w) {
        this.imie = imie;
        this.nazwisko = nazwisko;
//        trzeci parametr nazywa sie inaczej niz pole, wiec this.wiek nie potrzebne
//        mozna od razu wiek = w;
        wiek = w;
    }
//        definicja metody do opisu Osoby
    public String przedstawSie(){
        return "Na imię mam " + this.imie + ", nazywam się " + this.nazwisko + " i mam " + wiek + " lat.";
    }

}
