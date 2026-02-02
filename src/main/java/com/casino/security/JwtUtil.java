@Component
public class JwtUtil {
private final Key key = Keys.secretKeyFor(SignatureAlgorithm.HS256);


public String generate(String username) {
return Jwts.builder()
.setSubject(username)
.setIssuedAt(new Date())
.setExpiration(new Date(System.currentTimeMillis() + 3600000))
.signWith(key)
.compact();
}
}
