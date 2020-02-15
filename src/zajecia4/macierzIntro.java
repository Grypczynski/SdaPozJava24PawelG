package zajecia4;

import java.util.Random;

public class macierzIntro {
    public static void main(String[] args) {

        Random random = new Random();


        int[][] macierz = new int[5][5];

        System.out.println(macierz.length); // zwraca liczbę wierszy
        System.out.println(macierz[0].length); // zwraca liczbe kolumn

// wypełnianie macierzy wartosciami losowymi
        for (int i = 0; i < macierz.length; i++) {
            for (int j = 0; j < macierz[0].length; j++) {
                macierz[i][j] = random.nextInt(10) - 5;
            }
        }
        for (int i = 0; i < macierz.length; i++) {
            for (int j = 0; j < macierz[0].length; j++) {
                System.out.print(macierz[i][j] + ", ");
            }
            System.out.println();
        }
//szukanie maksimum w wierszach
        int[] maxWWIerszach = new int[macierz.length];
        for (int i = 0; i < macierz.length; i++) {
            int max = macierz[i][0];
            for (int j = 0; j < macierz[0].length; j++) {
//                w petli wenetrznej przechodzimy caly wiersz, tutaj szukamy max
                if (max < macierz[i][j]) {
                    max = macierz[i][j];
                }
//                po przejsciu calego wiesza znalezlismy maxa wiec wpisujemy go do tablicy
                maxWWIerszach[i] = max;
            }
        }
        System.out.println("Maksymalne wartości w wierszach: ");
        for (int wWierszach : maxWWIerszach) {
            System.out.println(wWierszach + ", ");
        }
//        szukanie wartosci minimalnej
        int[] minWWIerszach = new int[macierz.length];

        for (int i = 0; i < macierz.length; i++) {
            int min = macierz[i][0];
            for (int j = 0; j < macierz[0].length; j++) {
//                w petli wenetrznej przechodzimy caly wiersz, tutaj szukamy min
                if (min > macierz[i][j]) {
                    min = macierz[i][j];
                }
//                po przejsciu calego wiesza znalezlismy min wiec wpisujemy go do tablicy
                minWWIerszach[i] = min;
            }

        }
        System.out.println("Minimalne wartości w wierszach: ");
        for (int wWierszach : minWWIerszach) {
            System.out.println(wWierszach + ", ");
        }
    }
}
