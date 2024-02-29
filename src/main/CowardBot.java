import java.util.ArrayList;

public class CowardBot extends Player{
    public CowardBot (String name) {
        super(name);
        strategy = "Plays Safe";
    }
    public boolean wantsToRoll(int myScore, int handScore, ArrayList<Integer> otherScores, int winning_score) {
        if (handScore < 15) {
            return true;
        }
        return false;
    }
}
