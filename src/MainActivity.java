import java.util.ArrayList;

public class MainActivity {

    // TODO #1: add integer member variables here
    int currentQuestionIndex;
    int totalCorrect;
    int totalQuestions;

    // TODO #2: add ArrayList member variable here
    ArrayList<Question> questions = new ArrayList<Question>();

    // TODO #3 add startNewGame() here
    void startNewGame() {
        // Create three questions here
        Question question1 = new Question(921238, "How tall is the Eiffel tower?", "1024 ft", "1063 ft", "1124 ft", "1163 ft", 1);

        System.out.println("Question 1: " +  question1.questionText);
        System.out.println("The answer is, " + question1.answer1);
        question1.playerAnswer = 1;
        System.out.println("The player chose: " + question1.playerAnswer);

        Question question2 = new Question(107343, "Who invented the computer algorithm?", "Charles Babbage", "John Carmack", "Alan Turing", "Ada Lovelace", 3);
        System.out.println("Question 2: " +  question2.questionText);
        System.out.println("The answer is, " + question2.answer2);
        question2.playerAnswer = 3;
        System.out.println("The player chose: " + question2.playerAnswer);

        Question question3 = new Question(748294, "What is the name for the patch of skin found on your elbow?", "Elbow Skin", "Fascia Elbora", "Wenis", "Todd", 2);
        System.out.println("Question 3: " +  question3.questionText);
        System.out.println("The answer is, " + question3.answer3);
        question3.playerAnswer = 2;
        System.out.println("The player chose: " + question3.playerAnswer);

        //ArrayList<Question> questions = new ArrayList<Question>();
        questions.add(question1);
        questions.add(question2);
        questions.add(question3);

        totalCorrect = 0;
        totalQuestions = questions.size();

        Question firstQuestion = chooseNewQuestion();
        // displayQuestion(firstQuestion);
        // displayQuestionsRemaining(questions.size());
    }
    // TODO #4 add chooseNewQuestion() here
    Question chooseNewQuestion() {
        int randNum = generateRandomNumber(questions.size() - 1);
        currentQuestionIndex = randNum;
        return questions.get(currentQuestionIndex);
    }

    // TODO #5 add getCurrentQuestion() here
    Question getCurrentQuestion() {
        return questions.get(currentQuestionIndex);
    }
    // TODO #6 add onAnswerSubmission() here
    void onAnswerSubmission(){
        Question currentQ = getCurrentQuestion();
        if (currentQ.isCorrect()) {
            totalCorrect += 1;
            questions.remove(currentQ);
        }
        questions.remove(currentQuestionIndex);
        // displayQuestionsRemaining(questions.size());
        if (questions.size() == 0) {
            System.out.println("Game over!");
            startNewGame();
            chooseNewQuestion();
        } else {

            // TODO: uncomment after implementing displayQuestion()
            // displayQuestion(getCurrentQuestion());
        }
    }

    int generateRandomNumber(int max) {
        double randomNumber = Math.random();
        double result = max * randomNumber;
        return (int) result;
    }

    String getGameOverMessage(int totalCorrect, int totalQuestions) {
        if (totalCorrect == totalQuestions) {
            return "You got all " + totalQuestions + " right! You won!";
        } else {
            return "You got " + totalCorrect + " right out of " + totalQuestions + ". Better luck next time!";
        }
    }
}