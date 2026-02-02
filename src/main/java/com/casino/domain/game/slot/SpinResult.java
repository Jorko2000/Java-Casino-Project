public class SpinResult {
private final boolean win;
private final BigDecimal payout;


public SpinResult(boolean win, BigDecimal payout) {
this.win = win;
this.payout = payout;
}


public boolean isWin() { return win; }
public BigDecimal getPayout() { return payout; }
}
