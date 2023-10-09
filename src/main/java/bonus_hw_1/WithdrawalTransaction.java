package bonus_hw_1;

public class WithdrawalTransaction implements Transaction{

    private final BankAccount bankAccount;
    private final double withdrawalAmount;

    public WithdrawalTransaction(BankAccount bankAccount, double withdrawalAmount) {
        this.bankAccount = bankAccount;
        if(withdrawalAmount < 0)
            this.withdrawalAmount = withdrawalAmount * -1;
        else
            this.withdrawalAmount = withdrawalAmount;
    }

    @Override
    public void process() throws Exception {
        double bufferAmount = bankAccount.getAccountAmount();
        if(bufferAmount - withdrawalAmount < 0)
            throw new Exception("Insufficient funds in bank account: " + bankAccount.getAccountNr());
        else
            bankAccount.setAccountAmount(bufferAmount - withdrawalAmount);
    }
}
