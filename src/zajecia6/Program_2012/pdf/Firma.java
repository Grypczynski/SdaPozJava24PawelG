package zajecia6.Program_2012.pdf;

public class Firma {
    public static void main(String[] args) {

        Menu menu = new Menu();
        ListaPracownikow listaPracownikow = new ListaPracownikow();
        String akcja = "";
        while (!akcja.equals("e") && !akcja.equals("q")) {
            menu.pokazGlowneMenu();
            akcja = menu.pobierzAkcjeOdUzytkownika();

            switch (akcja) {
                case "1": // wyswietl uzytkownika
                    listaPracownikow.wypiszWszystkichPracownikow();
                    break;

                case "2": // dodaj uzytkownika
                    listaPracownikow.dodajNowegoPracownika();
                    break;
                case "4":
                    listaPracownikow.wypiszWszystkichPracownikow();
                    listaPracownikow.usunPracownika();
                    break;

                case "e":
                case "q":
                    System.out.println("Koniec programu!");
                    break;

                default:
                    System.out.println("Błedna akcja");
            }

        }
    }

}



