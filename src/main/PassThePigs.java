import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;

public class PassThePigs {
    private static final int winning_score = 100;
    private static Random random = new Random();
    private static ArrayList<Integer> scores = new ArrayList<Integer>();
    private static ArrayList<Player> players = new ArrayList<Player>();
    private static Pigs gamePigs;
    
    public static void main(String[] args) {
        boolean gamePlaying = true;
        System.out.println("Welcome to Pass the Pigs!");
        gamePigs = new Pigs();

        while (gamePlaying) {
            for (int i = 0; i < players.size(); i++) {
                int currentScore = scores.get(i);
                int handScore = 0;
                while (players.get(i).wantsToRoll(currentScore, handScore, scores, winning_score)) {
                    String[] round = gamePigs.rollPigs();

                    int points = pointCalculation.calculatePoints(round);
                    scores.set(i, scores.get(i) + points);
                    handScore += points;
                    System.out.println(players.get(i).getName() + " rolls a " + round[0] + " and a " + round[1] + " for a roll of " + points);

                    
                    if (scores.get(i) > winning_score) {
                        System.out.println(players.get(i).getName() + " Won! Their strategy was " + players.getStrategy());
                        gamePlaying = false;
                    }

                }
            }
        }
        
    }
}