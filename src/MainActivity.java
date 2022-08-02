public class MainActivity {

    // Add generateRandomNumber() here
    int generateRandomNumber(int max) {
        double randomDouble = Math.random();
        randomDouble = (randomDouble * max);
        int randomNum = (int)randomDouble;
        return randomNum;
    }

    // Add getGameOverMessage() here
    String getGameOverMessage(int totalCorrect, int totalQuestions) {
        if (totalCorrect == totalQuestions) {
            String winMessage = "You got all " + totalQuestions + " right! You won!";
            //System.out.println(winMessage);
            return winMessage;
        } else {
            String loseMessage = "You got " + totalCorrect + " right out of " + totalQuestions + ". Better luck next time!";
            //System.out.println(loseMessage);
            return loseMessage;
        }

    }
}