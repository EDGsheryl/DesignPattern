package Strategy;

public class Player {
    private final String name;
    private final Strategy strategy;
    private int win_count;
    private int lose_count;
    private int game_count;

    public Player(String name, Strategy strategy) {
        this.name = name;
        this.strategy = strategy;
    }

    public Hand nextHand() {
        return strategy.nextHand();
    }

    public void win() {
        strategy.study(true);
        win_count++;
        game_count++;
    }

    public void lose() {
        strategy.study(false);
        lose_count++;
        game_count++;
    }

    public void even() {
        game_count++;
    }

    public String toString() {
        return "[" + name + ":" + game_count + " games, " + win_count + " win, " + lose_count + " lose" + "]";
    }
}
