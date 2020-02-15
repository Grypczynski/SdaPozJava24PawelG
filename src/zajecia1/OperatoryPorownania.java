package zajecia1;

public class OperatoryPorownania {

    public static void main(String[] args) {

        int wiek = 18;

//        wersja 1

        boolean czyPelnoletni = wiek == 18;

        System.out.println("Czy wiek wiekszy rowny 18? " + czyPelnoletni);

        System.out.println("Czy wiek mniejszy rowny 18? " + (wiek <= 18));

        System.out.println("Czy wiek rozny od 20? " + (wiek != 20));

//        wersja 2

        System.out.println(wiek == 18);


    }
}
