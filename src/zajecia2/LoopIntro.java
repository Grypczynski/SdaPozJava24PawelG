package zajecia2;

import java.util.Scanner;

public class LoopIntro {
    public static void main(String[] args) {
        Scanner czytnik = new Scanner(System.in);

        int wiek = 20;

        System.out.println(wiek);

//   1 sposob     zwiekszenie wartosci zmiennej o 5

        wiek = wiek + 5;
        System.out.println(wiek);

//   2 sposob     zwiekszenie wartosci zmiennej o 7

        wiek += 7;
        System.out.println(wiek);

//        wiek++ zwiekszenie wartosci zmiennej o 1

        wiek += 1;
        System.out.println(wiek);

        wiek++;
        System.out.println(wiek);

//        post- vs pre- inkrementacja
        System.out.println("post- vs pre- inkrementacja ");
        System.out.println("Postinkrementacja: liczba++");

        int liczba = 0;
        System.out.println((liczba++)); // 1 vs 0 ??
        System.out.println(liczba); // 1

        System.out.println("Preikrementacja ++number");

        int number = 0;
        System.out.println(++number); // 1
        System.out.println(number); // 1


//      prosta petla while wypisujaca liczby od 0-9

        System.out.println("Pętla while... ");

        int licznik = 0;
        while (licznik < 10) {
            System.out.println(licznik); // lub System.out.println(licznik++);
            licznik++;

        }
        System.out.println("Pętla do while ");
        int x = 0;
        do {
            System.out.println(x++ + ", ");
        } while (x < 10);

    }
}
