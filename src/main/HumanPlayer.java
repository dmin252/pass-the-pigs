import java.util.ArrayList;
import java.util.Scanner;

public class HumanPlayer extends Player {
    Scanner scanner = new Scanner(System.in);
    private final String strategy;

    public HumanPlayer(String name) {
        super(name);
        strategy = "User Input";
    }
    public boolean wantsToRoll(int myScore, int handScore, ArrayList<Integer> otherScores, int winningScore) {
        return true;
    }



}
