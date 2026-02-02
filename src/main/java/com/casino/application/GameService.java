@Service
public class GameService {
private final SlotEngine engine = new SecureSlotEngine(new SecureRandomRNG());
private final Player player = new Player("demo", new Wallet(BigDecimal.valueOf(1000)));


public SpinResult spin(BigDecimal bet) {
return engine.spin(player, bet);
}
}
