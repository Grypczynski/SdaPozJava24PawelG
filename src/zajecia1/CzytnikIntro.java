package zajecia1;


import java.util.Scanner;

public class CzytnikIntro {
    public static void main(String[] args) {

//      aby moc czytac dane uzytkownika musimy utworyc obiekt typu Scanner wg nastepujacej skladni;

        Scanner czytnik = new Scanner(System.in);

//        czytnik to zmienna/obiekt typu Scanner

//        wiek to zmienna typu Int
//        w momencie pisania kodu nie wiemy ile konkretny uzytkownik ma lat
//        dobra praktyka - wyzerowanie zmiennej (wiek)
        String imie;
        double wiek;

// todo: fix this bug

        System.out.println("Podaj swoje imie: ");
//        przeczytaj cala linie tekstu az do wcisniecia ENTER
        imie = czytnik.nextLine();

        System.out.println("Witaj " + imie);

        System.out.println("ile masz lat? ");

        wiek = czytnik.nextDouble();

        System.out.println("witaj, " + imie + "! Masz " + wiek + "lat");

    }

}
