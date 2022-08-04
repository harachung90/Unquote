public class Main {
    public static void main(String[] args) {
/*        Question testQuestion = new Question(0, "Who invented the computer algorithm?", "Bill Gates", "Charles Babbage", "Ada Lovelace", "Leonardo DaVinci", 2);

        System.out.println("The player’s guess is: " + testQuestion.playerAnswer);
        if (testQuestion.playerAnswer == -1) {
            System.out.println("Default answer selected!");
        }
        testQuestion.playerAnswer = 2;
        System.out.println("The player’s guess is: " + testQuestion.playerAnswer);
        if (testQuestion.isCorrect()) {
            System.out.println("The player’s guess is correct!");
        } else {
            System.out.println("The player’s guess is incorrect!");
        }

        MainActivity mainActivity = new MainActivity();
        System.out.println("A random number between 0 and 50: " + mainActivity.generateRandomNumber(50));
        System.out.println("A random number between 0 and 1000: " + mainActivity.generateRandomNumber(1000));
        System.out.println("A random number between 0 and 1 million: " + mainActivity.generateRandomNumber(1000000));

        System.out.println("Game over test 1 (should be 2 out of 3): " + mainActivity.getGameOverMessage(2, 3));
        System.out.println("Game over test 2 (should be 4 out of 4): " + mainActivity.getGameOverMessage(4, 4));*/

        MainActivity mainActivity = new MainActivity();
        mainActivity.startNewGame();

        System.out.println("Questions remaining: " + mainActivity.totalQuestions);
        Question currentQuestion = mainActivity.getCurrentQuestion();
        printQuestion(currentQuestion);
        // Play the game!
        /*mainActivity.getCurrentQuestion();
        printQuestion(currentQuestion);
        mainActivity.onAnswerSubmission();*/
        mainActivity.onAnswerSubmission();
    }

    static void printQuestion(Question question) {
        System.out.println("Question: " + question.questionText);
        System.out.println("Option 1: " + question.answer0);
        System.out.println("Option 2: " + question.answer1);
        System.out.println("Option 3: " + question.answer2);
        System.out.println("Option 4: " + question.answer3);

    }
}