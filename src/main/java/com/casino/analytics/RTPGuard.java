public class RTPGuard {
public void validate(double rtp) {
if (rtp < 0.90 || rtp > 0.98)
throw new IllegalStateException("RTP anomaly detected");
}
}
