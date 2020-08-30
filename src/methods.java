public class methods {
    public static void main(String[] args) {
        boolean gameover = true;
        int score = 800;
        int levelComplete = 5;
        int bonus = 100;

        calculateScore(gameover, score, levelComplete, bonus);

        score = 10000;
        levelComplete = 8;
        bonus = 200;

        calculateScore(gameover, score, levelComplete, bonus);

    }

    public static int calculateScore(boolean gameover, int score, int levelcomplete, int bonus) {
        if (gameover) {
            int finalscore = score + (levelcomplete * bonus);
            finalscore += 2000;
            System.out.println("Your final Score is" + finalscore);
            return finalscore;
        }

        return -1;
    }
}
