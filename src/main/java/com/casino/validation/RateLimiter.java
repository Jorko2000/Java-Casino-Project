@Component
public class RateLimiter {
private final Map<String, Instant> requests = new ConcurrentHashMap<>();


public void check(String user) {
Instant now = Instant.now();
Instant last = requests.get(user);
if (last != null && Duration.between(last, now).toMillis() < 300)
throw new IllegalStateException("Too many requests");
requests.put(user, now);
}
}
