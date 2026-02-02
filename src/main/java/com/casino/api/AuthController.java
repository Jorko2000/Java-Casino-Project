@RestController
@RequestMapping("/api/auth")
public class AuthController {
private final JwtUtil jwt;


public AuthController(JwtUtil jwt) { this.jwt = jwt; }


@PostMapping("/login")
public String login(@RequestParam String user) {
return jwt.generate(user);
}
}
