package zJavaZaawansowana.zajecia8.Bank;

public class Bank {
    public static void main(String[] args) {

        PersonalClient c1 = new PersonalClient("Jan", "Kowalski");
        BussinessClient c2 = new BussinessClient("Acme");
//        if (c2 instanceof BussinessClient) {
//            System.out.println("Biznesowy " + ((BussinessClient) c2).getNip()); // rzutowanie
//        }
        CheckingAccount a1 = new CheckingAccount("1234", 500, c1);
        CheckingAccount a2 = new CheckingAccount("2341", 100, c1);
        CreditAccount a3 = new CreditAccount("3412", 200, c2);

        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);
        System.out.println(c1);

        try {
            a1.withraw(600);
        } catch (NegativeWithrawException e) {
            System.out.println("Sytuacja wyjątkowa! " + e.getMessage());
        } catch (NegativeBalanceException e) {
            e.printStackTrace();
            System.out.println("Próbujesz wypłacić więcej niż masz");
        } finally {
            System.out.println("zawsze sie wykonam");
        }

        System.out.println("Hello");


    }
}
