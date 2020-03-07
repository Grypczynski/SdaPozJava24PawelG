package zJavaZaawansowana.zajecia8.Bank;

public class CreditAccount extends Account {

    public CreditAccount(String number, int balance, Client client) {
        super(number, balance, client);
    }

    @Override
    public int withraw(int cash) {
        super.balance -= cash;
        return cash;
    }
}
