import java.awt.font.TextAttribute;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class WPMProgram {
    static String FirstWordArray[] = {"well", "choice"};
    static String FirstWord = FirstWordArray[new Random().nextInt(FirstWordArray.length)];

    static String SeccondWordArray[] = {"how", "about"};
    static String SecondWord = SeccondWordArray[new Random().nextInt(SeccondWordArray.length)];

    static String ThirdWordArray [] = {"this", "is"};
    static String ThirdWord = ThirdWordArray[new Random().nextInt(ThirdWordArray.length)];

    static String FourthWordArray [] = {"a", "test"};
    static String FourthWord = FourthWordArray[new Random().nextInt(FourthWordArray.length)];

    static String FifthWordArray [] = {"for", "you"};
    static String FifthWord = FifthWordArray[new Random().nextInt(FifthWordArray.length)];

    static String SixthWordArray [] = {"please", "enter"};
    static String SixthWord = SixthWordArray[new Random().nextInt(SixthWordArray.length)];

    static String SeventhWordArray [] = {"my", "name"};
    static String SeventhWord = SeventhWordArray[new Random().nextInt(SeventhWordArray.length)];

    static String EightWordArray [] = {",", "then"};
    static String EightWord = EightWordArray[new Random().nextInt(EightWordArray.length)];

    static String NinthWordArray [] = {"course", "age"};
    static String NinthWord = NinthWordArray[new Random().nextInt(NinthWordArray.length)];

    static String TenthWordArray [] = {"chill", "sleeping"};
    static String TenthWord = TenthWordArray[new Random().nextInt(TenthWordArray.length)];


    static String[] words = {FirstWord, SecondWord, ThirdWord, FourthWord, FifthWord, SixthWord, SeventhWord, EightWord, NinthWord, TenthWord,};


    public static void main(String[] args) throws InterruptedException {

        class ConsoleColors {
            // Reset
            public static final String RESET = "\033[0m";  // Text Reset

            // Regular Colors
            public static final String BLACK = "\033[0;30m";   // BLACK
            public static final String RED = "\033[0;31m";     // RED
            public static final String GREEN = "\033[0;32m";   // GREEN
            public static final String YELLOW = "\033[0;33m";  // YELLOW
            public static final String BLUE = "\033[0;34m";    // BLUE
            public static final String PURPLE = "\033[0;35m";  // PURPLE
            public static final String CYAN = "\033[0;36m";    // CYAN
            public static final String WHITE = "\033[0;37m";   // WHITE

            // Bold
            public static final String BLACK_BOLD = "\033[1;30m";  // BLACK
            public static final String RED_BOLD = "\033[1;31m";    // RED
            public static final String GREEN_BOLD = "\033[1;32m";  // GREEN
            public static final String YELLOW_BOLD = "\033[1;33m"; // YELLOW
            public static final String BLUE_BOLD = "\033[1;34m";   // BLUE
            public static final String PURPLE_BOLD = "\033[1;35m"; // PURPLE
            public static final String CYAN_BOLD = "\033[1;36m";   // CYAN
            public static final String WHITE_BOLD = "\033[1;37m";  // WHITE

            // Underline
            public static final String BLACK_UNDERLINED = "\033[4;30m";  // BLACK
            public static final String RED_UNDERLINED = "\033[4;31m";    // RED
            public static final String GREEN_UNDERLINED = "\033[4;32m";  // GREEN
            public static final String YELLOW_UNDERLINED = "\033[4;33m"; // YELLOW
            public static final String BLUE_UNDERLINED = "\033[4;34m";   // BLUE
            public static final String PURPLE_UNDERLINED = "\033[4;35m"; // PURPLE
            public static final String CYAN_UNDERLINED = "\033[4;36m";   // CYAN
            public static final String WHITE_UNDERLINED = "\033[4;37m";  // WHITE

            // Background
            public static final String BLACK_BACKGROUND = "\033[40m";  // BLACK
            public static final String RED_BACKGROUND = "\033[41m";    // RED
            public static final String GREEN_BACKGROUND = "\033[42m";  // GREEN
            public static final String YELLOW_BACKGROUND = "\033[43m"; // YELLOW
            public static final String BLUE_BACKGROUND = "\033[44m";   // BLUE
            public static final String PURPLE_BACKGROUND = "\033[45m"; // PURPLE
            public static final String CYAN_BACKGROUND = "\033[46m";   // CYAN
            public static final String WHITE_BACKGROUND = "\033[47m";  // WHITE

            // High Intensity
            public static final String BLACK_BRIGHT = "\033[0;90m";  // BLACK
            public static final String RED_BRIGHT = "\033[0;91m";    // RED
            public static final String GREEN_BRIGHT = "\033[0;92m";  // GREEN
            public static final String YELLOW_BRIGHT = "\033[0;93m"; // YELLOW
            public static final String BLUE_BRIGHT = "\033[0;94m";   // BLUE
            public static final String PURPLE_BRIGHT = "\033[0;95m"; // PURPLE
            public static final String CYAN_BRIGHT = "\033[0;96m";   // CYAN
            public static final String WHITE_BRIGHT = "\033[0;97m";  // WHITE

            // Bold High Intensity
            public static final String BLACK_BOLD_BRIGHT = "\033[1;90m"; // BLACK
            public static final String RED_BOLD_BRIGHT = "\033[1;91m";   // RED
            public static final String GREEN_BOLD_BRIGHT = "\033[1;92m"; // GREEN
            public static final String YELLOW_BOLD_BRIGHT = "\033[1;93m";// YELLOW
            public static final String BLUE_BOLD_BRIGHT = "\033[1;94m";  // BLUE
            public static final String PURPLE_BOLD_BRIGHT = "\033[1;95m";// PURPLE
            public static final String CYAN_BOLD_BRIGHT = "\033[1;96m";  // CYAN
            public static final String WHITE_BOLD_BRIGHT = "\033[1;97m"; // WHITE

            // High Intensity backgrounds
            public static final String BLACK_BACKGROUND_BRIGHT = "\033[0;100m";// BLACK
            public static final String RED_BACKGROUND_BRIGHT = "\033[0;101m";// RED
            public static final String GREEN_BACKGROUND_BRIGHT = "\033[0;102m";// GREEN
            public static final String YELLOW_BACKGROUND_BRIGHT = "\033[0;103m";// YELLOW
            public static final String BLUE_BACKGROUND_BRIGHT = "\033[0;104m";// BLUE
            public static final String PURPLE_BACKGROUND_BRIGHT = "\033[0;105m"; // PURPLE
            public static final String CYAN_BACKGROUND_BRIGHT = "\033[0;106m";  // CYAN
            public static final String WHITE_BACKGROUND_BRIGHT = "\033[0;107m";   // WHITE
        }




        System.out.println("Welcome to the WPM program!");
        System.out.println("Please enter your name: ");
        Scanner scanner = new Scanner(System.in);
        String usersName = scanner.nextLine();


        // while playAgain is true, run the program
        // if playAgain is false, exit the program
        boolean playAgain = true;
        while (playAgain) {

            // Countdown
            System.out.println(ConsoleColors.RED + "3"+
                    ConsoleColors.RESET);
            // Using java.util.concurrent.TimeUnit we can use the sleep method to pause the program for a certain amount of time which in this case is 1 second
            TimeUnit.SECONDS.sleep(1);

            System.out.println(ConsoleColors.YELLOW_BRIGHT+ "2"+
                    ConsoleColors.RESET);
            TimeUnit.SECONDS.sleep(1);

            System.out.println(ConsoleColors.GREEN + "1"+
                    ConsoleColors.RESET);
            TimeUnit.SECONDS.sleep(1);

            System.out.println(" ");
            System.out.println(ConsoleColors.GREEN_BOLD + "GO!"+
                    ConsoleColors.RESET);
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



            if (userTypedWords.length() > 10) {
                //create new method called moreThan10
                moreThan10(userTypedWords, wpm);

            }
            if (userTypedWords.length() < 10) {
                //create new method called lessThan10
                lessThan10(userTypedWords);
            }













            // Ask user if they want to play again
            System.out.println("Do you want to play again? (yes/no)");
            String answer = scan.nextLine();

            // Ask user if they want to play again and keep on asking until they give a valid answer
            while (!answer.equals("yes") && !answer.equals("no")) {
                System.out.println("Please enter yes or no");
                answer = scan.nextLine();
            }

            // If the answer is yes, run the program again
            if (answer.equals("yes")) {
                playAgain = true;
            }
            // If the answer is no, exit the program
            else {

                System.out.println(ConsoleColors.BLUE + "Thanks for playing " + usersName + "!" +
                        ConsoleColors.RESET);
                playAgain = false;
            }

        }




    }



    private static void lessThan10(String userTypedWords) {
        // If userTypedWords is less than 10 words add spaces to the end of the string and make the variable named userTypedWordsLess10
        String userTypedWordsLess10 = userTypedWords;
        int numSpaces = 10 - userTypedWords.length();
        for (int i = 0; i < numSpaces; i++) {
            userTypedWordsLess10 += " ";

        }


    }

    public static void moreThan10(String userTypedWords, double seconds) {
        // If the user typed more than 10 words, delete the extra words
        userTypedWords = userTypedWords.substring(0, 10);
        // Calculate the words per minute by dividing the number of words typed by the elapsed time in seconds



    }


    public static void colourizedMethod() {
        // method that prints the user all the words that he got wrong and the words that he got right
        // All the words got right will be in green and all the words got wrong will be in red

    }

    // Create a public method called ignoreExtra that ignores any input beyond 10 words


    // splitWords method splits the users input into an array of words and returns the array of words to the main method so it can be used in the checkWords method to compare the users input to the randomly generated words
    public static boolean CheckCharacters(String userTypedWords, String[] words) {
        // Split users input into an array of characters
        char[] userChars = userTypedWords.toCharArray();
        // Split the randomly generated words into an array of characters
        char[] wordChars = words[0].toCharArray();
        //Variable called correctChars that is equal to 0
        int correctChars = 0;


        // Loop through the randomly generated words
        for (int i = 0; i < wordChars.length; i++) {
            // Loop through the users input
            for (int j = 0; j < userChars.length; j++) {
                // If the randomly generated word and the users input are the same, add 1 to the correctChars variable
                if (wordChars[i] == userChars[j]) {
                    correctChars++;
                }
            }
        }
        // If the number of correct characters is equal to the number of characters in the randomly generated word, return true
        if (correctChars == wordChars.length) {
            return true;
        }
        // If the number of correct characters is not equal to the number of characters in the randomly generated word, return false
        else {
            return false;
        }



    }
    // Method checkWords checks the users input against the randomly generated words and returns true if the users input is equal to the randomly generated words and false if the users input is not equal to the randomly generated words
    public static boolean checkWords(String[] splitWords, String[] words) {
        boolean correct = true;
        for (int i = 0; i < splitWords.length; i++) {
            if (!splitWords[i].equals(words[i])) {
                correct = false;
            }
            // if users input of words is more than the randomly generated words ignore the extra words
            else if (splitWords.length > words.length) {
                correct = false
                ;
            }

        }
        return correct;
    }

    public static String[] splitWords(String userTypedWords) {
        String[] userTypedWordsSplit = userTypedWords.split(" ");
        return userTypedWordsSplit;

    }





    public static void randomWords() {
        //  unnecessary, but I'm leaving it in for now
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



