import java.util.ArrayList;

public class CharlieBot extends Player {
    public CharlieBot (String name) {
        super(name);
        strategy = "Winning Strategy(25 then stop)";
    }
    public boolean wantsToRoll(int myScore, int handScore, ArrayList<Integer> otherScores, int winning_score) {
        if (handScore > 25) {
            return false;
        }
        return true;
    }
}
