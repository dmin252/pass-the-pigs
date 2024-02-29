import java.util.ArrayList;
import java.util.Scanner;

public class HumanPlayer extends Player {
    final String strategy;
    Scanner scanner = new Scanner(System.in);
    
    public HumanPlayer(String name) {
        super(name);
        this.strategy = "User Input";
    }
    public boolean wantsToRoll(int myScore, int handScore, ArrayList<Integer> otherScores, int winningScore) {
        System.out.println("Are you rolling the pigges? (Type 1 for Yes / 2 for No)");
        int userInput = scanner.nextInt();
        if (userInput == 1) {
            return true;
        } else {
            return false;
        }
        
    }



}
