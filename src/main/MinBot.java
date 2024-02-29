import java.util.ArrayList;

public class MinBot extends Player{
    private final String strategy;

    public MinBot (String name) {
        super(name);
        strategy = "Minion Strategy (One Shot, One Kill)";
    }
    public boolean wantsToRoll(int myScore, int handScore, ArrayList<Integer> otherScores, int winning_score) {
        if (handScore < 100) {
            return true;
        }
        return false;
    }
}
