public class BetValidator {
private static final BigDecimal MAX_BET = BigDecimal.valueOf(1000);


public static void validate(BigDecimal bet, Wallet wallet) {
if (bet.compareTo(BigDecimal.ZERO) <= 0)
throw new IllegalArgumentException("Invalid bet");
if (bet.compareTo(MAX_BET) > 0)
throw new IllegalArgumentException("Bet too large");
}
}
