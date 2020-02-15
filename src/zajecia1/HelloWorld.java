package zajecia1;

public class HelloWorld {

    public static void main(String[] args) {

//      to jest komentarz
//      ta linia kodu wypisuje komunikat (bez przejścia do nowej linii)

        System.out.print("Paweł Grypczyński ");

        System.out.println("zajęcia pierwsze");

//      deklaracja i inicjalizacja razem
//      TYP NAZWA ZMIENNEJ = WARTOŚĆ

        byte malaLiczba = 10;

        int wiek = 28;

        int duzaLiczba = 10024541;

        double numberPi = 3.14;

// przy long i float ważna jest "L" na końcu (reszta w prezentacji)

        long bardzoDuzaLiczba = 4_000_000_000_000L;

        float pi = 3.14F;

        boolean czyWPoznaniuCieplo = false;

        String imie = "Paweł";

// zmiana zmiennej imie

        imie = "Agnieszka";

        System.out.println(malaLiczba);

        System.out.println(imie);

        System.out.println(czyWPoznaniuCieplo);


    }

}