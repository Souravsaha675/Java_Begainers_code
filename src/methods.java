public class methods {
    public static void main(String[] args) {
        boolean gameover = true;
        int score = 800;
        int levelComplete = 5;
        int bonus = 100;

        int highScore = calculateScore(gameover, score, levelComplete, bonus);
        System.out.println("Your final score is" + highScore);

        score = 10000;
        levelComplete = 8;
        bonus = 200;

        highScore = calculateScore(gameover, score, levelComplete, bonus);
        System.out.println("Your final score is" + highScore);

        int highScorePosition = calcilateHighScorePosition(1000);
        displayHighScorePosition("Sourav", highScorePosition);

        highScorePosition = calcilateHighScorePosition(900);
        displayHighScorePosition("Bob", highScorePosition);

        highScorePosition = calcilateHighScorePosition(400);
        displayHighScorePosition("Tim", highScorePosition);

        highScorePosition = calcilateHighScorePosition(50);
        displayHighScorePosition("Ram", highScorePosition);
    }

    public static int calculateScore(boolean gameover, int score, int levelcomplete, int bonus) {
        if (gameover) {
            int finalscore = score + (levelcomplete * bonus);
            finalscore += 2000;
            //System.out.println("Your final Score is" + finalscore);
            return finalscore;
        }

        return -1;
    }

    public static void displayHighScorePosition(String name, int position) {
        System.out.println(name + " managed to get into Possition " + position + " on high score table");

    }

    public static int calcilateHighScorePosition(int score) {
        if (score >= 1000) {
            return 1;
        } else if (score >= 500 && score < 1000) {
            return 2;
        } else if (score >= 100 && score < 500) {
            return 3;
        } else {
            return 4;
        }
    }
}
