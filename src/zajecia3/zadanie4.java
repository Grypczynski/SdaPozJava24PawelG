package zajecia3;

import java.util.Scanner;

public class zadanie4 {
    public static void main(String[] args) {
        Scanner czytnik = new Scanner(System.in);

//        zapytaj użytkownika o dowolny napis
//        "Ala ma kota", "Piotr", "zadanie4"

        System.out.println("Napisz dowolny tekst np. swoje imię i nazwisko");
        String napis = czytnik.nextLine();

//        policz liczbę znaków (ze spacją i bez)

        int licznik = 0;
        for (int i = 0; i < napis.length(); i++) {
//                        pobierz 1 znak
            char znak = napis.charAt(i);
            System.out.println("Znak na pozycji: " + i + " to: " + znak);

//      Jeżeli dany znak jest literą (nie jest spacją) to jest zliczany. Wyświetl wynik
            if (znak != ' ') {
                licznik++;
            }
        }
//       np. długość napisu ... ze spacjami wynosi: WYNIK
//       "bez spacji"

        System.out.println("Długość tekstu (ze spacjami) to: " + napis.length());
        System.out.println("Długość tekstu bez spacji to: " + licznik);

//        wyświetl napis zapisany małymi literami
        System.out.println("Tekst małymi literami to: " + napis.toLowerCase());
        System.out.println("Tekst małymi literami to: " + napis.toUpperCase());
    }

}
