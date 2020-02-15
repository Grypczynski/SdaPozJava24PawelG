package zajecia3.arrays;

import java.util.Scanner;

public class zadanie1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj rozmiar tablicy: ");
        int size = scanner.nextInt();

//        tworzymy nową tablicę:
        int[] array = new int[size];

//        wypełnij w pętli for tablicę
//        np.
//        "Podaj 1 element tablicy"
//        "Podaj 2 element tablicy"
        for (int i = 0; i < array.length; i++) {
            System.out.println("Podaj " + (i + 1) + " element tablicy: ");
            int liczba = scanner.nextInt();
            array[i] = liczba;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element " + i + ": " + array[i]);

        }
//        oblicz min, max, avg, itd
//        min
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        System.out.println("Najmniejsza wartość to: " + min);
//            max
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (max > array[i]) {
//               aktualny max wiekszy od i-tego elementu, wiec nic nie robimy
//                kontynuujemy petle i zczynamy nowy obie petli
                continue;
            }
            max = array[i];
        }
        System.out.println("Najwieksza wartość to: " + max);
//        avg - średnia
        float suma = 0;
        float avg = 0;
        for (int i = 0; i < array.length;i++){
            suma += array[i];

        }
        avg = suma / array.length;
        System.out.println("Srednia to: " + avg);
//        jesli mniejsze od sredniej to zliczaj do min, jesli wieksze to zliczaj do max



//        wypisanie w odwrotnej kolejnosci



    }

}


