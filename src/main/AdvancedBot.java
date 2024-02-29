import java.util.ArrayList;

public class AdvancedBot extends Player {

    public AdvancedBot(String name) {
        super(name);
        strategy = "Advanced Strategy";
    }

    public boolean wantsToRoll(int myScore, int handScore, ArrayList<Integer> otherScores, int winningScore) {
        int totalOpponentsScore = 0;
        for (int score : otherScores) {
            totalOpponentsScore += score;
        }
        int averageOpponentScore = totalOpponentsScore / otherScores.size();

        boolean isLeading = myScore > averageOpponentScore;

        if ((!isLeading && averageOpponentScore - myScore < 20) ||
            (myScore + handScore < winningScore - 20 && handScore < averageOpponentScore) ||
            (isLeading && myScore < winningScore - 30)) {
            return true;
        }
        return false;
    }
}
