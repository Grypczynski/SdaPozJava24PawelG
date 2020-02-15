package zajecia1;

import javax.crypto.KeyGenerator;
import java.util.Scanner;

public class KalkulatorBMI {
    public static void main(String[] args) {

        Scanner czytnik = new Scanner(System.in);

        double masaWKG;
        double wzrostWM;


        System.out.println("Witaj w kalkulatorze BMI, podaj swoją wagę w kilogramach ");
        masaWKG = czytnik.nextDouble();

        System.out.println("Podaj swój wzrost w metrach ");
        wzrostWM = czytnik.nextDouble();

        double BMI = (masaWKG / (wzrostWM * wzrostWM));
//       lub w taki sposób        double BMI = masaWKG / Math.pow(wzrostWM, 2);

        System.out.println("Twoje BMI wynosi " + BMI);


//         < 18,5 -> niedowaga
//        18,5-24,99 -> WAGA ok
//        25,0-29,99 -> Nadwaga
//         > 30 -> otyłość

//        if (BMI > 18.5 && BMI < 25) {
//            System.out.println("WAGA OK - waga w normie");
//        } else {
//            System.out.println("Zly wynik - waga za duza, badz za mala");
//        }

        if (BMI < 18.5) {
            System.out.println("Waga za niska ");
        } else if (BMI < 25) {
            System.out.println("Waga ok ");
        } else if (BMI < 30) {
            System.out.println("Nadwaga!! ");
        } else if (BMI > 30) {
            System.out.println("Otyłość! ");
        }

        System.out.println("Koniec programu, pozdrawiam :)");

    }


}

