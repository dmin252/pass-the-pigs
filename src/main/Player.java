import java.util.ArrayList;

public class Player {
    private String name;
    String strategy;

    public Player(String name) {
        this.name = name;
    }
    public boolean wantsToRoll(int myScore, int handScore, ArrayList<Integer> otherScores, int winning_score) {
        return true;
    }

    public String getName() {
        return name;
    }

    public String getStrategy() {
        return strategy;
    }
}
