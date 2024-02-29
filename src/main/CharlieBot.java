import java.util.ArrayList;

public class CharlieBot extends Player {
    public CharlieBot (String name) {
        super(name);
        strategy = "Safe but Greedy";
    }
    public boolean wantsToRoll(int myScore, int handScore, ArrayList<Integer> otherScores, int winning_score) {
        if (handScore > 25) {
            return false;
        }
        return true;
    }
}
