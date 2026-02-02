public class RTPMonitor {
public double calculate(BigDecimal wagered, BigDecimal paidOut) {
return paidOut.divide(wagered, 4, RoundingMode.HALF_UP).doubleValue();
}
}
