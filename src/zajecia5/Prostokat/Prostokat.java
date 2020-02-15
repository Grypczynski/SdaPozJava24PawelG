package zajecia5.Prostokat;

public class Prostokat {
    private double bokA;
    private double bokB;

    public Prostokat(double bokA, double bokB) {
        this.bokA = bokA;
        this.bokB = bokB;
    }

    public double obliczPole() {
        return bokA * bokB;
    }

    public double obliczObdow() {
        return ((2 * this.bokA) + (2 * this.bokB));
    }

//    getter i setter - hermetyzacja

    //    metoda getter - zwraca wartość pola (nie przyjmuje argumentów)
    public double getBokA() {
        return this.bokA;
    }

    //    metoda setter'a - nic nie zwraca, ustawia wartość przekazaną jako parametr
    public void setBokA(double bokA) {
        if (bokA > 0) {
            this.bokA = bokA;
        } else {
            throw new IllegalArgumentException("Bok musi być większy od 0!!!");
        }
    }

    //    getter i setter dla pola bokB
    public double getBokB() {
        return bokB;
    }

    public void setBokB(int bokB) {
        this.bokB = bokB;
    }
}


