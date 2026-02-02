@Entity
@Table(name = "players")
public class PlayerEntity {
@Id @GeneratedValue
private Long id;


@Column(unique = true)
private String username;


private BigDecimal balance;


@Version
private Long version; // optimistic locking
}
