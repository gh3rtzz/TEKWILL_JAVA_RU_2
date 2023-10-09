package bonus_hw_1;

import java.util.UUID;

public class BankAccount {
    private static int accountCount;
    private final int accountNr;
    private final String accountHolderName;
    private double accountAmount;
    private String IBAN = "";

    public BankAccount(String accountHolderName, String countryCode, String bankAbbreviation) throws Exception {
        accountCount++;
        this.accountNr = accountCount;
        this.accountHolderName = accountHolderName;
        this.accountAmount = 0d;
        setIBANWithValidation(countryCode, bankAbbreviation);
    }

    public String getIBAN() {
        return IBAN;
    }

    public int getAccountNr() {
        return accountNr;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public double getAccountAmount() {
        return accountAmount;
    }

    public void setAccountAmount(double accountAmount) {
        this.accountAmount = accountAmount;
    }

    private void setIBANWithValidation(String countryCode, String bankAbbreviation) throws Exception {
        if(countryCode.length() != 2 || bankAbbreviation.length() != 4)
            throw new Exception("Invalid parameters");

        String accountNr = String.valueOf(getAccountNr());
        int accountNrLength = accountNr.length();

        this.IBAN += countryCode;
        this.IBAN += bankAbbreviation;

        for(int index = 0; index != (23 - accountNrLength - 6); index++){
            this.IBAN += "0";
        }

        this.IBAN += accountNr;
    }
}
