package principles.isp.account.after;

public interface BankAccount {
    void produceStatement();

    void deposit();

    void withdraw();
}