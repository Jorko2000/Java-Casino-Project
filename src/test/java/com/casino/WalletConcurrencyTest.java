@Test
void walletThreadSafe() throws Exception {
Wallet wallet = new Wallet(BigDecimal.valueOf(1000));
ExecutorService ex = Executors.newFixedThreadPool(10);
for (int i = 0; i < 100; i++) ex.submit(() -> wallet.debit(BigDecimal.ONE));
ex.shutdown();
}
