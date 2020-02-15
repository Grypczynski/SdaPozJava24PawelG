package zajecia5;

import javax.sound.midi.Soundbank;

public class WstepDoObiektowProgram {
    //    pierwsze przyklady tworzenia obiektow
    public static void main(String[] args) {


//        "student" jest obiektem typu osoba
//         new Osoba(); --> wywołanie konstruktora bezparametrowego klasy Osoba
        Osoba student = new Osoba();
        student.imie = "Paweł";
        student.nazwisko = "Grypczyński";
        student.wiek = 28;
        student.wzrost = 170;
        student.waga = 85;

//        "uczen" jest obiektem typu osoba
        Osoba uczen = new Osoba();
        uczen.imie = "Jan";
        uczen.nazwisko = "Nowak";
        uczen.wiek = 10;

//        odczyt pola
        String a = student.imie;
        System.out.println("Wartość pola to: " + a);

//        szybszy, preferowany zapis
        System.out.println("Nazwisko studenta to: " + student.nazwisko);
        System.out.println(student.waga);

//        wartosci drugiego obiektu - "uczen"
        System.out.println(uczen.imie);
        System.out.println(uczen.nazwisko);
        System.out.println(uczen.wiek);

//        zmiana nazwiska studenta
        System.out.println("Po zmianie nazwiska u studenta");
        student.nazwisko = "AAAAAAAAAAAAAAAAAA";
        System.out.println(student.nazwisko);
        System.out.println(uczen.nazwisko);

//        tworzymy obiekty z uzyciem konstruktora parametrowego
//        w nawiaiasie ctrl + p (parameters)
        Osoba pracownik = new Osoba("Anna","Kujawa",22);
        System.out.println(pracownik.imie);
        System.out.println(pracownik.nazwisko);
        System.out.println(pracownik.wiek);

//        wywołujemy metodę przedstawSie
        System.out.println(student.przedstawSie());
        System.out.println(uczen.przedstawSie());
        System.out.println(pracownik.przedstawSie());

    }
}
