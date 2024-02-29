import java.util.ArrayList;

public class RandomBot extends Player{
    public RandomBot(String name) {
        super(name);
        strategy = "Random";
    }
    public boolean wantsToRoll(int myScore, int handScore, ArrayList<Integer> otherScores, int winning_score) {
        double randomNumber = Math.random();
        if (randomNumber > 0.5) {
            return true;
        }
        return false;
    }
}
