public class Player {
private final String username;
private final Wallet wallet;


public Player(String username, Wallet wallet) {
this.username = username;
this.wallet = wallet;
}


public Wallet getWallet() { return wallet; }
public String getUsername() { return username; }
}
