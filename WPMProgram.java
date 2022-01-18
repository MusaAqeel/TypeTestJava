import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class WPMProgram {
    static String FirstWord = "Hello";
    static String SeccondWord = "Hello";
    static String ThirdWord = "Hello";
    static String FourthWord = "Hello";
    static String FifthWord = "Hello";
    static String SixthWord = "Hello";
    static String SeventhWord = "Hello";
    static String EightWord = "Hello";
    static String NinthWord = "Hello";
    static String TenthWord = "Hello";




    static String[] words = {FirstWord, SeccondWord, ThirdWord, FourthWord, FifthWord, SixthWord, SeventhWord, EightWord, NinthWord, TenthWord,};








    public static void main(String[] args) throws InterruptedException {


        System.out.println("Welcome to the WPM program!");
        System.out.println("Please enter your name: ");
        Scanner scanner = new Scanner(System.in);
        String usersName = scanner.nextLine();




        // while playAgain is true, run the program
        // if playAgain is false, exit the program
        boolean playAgain = true;
        while (playAgain) {

            // Countdown
            System.out.println("3");
            // Using java.util.concurrent.TimeUnit we can use the sleep method to pause the program for a certain amount of time which in this case is 1 second
            TimeUnit.SECONDS.sleep(1);

            System.out.println("2");
            TimeUnit.SECONDS.sleep(1);

            System.out.println("1");
            TimeUnit.SECONDS.sleep(1);

            System.out.println("GO!");
            //
            Random rand = new Random();

            // Randomly generate 10 numbers between 0 and 9
            randomWords();

            // and use them to select words from the array
            // Whatever number rand1 is, it will be the index of the word in the array
            int rand1 = rand.nextInt(10);
            int rand2 = rand.nextInt(10);
            int rand3 = rand.nextInt(10);
            int rand4 = rand.nextInt(10);
            int rand5 = rand.nextInt(10);
            int rand6 = rand.nextInt(10);
            int rand7 = rand.nextInt(10);
            int rand8 = rand.nextInt(10);
            int rand9 = rand.nextInt(10);
            int rand10 = rand.nextInt(10);

            // Print out the randomly generated words
            System.out.println("\n" + words[rand1] + " " + words[rand2] + " " + words[rand3] + " " + words[rand4] + " " + words[rand5] + " " + words[rand6] + " " + words[rand7] + " " + words[rand8] + " " + words[rand9] + " " + words[rand10]);
            // and print them out



            System.out.println();
            // Java.Util.LocalTime to get the nano seconds of the day we are currently in
            double start = LocalTime.now().toNanoOfDay();
            //Get users input and store it in a string called typedWords
            Scanner scan = new Scanner(System.in);
            String userTypedWords = scan.nextLine();

            // Java.Util.LocalTime to get the nano seconds of the day we are currently in
            double end = LocalTime.now().toNanoOfDay();
            double elapsedTime = (end - start);
            // Calculate the elapsed time in seconds by subtracting the  time from the end time
            double seconds = elapsedTime / 1000000000.0;

            // Calculate the words per minute by dividing the number of words typed by the elapsed time in seconds
            int numChars = userTypedWords.length();
            // (x characters| / 5) / 1min = y WPM
            int wpm = (int) (((double) numChars / 5) / seconds * 60);

            System.out.println(usersName.substring(0, 1).toUpperCase() + usersName.substring(1) +", you typed " + numChars + " characters in " + seconds + " seconds.");



             // Split users input into an array of words
            String [] userTypedWordsSplit = userTypedWords.split(" "); //all parts stored in an array

            // Code bellow splits the strings into individual words
            System.out.println(userTypedWordsSplit[0]);
            System.out.println(userTypedWordsSplit[1]);
            //System.out.println(userTypedWordsSplit[2]);
            //System.out.println(userTypedWordsSplit[3]);
            //System.out.println(userTypedWordsSplit[4]);
            //System.out.println(userTypedWordsSplit[5]);
            //System.out.println(userTypedWordsSplit[6]);
            //System.out.println(userTypedWordsSplit[7]);
            //System.out.println(userTypedWordsSplit[8]);
            //System.out.println(userTypedWordsSplit[9]);

            //Create num variable to store the number of words typed correctly
            int number1 = 0;
            int number2 = 0;
            int number3 = 0;
            int number4 = 0;
            int number5 = 0;
            int number6 = 0;
            int number7 = 0;
            int number8 = 0;
            int number9 = 0;
            int number10 = 0;


            // Compare userTypedWordsSplit[0] to words[rand1] and if correct, add 1 to correctWords
            if (userTypedWordsSplit[0].equals(words[rand1])) {
                // Add 1 to correctWords
                number1 = number1 + 1;

            }
            // Compare userTypedWordsSplit[1] to words[rand2] and if correct, add 1 = to correctWords
            if (userTypedWordsSplit[1].equals(words[rand2])) {
                number2 = number2 + 1;

            }
            // Compare userTypedWordsSplit[2] to words[rand3] and if correct, add 1 to correctWords
            if (userTypedWordsSplit[2].equals(words[rand3])) {
                number3 = number3 + 1;
            }
            // Compare userTypedWordsSplit[3] to words[rand4] and if correct, add 1 to correctWords
            if (userTypedWordsSplit[3].equals(words[rand4])) {
                number4 = number4 + 1;
            }
            // Compare userTypedWordsSplit[4] to words[rand5] and if correct, add 1 to correctWords
            if (userTypedWordsSplit[4].equals(words[rand5])) {
                number5 = number5 + 1;

            }
            // Compare userTypedWordsSplit[5] to words[rand6] and if correct, add 1 to correctWords
            if (userTypedWordsSplit[5].equals(words[rand6])) {
                number6 = number6 + 1;

            }
            // Compare userTypedWordsSplit[6] to words[rand7] and if correct, add 1 to correctWords
            if (userTypedWordsSplit[6].equals(words[rand7])) {
                number7 = number7 + 1;
            }
            // Compare userTypedWordsSplit[7] to words[rand8] and if correct, add 1 to correctWords
            if (userTypedWordsSplit[7].equals(words[rand8])) {
                number8 = number8 + 1;
            }
            // Compare userTypedWordsSplit[8] to words[rand9] and if correct, add 1 to correctWords
            if (userTypedWordsSplit[8].equals(words[rand9])) {
                number9 = number9 + 1;
            }
            // Compare userTypedWordsSplit[9] to words[rand10] and if correct, add 1 to correctWords
            if (userTypedWordsSplit[9].equals(words[rand10])) {
                number10 = number10 + 1;

            }

            // Add the number of correct words to the total number of words
            int correctWords = number1 + number2 + number3 + number4 + number5 + number6 + number7 + number8 + number9 + number10;




            // Print the number of words typed correctly
            System.out.println("You typed " + correctWords + " words correctly.");
            //Give percentage of words typed correctly
            System.out.println("You typed " + (correctWords *10)+ "% of the words correctly.");







            //Split userTypedWordsSplit[0] into separate characters that are stored in an array
            char[] userTypedWordsSplit0 = userTypedWordsSplit[0].toCharArray();

            //Split userTypedWordsSplit[1] into separate characters that are stored in an array
            char[] userTypedWordsSplit1 = userTypedWordsSplit[1].toCharArray();

            //Split userTypedWordsSplit[2] into separate characters that are stored in an array
            char[] userTypedWordsSplit2 = userTypedWordsSplit[2].toCharArray();

            //Split userTypedWordsSplit[3] into separate characters that are stored in an array
            char[] userTypedWordsSplit3 = userTypedWordsSplit[3].toCharArray();

            //Split userTypedWordsSplit[4] into separate characters that are stored in an array
            char[] userTypedWordsSplit4 = userTypedWordsSplit[4].toCharArray();

            //Split userTypedWordsSplit[5] into separate characters that are stored in an array
            char[] userTypedWordsSplit5 = userTypedWordsSplit[5].toCharArray();

            //Split userTypedWordsSplit[6] into separate characters that are stored in an array
            char[] userTypedWordsSplit6 = userTypedWordsSplit[6].toCharArray();

            //Split userTypedWordsSplit[7] into separate characters that are stored in an array
            char[] userTypedWordsSplit7 = userTypedWordsSplit[7].toCharArray();

            //Split userTypedWordsSplit[8] into separate characters that are stored in an array
            char[] userTypedWordsSplit8 = userTypedWordsSplit[8].toCharArray();

            //Split userTypedWordsSplit[9] into separate characters that are stored in an array
            char[] userTypedWordsSplit9 = userTypedWordsSplit[9].toCharArray();





            // count the amount of characters in (userTypedWordsSplit[0])
            int numChars0 = userTypedWordsSplit0.length;

            // if the length is 1
            if (numChars0 == 1) {
                System.out.println(userTypedWordsSplit0[0]);

            }
            // if the length is 2
            if (numChars0 == 2) {
                System.out.println(userTypedWordsSplit0[0]);
                System.out.println(userTypedWordsSplit0[1]);
            }


            // if the length is 3
            if (numChars0 == 3) {
                System.out.println(userTypedWordsSplit0[0]);
                System.out.println(userTypedWordsSplit0[1]);
                System.out.println(userTypedWordsSplit0[2]);


            }
            // if the length is 4
            if (numChars0 == 4) {
                System.out.println(userTypedWordsSplit0[0]);
                System.out.println(userTypedWordsSplit0[1]);
                System.out.println(userTypedWordsSplit0[2]);
                System.out.println(userTypedWordsSplit0[3]);


            }
            // if the length is 5
            if (numChars0 == 5) {
                System.out.println(userTypedWordsSplit0[0]);
                System.out.println(userTypedWordsSplit0[1]);
                System.out.println(userTypedWordsSplit0[2]);
                System.out.println(userTypedWordsSplit0[3]);
                System.out.println(userTypedWordsSplit0[4]);


            }
            // if the length is 6
            if (numChars0 == 6) {
                System.out.println(userTypedWordsSplit0[0]);
                System.out.println(userTypedWordsSplit0[1]);
                System.out.println(userTypedWordsSplit0[2]);
                System.out.println(userTypedWordsSplit0[3]);
                System.out.println(userTypedWordsSplit0[4]);
                System.out.println(userTypedWordsSplit0[5]);


            }
            // if the length is 7
            if (numChars0 == 7) {
                System.out.println(userTypedWordsSplit0[0]);
                System.out.println(userTypedWordsSplit0[1]);
                System.out.println(userTypedWordsSplit0[2]);
                System.out.println(userTypedWordsSplit0[3]);
                System.out.println(userTypedWordsSplit0[4]);
                System.out.println(userTypedWordsSplit0[5]);
                System.out.println(userTypedWordsSplit0[6]);


            }

            // if the length is 8
            if (numChars0 == 8) {
                System.out.println(userTypedWordsSplit0[0]);
                System.out.println(userTypedWordsSplit0[1]);
                System.out.println(userTypedWordsSplit0[2]);
                System.out.println(userTypedWordsSplit0[3]);
                System.out.println(userTypedWordsSplit0[4]);
                System.out.println(userTypedWordsSplit0[5]);
                System.out.println(userTypedWordsSplit0[6]);
                System.out.println(userTypedWordsSplit0[7]);



            }
            // if the length is 9
            if (numChars0 == 9) {
                System.out.println(userTypedWordsSplit0[0]);
                System.out.println(userTypedWordsSplit0[1]);
                System.out.println(userTypedWordsSplit0[2]);
                System.out.println(userTypedWordsSplit0[3]);
                System.out.println(userTypedWordsSplit0[4]);
                System.out.println(userTypedWordsSplit0[5]);
                System.out.println(userTypedWordsSplit0[6]);
                System.out.println(userTypedWordsSplit0[7]);
                System.out.println(userTypedWordsSplit0[8]);


            }
            // if the length is 10
            if (numChars0 == 10) {
                System.out.println(userTypedWordsSplit0[0]);
                System.out.println(userTypedWordsSplit0[1]);
                System.out.println(userTypedWordsSplit0[2]);
                System.out.println(userTypedWordsSplit0[3]);
                System.out.println(userTypedWordsSplit0[4]);
                System.out.println(userTypedWordsSplit0[5]);
                System.out.println(userTypedWordsSplit0[6]);
                System.out.println(userTypedWordsSplit0[7]);
                System.out.println(userTypedWordsSplit0[8]);
                System.out.println(userTypedWordsSplit0[9]);
            }

            // if the length is 11
            if (numChars0 == 11) {
                    System.out.println(userTypedWordsSplit0[0]);
                System.out.println(userTypedWordsSplit0[1]);
                System.out.println(userTypedWordsSplit0[2]);
                System.out.println(userTypedWordsSplit0[3]);
                System.out.println(userTypedWordsSplit0[4]);
                System.out.println(userTypedWordsSplit0[5]);
                System.out.println(userTypedWordsSplit0[6]);
                System.out.println(userTypedWordsSplit0[7]);
                System.out.println(userTypedWordsSplit0[8]);
                System.out.println(userTypedWordsSplit0[9]);
                System.out.println(userTypedWordsSplit0[10]);
            }




            System.out.println("You typed " + wpm + " words per minute.");

            // Ask user if they want to play again
            System.out.println("Do you want to play again? (yes/no)");
            String answer = scan.nextLine();

           // Ask user if they want to play again and keep on asking until they give a valid answer
            while (!answer.equals("yes")  && !answer.equals("no")) {
                System.out.println("Please enter yes or no");
                answer = scan.nextLine();
            }

            // If the answer is yes, run the program again
            if (answer.equals("yes")) {
                playAgain = true;
            }
            // If the answer is no, exit the program
            else {
                System.out.println("Thanks for playing " + usersName + "!");
                playAgain = false;
            }

        }



        }



    public static void randomWords() {
        //  rand is unnecessary, but I'm leaving it in for now
        Random rand = new Random();

        Random rand1 = new Random();

        Random rand2 = new Random();

        Random rand3 = new Random();

        Random rand4 = new Random();

        Random rand5 = new Random();

        Random rand6 = new Random();

        Random rand7 = new Random();

        Random rand8 = new Random();

        Random rand9 = new Random();

        Random rand10 = new Random();


    }

}






