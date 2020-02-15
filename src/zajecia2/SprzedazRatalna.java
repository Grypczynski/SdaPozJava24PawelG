package zajecia2;

import java.util.Scanner;

public class SprzedazRatalna {
    public static void main(String[] args) {
        Scanner czytnik = new Scanner(System.in);

        double cena = 0;
        int liczbaRat = 0;

        System.out.println("Podaj cenę towaru [od 100zł do 10000zł] ");
        cena = czytnik.nextDouble();

        System.out.println("Podaj ilość rat [6 do 48] ");
        liczbaRat = czytnik.nextInt();

        double miesiecznaRata = 0;

        if ((cena >= 100 && cena <= 10000) && (liczbaRat >= 6 && liczbaRat <= 48)) {
            System.out.println("obliczam ratę... ");
            if (liczbaRat <= 12) {
                miesiecznaRata = 1.025 * cena / liczbaRat;
            } else if (liczbaRat <= 24) {
                miesiecznaRata = 1.05 * cena / liczbaRat;
            } else {
                miesiecznaRata = 1.1 * cena / liczbaRat;
            }
            System.out.println("Miesięczna rata wynosi: " + miesiecznaRata);
        } else {
            System.out.println("Podane dane są niewłaściwe, uruchom program ponownie...");
        }


//        cena towaru (od 100 zł do 10 tyś. zł)
//        liczba rat (od 6 do 48).

//        od 6–12 wynosi 2.5 %
//        od 13–24 wynosi 5 %
//        od 25–48 wynosi 10 %


    }


}

