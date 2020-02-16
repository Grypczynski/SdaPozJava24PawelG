package zajecia6.Program_2012.pdf;

import java.util.Scanner;

public class ListaPracownikow {

    //    stworzenie tablicy pracownikow na 100 pracownikow,
    private Pracownik[] listaPracownikow = new Pracownik[100];
    private int licznikPracownikow = 0;

    public ListaPracownikow() {
        Pracownik pracownik1 = new Pracownik("Filip", "Nowak", 'M', 10, 200, 28, 0, false);
        listaPracownikow[licznikPracownikow++] = pracownik1;

        Pracownik pracownik2 = new Pracownik("Paweł", "Grypczyński", 'M', 5, 500, 28, 0, true);
        listaPracownikow[licznikPracownikow++] = pracownik2;
    }


    public void dodajNowegoPracownika() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Imię:");
        String imie = scanner.nextLine();

        System.out.println("Nazwisko");
        String nazwisko = scanner.nextLine();

        System.out.println("Płeć");
        char plec = scanner.nextLine().charAt(0);

        System.out.println("Numer działu");
        int nr_dzialu = Integer.valueOf(scanner.nextLine());

        System.out.println("Płaca");
        float placa = Float.parseFloat(scanner.nextLine());

        System.out.println("Wiek");
        int wiek = Integer.parseInt(scanner.nextLine());

        System.out.println("Ilość dzieci");
        int dzieci = Integer.parseInt(scanner.nextLine());

        System.out.println("Stan cywilny 'żonaty/mężatka - true' lub 'kawaler/panna - false' ");
        boolean stan_cywilny = Boolean.parseBoolean(scanner.nextLine());

        Pracownik nowyPracownik = new Pracownik(imie, nazwisko, plec, nr_dzialu, placa, wiek, dzieci, stan_cywilny);
        listaPracownikow[licznikPracownikow++] = nowyPracownik;
    }

    public void usunPracownika() {
        int ileMamyPracownikow = ileMamyPracownikow();
        if (ileMamyPracownikow > 0) {
            int index = pobierzIndexPracownika();
            listaPracownikow[index] = null;

            System.out.println("Usunięto pracownika");
        } else {
            System.out.println("Masz pustą listę pracowników");
        }
    }

    private int ileMamyPracownikow() {
        int suma = 0;
        for (int i = 0; i < listaPracownikow.length; i++) {
            if (listaPracownikow[i] != null) {
                suma++;
            }
        }
        return suma;
    }

    private int pobierzIndexPracownika() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj index pracownika do usunięcia:");
        int index = Integer.parseInt(scanner.nextLine());
        return index;
    }

    public void wypiszWszystkichPracownikow() {
        for (int i = 0; i < listaPracownikow.length; i++) {
            if (listaPracownikow[i] != null) {
                listaPracownikow[i].wypiszOkrojoneDane(i);
            }
        }
    }
}