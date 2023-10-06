package principles.isp.account.after;

public class PartitionAccount implements BankAccount, AccountIncome {
    @Override
    public void calculateIncome() {
        System.out.println("PartitionAccount.calculateIncome()");
    }

    @Override
    public void produceStatement() {
        System.out.println("PartitionAccount.produceStatement()");
    }

    @Override
    public void deposit() {
        System.out.println("PartitionAccount.deposit()");
    }

    @Override
    public void withdraw() {
        System.out.println("PartitionAccount.withdraw()");
    }
}