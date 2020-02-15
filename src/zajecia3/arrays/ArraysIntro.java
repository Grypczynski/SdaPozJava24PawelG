package zajecia3.arrays;

import java.util.Scanner;

public class ArraysIntro {
    public static void main(String[] args) {
        int wiek = 10; // wiek = 10

        String imie = "Paweł";

//        tworzenie tablicy 10-elementowej
        int[] liczby = new int[10];

//        wpisywanie wartosci do tablicy
        liczby[0] = 25;
        liczby[4] = 100;

//        pobieranie wartości do tablicy
        int wartosc = liczby[4];

        System.out.println(wartosc);
        System.out.println(liczby[0]);

        //ArrayIndexOfBoundsException
//        błedne użycia:
//        System.out.println(liczby[-2]); indeks tablicy nigdy nie bedzie ujemny
//        System.out.println(liczby[15]); jesli index wiekszy od dlugosci tablicy tez blad

//        sprawdzanie dlugosci tablicy
        int dlugoscTablicy = liczby.length;
        System.out.println("Tablica ma długość: " + dlugoscTablicy);

        String[] imiona= {"Ala", "Paweł", "Adam", "Karolina", "Eliza"};
        for (int i = 0; i < imie.length(); i++){
            String name = imiona[i];
            System.out.println("imie nr. " + i + " to: " + name);


        }
//            dynamiczne tworzenie tablicy
        System.out.println("Podaj rozmiar tablicy: ");
        Scanner scanner = new Scanner(System.in);
        int rozmiar = scanner.nextInt();
        int [] dynamicznaTablica = new int[rozmiar];

        System.out.println("rozmiar dynamicznej tablicy: " + dynamicznaTablica.length);

    }

}
