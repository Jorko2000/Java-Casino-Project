@Entity
public class GameEvent {
@Id @GeneratedValue
private Long id;
private String username;
private BigDecimal bet;
private BigDecimal payout;
private Instant timestamp;
}
