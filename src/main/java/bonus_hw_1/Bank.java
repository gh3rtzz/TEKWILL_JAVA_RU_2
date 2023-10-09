package bonus_hw_1;

import java.util.LinkedList;
import java.util.List;
import java.util.UUID;

public class Bank {

    private final String bankName;
    private List<BankAccount> bankAccounts;
    private final String countryCode;
    private final String bankAbbreviation;

    public Bank(String bankName, String countryCode, String bankAbbreviation) {
        this.bankName = bankName;
        this.bankAccounts = new LinkedList<>();
        this.countryCode = countryCode;
        this.bankAbbreviation = bankAbbreviation;
    }

    public void createNewAccount(String accountHolderName) throws Exception {
        BankAccount newAccount = new BankAccount(accountHolderName, this.countryCode, this.bankAbbreviation);
        bankAccounts.add(newAccount);
    }

    private BankAccount findAndReturnBankAccount(int accountNr) throws Exception {
        for (BankAccount element :
                bankAccounts) {
            if (element.getAccountNr() == accountNr)
                return element;
        }

        throw new Exception("Account not found!");
    }

    public void depositMoney(int accountNr, double amount) throws Exception {
        BankAccount bufferAccount = findAndReturnBankAccount(accountNr);
        Transaction depositTransaction =
                new DepositTransaction(bufferAccount, amount);
        depositTransaction.process();
    }

    public void withdrawMoney(int accountNr, double amount) throws Exception {
        BankAccount bufferAccount = findAndReturnBankAccount(accountNr);
        Transaction depositTransaction =
                new WithdrawalTransaction(bufferAccount, amount);
        depositTransaction.process();
    }

    public void printAllAccountsAndAmounts(){
        for (BankAccount element :
                bankAccounts) {
            System.out.println("Account Number: " + element.getAccountNr() +
                                "\t| Account Holder Name: " + element.getAccountHolderName() +
                                "\t| Account Amount: " + element.getAccountAmount() +
                                "\t| IBAN: " + element.getIBAN());
        }
    }

    public void transactMoney(int sender, int receiver, double amount) throws Exception {
        withdrawMoney(sender, amount);
        depositMoney(receiver, amount);
    }

}
