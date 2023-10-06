package principles.isp.account.after;

public class CheckingAccount implements BankAccount {
    @Override
    public void produceStatement() {
        System.out.println("CheckingAccount.produceStatement()");
    }

    @Override
    public void deposit() {
        System.out.println("CheckingAccount.deposit()");
    }

    @Override
    public void withdraw() {
        System.out.println("CheckingAccount.withdraw()");
    }
}