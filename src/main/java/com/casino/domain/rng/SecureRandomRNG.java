public class SecureRandomRNG implements RandomNumberGenerator {
private final SecureRandom random = new SecureRandom();


@Override
public int nextInt(int bound) {
return random.nextInt(bound);
}
}
