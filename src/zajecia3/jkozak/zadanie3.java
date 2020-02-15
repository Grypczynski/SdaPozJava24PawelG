package zajecia3.jkozak;

import java.util.Scanner;

public class zadanie3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj liczbę n: ");
        int n = sc.nextInt();
//        1 rozwiązanie
        for (int i = 0; Math.pow(2, i) <= +n; i++) {
            System.out.println(Math.pow(2, i) + ", ");
        }
//         2 rozwiazanie
        System.out.println("\n2 Rozwiązanie: ");
        for (int i = 1; i <= n; i = i * 2) {
            System.out.println(i + ", ");
        }
    }
}
