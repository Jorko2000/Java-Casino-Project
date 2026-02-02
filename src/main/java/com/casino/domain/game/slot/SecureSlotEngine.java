public class SecureSlotEngine implements SlotEngine {
private final RandomNumberGenerator rng;


public SecureSlotEngine(RandomNumberGenerator rng) {
this.rng = rng;
}


@Override
public SpinResult spin(Player player, BigDecimal bet) {
BetValidator.validate(bet, player.getWallet());
player.getWallet().debit(bet);


int roll = rng.nextInt(1000);
boolean win = roll < 50; // 5% win chance
BigDecimal payout = win ? bet.multiply(BigDecimal.valueOf(10)) : BigDecimal.ZERO;


if (win) player.getWallet().credit(payout);
return new SpinResult(win, payout);
}
}
