package zajecia6;

import java.util.Random;
import java.util.Scanner;

public class Lotto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int Liczba1 = 0;
        int Liczba2 = 0;
        int Liczba3 = 0;
        int Liczba4 = 0;
        int Liczba5 = 0;
        int Liczba6 = 0;

        System.out.println("Podaj liczbę z zakresu od 1 do 49");
        Liczba1 = scanner.nextInt();
        Liczba2 = scanner.nextInt();
        Liczba3 = scanner.nextInt();
        Liczba4 = scanner.nextInt();
        Liczba5 = scanner.nextInt();
        Liczba6 = scanner.nextInt();

        System.out.println("Twoje liczby to " + Liczba1 + ", " + Liczba2 + ", " + Liczba3 + ", " + Liczba4 + ", " + Liczba5 + ", " + Liczba6 + ", ");
        System.out.println();

        int[] tab = new int[7];
        for (int i = 1; i < 50; i++) {
            tab[i] = random.nextInt(49) + 1;
            System.out.println("Zwycięskie liczby to " + tab[i]);

// todo stworzyć pętle for w taki sposób aby program nie dublował liczb





        }

    }
}
