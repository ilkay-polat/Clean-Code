package principles.srp.account.after;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class InterestCalculator {
    public BigDecimal getInterestAmount(Account account, BigDecimal interestRate) {
        var balance = account.getBalance();
        return balance.multiply(interestRate.divide(BigDecimal.valueOf(100), RoundingMode.HALF_UP));
    }
}