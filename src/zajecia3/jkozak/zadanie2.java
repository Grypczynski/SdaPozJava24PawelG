package zajecia3.jkozak;

import java.util.Scanner;

public class zadanie2 {
    public static void main(String[] args) {
        Scanner czytnik = new Scanner(System.in);

        System.out.println("Podaj pierwszą liczbę: ");
        int a = czytnik.nextInt();
        System.out.println("Podaj drugą liczbę: ");
        int b = czytnik.nextInt();

        if (a < b) {
            int suma = 0;
            for (int i = a; i <= b; i++) {
                suma += i;
            }
            System.out.println("Suma przedziału od A = " + a + " do B = " + b + " wynosi: " + suma);

//            2 wersja petla while
            suma = 0;
            int index = a;
            while (index <= b) {
                suma += index;
                index++;
            }
            System.out.println("Suma przedziału od A = " + a + " do B = " + b + " wynosi: " + suma);

//            3 wersja petla do-while




        } else {
            System.out.println("A musi być mniejsze od B");

        }


    }
}
