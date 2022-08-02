public class AndroidOS {
    public AndroidOS() {
        System.out.println("AndroidOS Booting Up...");
    }

    public void runQuizApp() {
        // Create three questions here
        Question question1 = new Question(921238, "How tall is the Eiffel tower?", "1024 ft", "1063 ft", "1124 ft", "1163 ft", 1);

        System.out.println("Question 1: " +  question1.questionText);
        System.out.println("The answer is, " + question1.answer1);
        question1.playerAnswer = 1;
        System.out.println("The player chose: " + question1.playerAnswer);

        Question question2 = new Question(107343, "Who invented the computer algorithm?", "Charles Babbage", "John Carmack", "Alan Turing", "Ada Lovelace", 3);
        System.out.println("Question 2: " +  question2.questionText);
        System.out.println("The answer is, " + question2.answer2);
        question2.playerAnswer = 2;
        System.out.println("The player chose: " + question2.playerAnswer);

        Question question3 = new Question(748294, "What is the name for the patch of skin found on your elbow?", "Elbow Skin", "Fascia Elbora", "Wenis", "Todd", 2);
        System.out.println("Question 3: " +  question3.questionText);
        System.out.println("The answer is, " + question3.answer3);
        question3.playerAnswer = 3;
        System.out.println("The player chose: " + question3.playerAnswer);

        //System.out.println(question1.imageId);
        System.out.println("Question 1: " + question1.questionText);
        System.out.println("Question 1 Correct Answer: " + question1.correctAnswer);
        System.out.println("Question 2, answer0: " + question2.answer0);
        System.out.println("Question 3, answer3: " + question2.answer3);
    }

    public static void main(String[] args) {
        System.out.println("Starting: AndroidOS");
        AndroidOS androidOS = new AndroidOS();
        androidOS.runQuizApp();
    }
}