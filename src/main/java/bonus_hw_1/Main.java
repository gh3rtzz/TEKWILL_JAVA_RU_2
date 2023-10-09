package bonus_hw_1;

public class Main {

    public static void main(String[] args) throws Exception {
        Bank bank1 = new Bank("MAIB", "MD", "MAIB");

        bank1.createNewAccount("Alexey");
        bank1.createNewAccount("Dumitru");
        bank1.createNewAccount("Serghei");

        bank1.printAllAccountsAndAmounts();

        bank1.depositMoney(1, 20);

        bank1.printAllAccountsAndAmounts();

        bank1.withdrawMoney(1, 10);

        bank1.depositMoney(2, 30);
        bank1.depositMoney(3, 15);

        bank1.withdrawMoney(1, -5);

        System.out.println("--------------------");
        bank1.printAllAccountsAndAmounts();

        bank1.transactMoney(2, 1, 9.6);
        System.out.println("--------------------");
        bank1.printAllAccountsAndAmounts();

        bank1.transactMoney(2, 1, 20.4);
        System.out.println("--------------------");
        bank1.printAllAccountsAndAmounts();



    }
}
