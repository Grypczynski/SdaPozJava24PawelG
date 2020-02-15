package zajecia3.jkozak;

import java.util.Scanner;

public class zadanie1 {
    public static void main(String[] args) {
        Scanner czytnik = new Scanner(System.in);

        System.out.println("Podaj liczbę całkowitą dodatnią: ");

        int liczba = czytnik.nextInt();

        for (int i = 1; i < liczba; i++) {
            if (i % 2 == 1) {
                System.out.print(i + ", ");

            }

        }

    }
}


