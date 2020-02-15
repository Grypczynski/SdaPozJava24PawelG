package zajecia4;

import java.util.Random;
import java.util.Scanner;

public class jKozakZadanie2 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj rozmiar tablicy: ");

        int rozmiar = scanner.nextInt();
        int[] dynamicznaTablica = new int[rozmiar];
        int[] wystapienia = new int[11];

        System.out.println("Rozmiar tablicy: " + dynamicznaTablica.length);

        // wypełnianie wartosciami
        for (int i = 0; i < dynamicznaTablica.length; i++) {
            dynamicznaTablica[i] = random.nextInt(10) + 1;
        }

        // wyswietlenie
        for (int i = 0; i < dynamicznaTablica.length; i++) {
            System.out.print(dynamicznaTablica[i] + ", ");
        }

        // zliczanie
        for (int i = 0; i < dynamicznaTablica.length; i++) {
            int index = dynamicznaTablica[i];
            wystapienia[index]++;
        }

        System.out.println(); // druk od nowej lini, na potrzeby wyglądu w konsoli

        for (int i = 1; i < wystapienia.length; i++) {
            System.out.println(i + " ---> " + wystapienia[i]);
        }


    }
}


