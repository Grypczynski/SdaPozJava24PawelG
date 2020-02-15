package zajecia5.Prostokat;

import org.w3c.dom.ls.LSOutput;
import zajecia5.Osoba;

import java.util.Scanner;


public class ProstokatProgram {


    public static void main(String[] args) {
        Scanner czytnik = new Scanner(System.in);

//        pierwszy prostokąt
        System.out.println("Podaj wartość dla boku A");
        double bokA = czytnik.nextDouble();

        System.out.println("Podaj wartość dla boku B");
        double bokB = czytnik.nextDouble();

        Prostokat prostokat1 = new Prostokat(bokA, bokB);
        prostokat1.setBokA(bokA);

        System.out.println("Pole wynosi " + prostokat1.obliczPole());
        System.out.println("Obwod wynosi " + prostokat1.obliczObdow());

//        drugi prostokąt
        System.out.println("Podaj wartość dla boku A drugiego prostokąta");
        double bokA2 = czytnik.nextDouble();

        System.out.println("Podaj wartość dla boku B drugiego prostokąta");
        double bokB2 = czytnik.nextDouble();

        Prostokat prostokat2 = new Prostokat(bokA2, bokB2);

        System.out.println("Pole wynosi drugiego prostokąta " + prostokat2.obliczPole());
        System.out.println("Obwod wynosi drugiego prostokąta " + prostokat2.obliczObdow());

//         trzeci prostokąt
        System.out.println("Podaj wartość dla boku A trzeciego prostokąta");
        double bokA3 = czytnik.nextDouble();

        System.out.println("Podaj wartość dla boku B trzeciego prostokąta");
        double bokB3 = czytnik.nextDouble();

        Prostokat prostokat3 = new Prostokat(bokA3, bokB3);

        System.out.println("Pole wynosi trzeciego prostokąta " + prostokat3.obliczPole());
        System.out.println("Obwod wynosi trzeciego prostokąta " + prostokat3.obliczObdow());


    }


}
