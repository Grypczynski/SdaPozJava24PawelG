package zajecia1;

import java.util.Scanner;

public class KonwerterTemperatury {
    public static void main(String[] args) {

        double stopnieCelsjusza;
        double stopnieFarenheita;

        Scanner czytnik = new Scanner(System.in);

        System.out.println("Podaj wartosc temperatury w stopniach Celsjusza ");
        stopnieCelsjusza = czytnik.nextDouble();

        System.out.println("Temperatura w Farenheitach to " + ((1.8 * stopnieCelsjusza) + 32));


        System.out.println("podaj wartosc temperatury w stopniach Farenheita ");
        stopnieFarenheita = czytnik.nextDouble();

        System.out.println("Temperatura w Celsjuszach to " + ((stopnieFarenheita - 32) / 1.8));


    }

}
