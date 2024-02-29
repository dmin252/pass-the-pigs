import java.util.ArrayList;

public class PassThePigs {
    private static final int winning_score = 100;
    private static ArrayList<Integer> scores = new ArrayList<Integer>();
    private static ArrayList<Player> players = new ArrayList<Player>();
    private static Pigs gamePigs;
    
    public static void main(String[] args) {
        boolean gamePlaying = true;
        System.out.println("Welcome to My Pass-the-Pigs Game!");
        gamePigs = new Pigs();
        //players.add(new HumanPlayer("Daniel"));
        players.add(new MinBot("Min"));
        players.add(new CharlieBot("Charlie"));
        players.add(new RandomBot("Randomer"));
        players.add(new CowardBot("Coward"));
        players.add(new SmartBot("Smart"));
        players.add(new AdvancedBot("Advanced"));

        for (int k = 0; k < players.size(); k++) {
            scores.add(0);
        }

        while (gamePlaying) {
            for (int i = 0; i < players.size(); i++) {
                System.out.println(players.get(i).getName() + "'s turn");
                int currentScore = scores.get(i);
                int handScore = 0;
                while (players.get(i).wantsToRoll(currentScore, handScore, scores, winning_score)) {
                    String[] round = gamePigs.rollPigs(); //each pigs

                    int points = pointCalculation.calculatePoints(round);
                    scores.set(i, scores.get(i) + points);
                    handScore += points;
                    System.out.println(players.get(i).getName() + " rolls a " + round[0] + " and a " + round[1] + " for " + points + " points.");
                    System.out.println(players.get(i).getName() + "'s handscore is " + handScore);

                    //end game if score over 100
                    if (scores.get(i) >= winning_score) {
                        System.out.println(players.get(i).getName() + " Won! Their strategy was " + players.get(i).getStrategy());
                        gamePlaying = false;
                        return;
                    }
                    if (points == 0) {
                        handScore = 0;
                        scores.set(i, currentScore);
                        System.out.println("That's a Pig Out!");
                        break;
                        
                    } 
                    
                    for (int j = 0; j < players.size(); j++) {
                        System.out.println(players.get(j).getName() + "'s score is " + scores.get(j));
                    }
                    

                    
                    System.out.println();
                }
                System.out.println("--------------------------------------------------------------------");

            }
        }
    }
        
    
}