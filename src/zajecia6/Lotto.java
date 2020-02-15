package zajecia6;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.function.ToDoubleBiFunction;

public class Lotto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int[] tabUser = new int[6];

        int Liczba1 = 0;
        int Liczba2 = 0;
        int Liczba3 = 0;
        int Liczba4 = 0;
        int Liczba5 = 0;
        int Liczba6 = 0;

        System.out.println("Podaj liczbę z zakresu od 1 do 49");
        Liczba1 = scanner.nextInt();
        Liczba2 = scanner.nextInt();
        Liczba3 = scanner.nextInt();
        Liczba4 = scanner.nextInt();
        Liczba5 = scanner.nextInt();
        Liczba6 = scanner.nextInt();

        tabUser[0] = Liczba1;
        tabUser[1] = Liczba2;
        tabUser[2] = Liczba3;
        tabUser[3] = Liczba4;
        tabUser[4] = Liczba5;
        tabUser[5] = Liczba6;


        System.out.println("Twoje liczby to " + Liczba1 + ", " + Liczba2 + ", " + Liczba3 + ", " + Liczba4 + ", " + Liczba5 + ", " + Liczba6 + ", ");
        System.out.println();
// 0 1 2 3 4 5
        int[] tab = new int[6];

        for (int i = 0; i < tab.length; i++) {
            tab[i] = random.nextInt(49) + 1;
            // todo: spróbować dodać warunek z petlą while, żeby nie dublował losowanych liczb

        }

int suma = 0;
        for (int i = 0; i < tabUser.length; i++) {
            for (int j = 0; j < tab.length; j++) {
                if(tabUser[i] == tab[j]){
                    suma++;
                }
            }
        }

        System.out.println(Arrays.toString(tab));

         System.out.println("Trafiłeś " + suma);



    }
}
