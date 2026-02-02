public class Wallet {
private BigDecimal balance;
private final ReentrantLock lock = new ReentrantLock();


public Wallet(BigDecimal balance) {
this.balance = balance;
}


public void debit(BigDecimal amount) {
lock.lock();
try {
if (balance.compareTo(amount) < 0)
throw new IllegalStateException("Insufficient funds");
balance = balance.subtract(amount);
} finally { lock.unlock(); }
}


public void credit(BigDecimal amount) {
lock.lock();
try { balance = balance.add(amount); }
finally { lock.unlock(); }
}
}
