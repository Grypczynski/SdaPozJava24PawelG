package zajecia4.funkcje;

import java.util.Random;
import java.util.Scanner;

public class zadanie2 {

public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj rozmiar tablicy: ");
        int arraySize = scanner.nextInt();

        // tworzymy 2 tablice
        // pierwsza "liczby" o rozmiarze podanym przez użytkownika
        // drugą tablicę "wystąpienia" o rozmiarze 11 (dla zliczania wystąpień od 0 do 10, 11 cyfr)
        int[] liczby = new int[arraySize];
        int[] wystapienia = new int[11];

        // wypełnij tablicę "liczby" wartościami losowymi
        Random r = new Random();
        for (int i = 0; i < liczby.length; i++) {
            // losujemy liczbę
            int randomNumer = r.nextInt(10) + 1;
            // wpisujemy wylosowana liczbe do tablicy
            liczby[i] = randomNumer;
        }

        // mamy wypełnioną tablicę "liczby", wiec ja wyświetlimy
        // uzyjemy petli "foreach"
        // nie mamy zmiennej "int i", tracimy informcję o indeksie
        // ale w tym przypadku tego nie potrzebujemy
        // dla kazdego elementu chcemy go wypisac...

        for (int liczba : liczby) {
            System.out.print(liczba + ", ");
        }

        System.out.println(); // przejdz do nowej linii

        // zliczanie elementów
        for (int i = 0; i < liczby.length; i++) {
            // pobierz wartosc z tablicy "liczby" ->> wartość ta jest indeksem dla tablicy "wystapienia"
            // np. jezeli bedzie liczba 5 -> to w tablicy wystapienia[5] należy inkrementować wartość
            int index = liczby[i];
            wystapienia[index]++;
        }


        // wyswietlenie tablicy "wystąpienia"
        for (int i = 1; i < wystapienia.length; i++) {
            System.out.println(i + " ---> " + wystapienia[i]);
        }

    }
}