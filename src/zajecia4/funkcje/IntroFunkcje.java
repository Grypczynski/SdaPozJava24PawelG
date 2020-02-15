package zajecia4.funkcje;

public class IntroFunkcje {
//    prosta funckja pobierająca 2 argumenty i zwracająca ich sumę
//    funkcje / metody definiujemy w ciele KLASY, a więc nie w mainie.

    static int dodaj(int a, int b) {
        return a + b;
    }

    //    funkcja która nic nie zwraca ale wypisuje zawartość tablicy

    static void printArray(String[] array) {
        System.out.print("[ ");
        for (String i : array) {
            System.out.print(i + ", ");
        }
//        kasujemy ostatni przecinek
//        todo na przyszłość: eleganckie roziwazanie z uzyciem StringBuiler
        System.out.print('\b');
        System.out.print('\b');

        System.out.print(" ]");
    }

    static int Fibonacci(int n) {
        int fib1 = 1;
        int fib2 = 1;
        int suma = 0;
        for (int i = 3; i <= n; i++) {
            suma = fib1 + fib2;
            fib1 = fib2;
            fib2 = suma;
        }
        return suma;
    }

    public static void main(String[] args) {
        int pierwszaLiczba = 10;
        int drugaLiczba = 20;
        int wynik = dodaj(pierwszaLiczba, drugaLiczba);
        System.out.println("wynik dodawania to: " + wynik);

        String[] imiona = {"Jan", "Tomek", "Piotr"};
        printArray(imiona);
        System.out.println();

//        wywołanie funkcji Fibonacci
        System.out.println("Wywołanie ciagu fibonacciego dla 5, 6, 7 wyrazu");
        System.out.println(Fibonacci(5));
        System.out.println(Fibonacci(6));
        System.out.println(Fibonacci(7));



    }
}
