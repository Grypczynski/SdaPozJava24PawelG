package zajecia4.funkcje;

import java.util.Scanner;

public class zadanie3Palindrom {

        static boolean isPalindrome(String text) {
            // kajak -> długość wynosi 5; 5/ 2 = 2

            for (int i = 0; i < text.length() / 2; i++) {
                // porównujemy odpowiadające sobie litery
                // pierwszą literę musimy porównać z ostatnią
                // drugą literę z przed ostatnia
                // do uzykania informacji, którą literę od końca musimy prorównać
                // obliczamy: text.length() - 1 -> odstatnia litera
                // od (text.length() -1) odejmujemy jeszcze i
                // żeby uzyskac przesunięcie, czyli odpowiadającą literę od tyłu
                if (text.charAt(i) == text.charAt(text.length() - 1 - i)) {
                    continue;
                } else {
                    return false;
                }
            }
            return true;
        }


        public static void main(String[] args) {
//    Scanner scanner = new Scanner(System.in);
//    System.out.println("Podaj tekst - sprawdze czy palindrom");
//    String text = scanner.nextLine();

            System.out.println(isPalindrome("anna"));
            System.out.println(isPalindrome("kajak"));
            System.out.println(isPalindrome("ala"));
            System.out.println(isPalindrome("tekst"));

        }
    }