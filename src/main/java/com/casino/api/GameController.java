@RestController
@RequestMapping("/api/games")
public class GameController {
private final GameService service;


public GameController(GameService service) {
this.service = service;
}


@PostMapping("/slot/spin")
public SpinResult spin(@RequestParam BigDecimal bet) {
return service.spin(bet);
}
}
