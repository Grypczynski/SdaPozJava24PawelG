package zajecia6.Choinki;

import java.util.Scanner;

public class zadanie13 {
    public static void main(String[] args) {
        System.out.println("Podaj rozmiar choinki: ");
        Scanner scanner = new Scanner(System.in);

        int wiersze = scanner.nextInt();
        drukujChoinka1(wiersze);
        drukujChoinka2(wiersze);
        drukujChoinka3(wiersze);
//        drukujChoinka4(wiersze);
    }

    static void drukujChoinka1(int wiersze) {
        for (int i = 0; i < wiersze; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("# ");
            }
            System.out.println();
        }
        System.out.println();
    }

    static void drukujChoinka2(int wiersze) {
        for (int i = 0; i < wiersze; i++) {
            for (int j = 0; j < wiersze - i; j++) {
                System.out.print("# ");

            }
            System.out.println();
        }
        System.out.println();

    }

    static void drukujChoinka3(int wiersze) {
        for (int i = 0; i < wiersze; i++) {
            for (int j = 0; j < wiersze; j++) {
                if (j >= i) {
                    System.out.print("# ");
                } else {
                    System.out.print(" ");

                }
                System.out.println();
            }

        }
    }
//    static void drukujChoinka4(int wiersze){
//        for (int i = 0; i < ; i++) {
//            for (int j = 0; j < ; j++) {
//
//            }
//
//        }
//
//    }
}
