public class Pigs {
    final private double dotProbability = 0.349;
    final private double noDotProbability = 0.302;
    final private double RazorBackProbability = 0.224;
    final private double TrotterProbability = 0.088;
    final private double SnouterProbability = 0.03;
    final private double LeaningJowler = 0.007;
    
    private String PigPossible() {
        double randomValue = Math.random();
        if (randomValue < dotProbability) {
            return "Dot";
        } else if (randomValue < dotProbability + noDotProbability) {
            return "No Dot";
        } else if (randomValue < dotProbability + noDotProbability + RazorBackProbability) {
            return "RazorBack";
        } else if (randomValue < dotProbability + noDotProbability + RazorBackProbability + TrotterProbability) {
            return "Trotter";
        } else if (randomValue < dotProbability + noDotProbability + RazorBackProbability + TrotterProbability + SnouterProbability) {
            return "Snouter";
        } else {
            return "LeaningJowler";
        }

        
    }
    public String[] rollPigs() {
        String[] rollPigs = new String[2];
        rollPigs[0] = PigPossible();
        rollPigs[1] = PigPossible();

        return rollPigs;

    }
}
