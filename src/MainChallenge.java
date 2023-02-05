public class MainChallenge {
    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 10000;
        int levelCompleted = 8;
        int bonus = 200;
        int finalScore = score;
        calculateScore();

        score = 10000;
        levelCompleted = 8;
        bonus = 200;
        if (gameOver) {
            finalScore += (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
        }
    }
        public static void calculateScore(){
            boolean gameOver =true;
            int score = 800;
            int levelCompleted = 5;
            int bonus = 100;

            int finalScore = score;

            if (gameOver) {
                finalScore += (levelCompleted * bonus);
                System.out.println("Your final score was " + finalScore);
        }
    }
}
