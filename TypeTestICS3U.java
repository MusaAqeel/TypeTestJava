import java.time.LocalTime;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;


class TypeTestICS3U {
    static String FirstWordArray[] = {"first", "first"};
    static String FirstWord = FirstWordArray[new Random().nextInt(FirstWordArray.length)];

    static String SecondWordArray[] = {"second", "second"};
    static String SecondWord = SecondWordArray[new Random().nextInt(SecondWordArray.length)];

    static String ThirdWordArray [] = {"third", "third"};
    static String ThirdWord = ThirdWordArray[new Random().nextInt(ThirdWordArray.length)];

    static String FourthWordArray [] = {"fourth", "fourth"};
    static String FourthWord = FourthWordArray[new Random().nextInt(FourthWordArray.length)];

    static String FifthWordArray [] = {"fifth", "fifth"};
    static String FifthWord = FifthWordArray[new Random().nextInt(FifthWordArray.length)];

    static String SixthWordArray [] = {"sixth", "sixth"};
    static String SixthWord = SixthWordArray[new Random().nextInt(SixthWordArray.length)];

    static String SeventhWordArray [] = {"seventh", "seventh"};
    static String SeventhWord = SeventhWordArray[new Random().nextInt(SeventhWordArray.length)];

    static String EightWordArray [] = {"eighth", "eighth"};
    static String EightWord = EightWordArray[new Random().nextInt(EightWordArray.length)];

    static String NinthWordArray [] = {"ninth", "ninth"};
    static String NinthWord = NinthWordArray[new Random().nextInt(NinthWordArray.length)];

    static String TenthWordArray [] = {"tenth", "tenth"};
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






        System.out.println("Welcome to the final WPM program!");
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
            randomWordsGen();

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
            //Get users input and store it in a string called UserTypedWords
            Scanner scan = new Scanner(System.in);
            String userTypedWords = scan.nextLine();



            // Java.Util.LocalTime to get the nano seconds of the day we are currently in
            double end = LocalTime.now().toNanoOfDay();
            double elapsedTime = (end - start);
            // Calculate the elapsed time in seconds by subtracting the  time from the end time
            double seconds = elapsedTime / 1000000000.0;









            int score = 0;
            // Split userTypedWords into an array called userSplitWords
            String[] userSplitWords = userTypedWords.split(" ");
            // Print out userSplitWords
            // Use for loop to go through each array element in userSplitWords and add 1 point to score everytime the word matches to the word in the array
            for (int ii = 0; ii < userSplitWords.length; ii++) {
                if (userSplitWords[ii].equals(words[rand1]) || userSplitWords[ii].equals(words[rand2]) || userSplitWords[ii].equals(words[rand3]) || userSplitWords[ii].equals(words[rand4]) || userSplitWords[ii].equals(words[rand5]) || userSplitWords[ii].equals(words[rand6]) || userSplitWords[ii].equals(words[rand7]) || userSplitWords[ii].equals(words[rand8]) || userSplitWords[ii].equals(words[rand9]) || userSplitWords[ii].equals(words[rand10])) {

                    score++;

                }









            } if (score < 5) {
                System.out.println("You only got " + score + " words right, you need to work on your typing skills!");
            }
            if (score >= 5 && score < 10) {
                System.out.println("Not so bad!");
            }

            if (score >= 10) {
                System.out.println("You are one accurate type!");



            }


            //Get WPM by dividing the number of words typed by the number of seconds elapsed but make sure to round it to the nearest whole number
            double wpm = Math.round(((userSplitWords.length / seconds) * 60));

            // Print out the WPM
            System.out.println(usersName.substring(0, 1).toUpperCase() + usersName.substring(1) + ", you typed " + userSplitWords.length + " words in " + seconds + " seconds, which is " + wpm + " WPM.");





            // Play again loop
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


    public static void checkWords(String userTypedWords) {
        //This method compares userTypedWords with randomly generated words using for loop and adds 1 to correct if the word matches

        // Split the user typed words into an array
        String[] userWords = userTypedWords.split(" ");
        // Create a variable called correct to store the number of correct words
        int correct = 0;
        // For loop to compare the user typed words to the randomly generated words

        for (int i = 0; i < userWords.length; i++) {
            if (userWords[i].equals(words[i])) {
                correct++;
            }
        }



    }






    private static void randomWordsGen() {
    }
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

