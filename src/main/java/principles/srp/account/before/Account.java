package principles.srp.account.before;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import java.math.BigDecimal;
import java.math.RoundingMode;

@Slf4j
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

    public BigDecimal getInterestAmount() {
        return balance.multiply(interestRate.divide(BigDecimal.valueOf(100), RoundingMode.HALF_UP));
    }

    public void closeAccount() {
        log.info("Consuming Account!");
    }
}