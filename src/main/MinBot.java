import java.util.ArrayList;

public class MinBot extends Player{
    private final String strategy;

    public MinBot (String name) {
        super(name);
        strategy = "risky";
    }
    public boolean wantsToRoll(int myScore, int handScore, ArrayList<Integer> otherScores, int winning_score) {
        
        return true;
    }
}
