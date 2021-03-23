// Ivan Zelenkov Problem 5 (Monster Factory)

public class Player {
    private String playerName;
    private int playerHealth;

    public Player(String playerName, int playerHealth) {
        this.playerName = playerName;
        this.playerHealth = playerHealth;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName() {
        this.playerName = playerName;
    }

    public int getPlayerHealth() {
        return playerHealth;
    }

    public void setPlayerHealth() {
        this.playerHealth = playerHealth;
    }

    public void takeDamage(int damage) {
        playerHealth -= damage;
    }
}
