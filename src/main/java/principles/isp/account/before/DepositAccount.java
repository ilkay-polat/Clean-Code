package principles.isp.account.before;

public class DepositAccount implements BankAccount {
    @Override
    public void calculateIncome() {
        System.out.println("DepositAccount.calculateIncome()");
    }

    @Override
    public void produceStatement() {
        System.out.println("DepositAccount.produceStatement()");
    }

    @Override
    public void deposit() {
        System.out.println("DepositAccount.deposit()");
    }

    @Override
    public void withdraw() {
        System.out.println("DepositAccount.withdraw()");
    }
}
