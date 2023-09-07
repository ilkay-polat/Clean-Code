package principles.srp.account.after;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
public class Account {
    private final String accountNumber;
    private BigDecimal balance;
    private BigDecimal interestRate;

    public void deposit(final BigDecimal amount) {
        balance = balance.add(amount);
    }

    public void withdraw(final BigDecimal amount) {
        balance = balance.subtract(amount);
    }
}