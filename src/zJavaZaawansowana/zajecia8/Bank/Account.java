package zJavaZaawansowana.zajecia8.Bank;

import javax.swing.*;

public class Account {

    private String number;

    protected int balance;

    private Client client;

    public Account(String number, int balance, Client client) {
        this.number = number;
        this.balance = balance;
        this.client = client;
    }

    public void deposit(int cash) {
        balance += cash;
    }

    public int withraw(int cash) throws NegativeWithrawException {

        if (cash < 0) {
            throw new NegativeWithrawException("Próba wyplaty mniej niż 1 zł"); //inna metoda z uzyciem rzutowania wyjątków
        }
//            System.out.println("Nie można wypłacić kwoty mniejszej od 1 zł");
//            return 0;
//        }
//
        if (canWithraw(cash)) {
            balance -= cash;
            return cash;
        } else {
            return 0;
        }

    }

    public boolean transfer(Account target, int amount) {
        balance -= amount;
        target.balance += amount;
        return true;
    }

    public int getBalance() {
        return balance;

    }

    @Override // super daje mozliwosc odwolania sie do klasy nadrzednej
    public String toString() {
        String x = super.toString();
        return "Stan konta " + number + ": " + balance;

    }


    private boolean canWithraw(int cash) {
        return balance > cash;
    }

}
