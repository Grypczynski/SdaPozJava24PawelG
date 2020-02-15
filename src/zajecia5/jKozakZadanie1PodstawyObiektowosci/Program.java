package zajecia5.jKozakZadanie1PodstawyObiektowosci;

public class Program {

//
//    zadanie1
//    http://www.jkozak.pl/przedmioty/java/zadania7.pdf
//

    public static void main(String[] args) {
        Pozycja p1 = new Pozycja("Chleb", 1, 3.50);
        System.out.println(p1);

        Pozycja p2 = new Pozycja("Cukier", 3, 4);
        System.out.println(p2);

        Zamowienie z = new Zamowienie(20);
        z.dodajPozycje(p1);
        z.dodajPozycje(p2);
        System.out.println(z);

    }

}
