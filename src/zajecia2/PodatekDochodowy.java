package zajecia2;

import java.util.Scanner;

public class PodatekDochodowy {
    public static void main(String[] args) {
        Scanner czytnik = new Scanner(System.in);

        System.out.println("Witaj! Aby poznać wartość podatku dochodowego, podaj swój dochód: ");
        double dochod;
        double PROG_PODATKOWY = 85_528;

        dochod = czytnik.nextDouble();

        if (dochod < PROG_PODATKOWY) {
            System.out.println("Podatek dochodowy wynosi 18% i stanowi kwotę " + ((dochod * 0.18) - 556.02));
        } else if (dochod > PROG_PODATKOWY) {
            System.out.println("Podatek dochodowy wynosi 32% i stanowi kwotę " + (((dochod - PROG_PODATKOWY) * 0.32) + 14839.02))
            ;
        }


    }


}
