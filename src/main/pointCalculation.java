public class pointCalculation {
    public static int calculatePoints(String[] roll) {
        int totalScore = 0;
        if ((roll[0].equals("No Dot") && roll[1].equals("Dot")) || (roll[1].equals("No Dot") && roll[0].equals("Dot"))) {
            return totalScore;
        }

        if (roll[0].equals("Trotter") || roll[0].equals("RazorBack")) {
            totalScore += 5;
        } else if (roll[0].equals("Snouter")) {
            totalScore += 10;
        } else if (roll[0].equals("LeaningJowler")) {
            totalScore += 15;
        } else if (roll[1].equals("Trotter") || roll[1].equals("RazorBack")) {
            totalScore += 5;
        } else if (roll[1].equals("Snouter")) {
            totalScore += 10;
        } else if (roll[1].equals("LeaningJowler")) {
            totalScore += 15;
        }

        if (totalScore == 0) {
            return 1;
        } else if (roll[0].equals(roll[1])) {
            totalScore *= 4;
        }
        return totalScore;
    }
}
