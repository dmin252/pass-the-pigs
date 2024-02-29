import java.util.ArrayList;

public class SmartBot extends Player {
    
    public SmartBot(String name) {
        super(name);
        strategy = "Smart Strategy";
    }

    public boolean wantsToRoll(int myScore, int handScore, ArrayList<Integer> otherScores, int winningScore) {
        // Strategy: SmartBot will roll until its current hand score is at least 25 points or it's close to winning.
        if (handScore < 25 || myScore + handScore > winningScore - 15) {
            return true;
        }
        return false;
    }
}


