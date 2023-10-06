package principles.isp.account.before;

public interface BankAccount {
    void calculateIncome();
    void produceStatement();
    void deposit();
    void withdraw();
}
