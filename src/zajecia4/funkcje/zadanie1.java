package zajecia4.funkcje;

import javax.swing.*;
import java.util.Scanner;

public class zadanie1 {

    static int countLastLetter(String text) {
//        pobieramy ostatnią literę z napisu
        text = text.toLowerCase();
        char lastLetter = text.charAt(text.length() - 1);
        int counter = 0;

        for (int i = 0; i < text.length(); i++) {
            char litera = text.charAt(i);
            if (lastLetter == litera) {
//            Jezeli ostatnia litera (lastLetter) zgadza sie z aktualna litera, zwieksz licznik counter
                counter++;
            }
        }
            return counter;
        }




    public static void main(String[] args) {

        System.out.println("Podaj dodowlny napis, a ja policzę ilość wystąpień ostatniej litery");
        Scanner scanner = new Scanner(System.in);

        String napis = scanner.nextLine();
//        wywołujemy funkcję
        int liczbaWystapien = countLastLetter(napis);
        System.out.println("Ostatnia litera w wyrazie występuje " + liczbaWystapien);


    }
}
