package zajecia2;

public class ForLoopIntro {
    public static void main(String[] args) {

//parzyste liczby od 0-100 wersja 1 - petla for

        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.print(i + ", ");
            }
        }
        System.out.println(" ");
//        parzyste liczby od 1-100 wersja 2 -petla for
        for (int i = 2; i <= 100; i += 2) {
            System.out.print(i + ", ");
        }

//        nieparzyste od 100-0
//        99, 97, 95
        System.out.println();

        for (int i = 99; i >= 0; i -= 2) {
            System.out.print(i + ", ");
        }


//        zadanie 3 - suma liczb od 0 - 100
        int suma = 0;
        for (int i = 0; i <= 100; i++) {
            suma += i;

        }
        System.out.println();
        System.out.println(suma);
        System.out.println();
        System.out.println("koniec programu");
    }


}
