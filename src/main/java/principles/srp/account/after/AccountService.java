package principles.srp.account.after;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class AccountService {
    public void closeAccount() {
        log.info("Consuming Account!");
    }
}