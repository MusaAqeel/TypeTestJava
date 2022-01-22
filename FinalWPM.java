import java.time.LocalTime;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;




class TypeTestICS3U {
    static String FirstWordArray[] = {"netflix", "sport", "degree", "pizza", "material"};
    static String FirstWord = FirstWordArray[new Random().nextInt(FirstWordArray.length)];

    static String SecondWordArray[] = {"race", "car", "sure", "real", "simple"};
    static String SecondWord = SecondWordArray[new Random().nextInt(SecondWordArray.length)];

    static String ThirdWordArray[] = {"porsche", "speed", "risk", "basketball", "raptors"};
    static String ThirdWord = ThirdWordArray[new Random().nextInt(ThirdWordArray.length)];

    static String FourthWordArray[] = {"laptop", "really", "boss", "smaller", "specific"};
    static String FourthWord = FourthWordArray[new Random().nextInt(FourthWordArray.length)];

    static String FifthWordArray[] = {"continue", "covid", "home", "sick", "solution"};
    static String FifthWord = FifthWordArray[new Random().nextInt(FifthWordArray.length)];

    static String SixthWordArray[] = {"corona", "funny", "alone", "water", "bottle"};
    static String SixthWord = SixthWordArray[new Random().nextInt(SixthWordArray.length)];

    static String SeventhWordArray[] = {"java", "coffee", "coding", "macintosh", "current"};
    static String SeventhWord = SeventhWordArray[new Random().nextInt(SeventhWordArray.length)];

    static String EightWordArray[] = {"people", "grades", "school", "light", "lamp", "ferrari"};
    static String EightWord = EightWordArray[new Random().nextInt(EightWordArray.length)];

    static String NinthWordArray[] = {"continue", "bubbles", "drake", "pastel", "mouse"};
    static String NinthWord = NinthWordArray[new Random().nextInt(NinthWordArray.length)];

    static String TenthWordArray[] = {"scape", "fruit", "zebra", "alien", "monitor" , "personal"};
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


        System.out.println(ConsoleColors.BLACK_BACKGROUND_BRIGHT + "Welcome to the final WPM program!" + ConsoleColors.RESET);
        System.out.println(" ");
        System.out.print(ConsoleColors.WHITE_BOLD + "Whats your name? " + ConsoleColors.RESET);
        Scanner scanner = new Scanner(System.in);
        String usersName = scanner.nextLine();

        // Ask user if they want instructions
        System.out.print("Would you like instructions on how to play?" +ConsoleColors.WHITE_BOLD + " (yes/no) "+ ConsoleColors.RESET);
        String instructions = scanner.nextLine();
        if (instructions.equals("yes") || instructions.equals("Yes")) {
            //call on method instructions
            instructions();

        }
        if (instructions.equals("no") || instructions.equals("No")) {
            System.out.println("Let's get started!");
            System.out.println("");
        }



        // while playAgain is true, run the program
        // if playAgain is false, exit the program
        boolean playAgain = true;

        while ( (playAgain)) {


            // Countdown
            System.out.println(ConsoleColors.RED + "3" +
                    ConsoleColors.RESET);
            // Using java.util.concurrent.TimeUnit we can use the sleep method to pause the program for a certain amount of time which in this case is 1 second
            TimeUnit.SECONDS.sleep(1);

            System.out.println(ConsoleColors.YELLOW_BRIGHT + "2" +
                    ConsoleColors.RESET);
            TimeUnit.SECONDS.sleep(1);

            System.out.println(ConsoleColors.GREEN + "1" +
                    ConsoleColors.RESET);
            TimeUnit.SECONDS.sleep(1);

            System.out.println(" ");
            System.out.println(ConsoleColors.GREEN_BOLD + "GO!" +
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

            // If words[rand1] is the same as any of the other words, generate a new random number
            while (words[rand1] == words[rand2] || words[rand1] == words[rand3] || words[rand1] == words[rand4] || words[rand1] == words[rand5] || words[rand1] == words[rand6] || words[rand1] == words[rand7] || words[rand1] == words[rand8] || words[rand1] == words[rand9] || words[rand1] == words[rand10]) {
                rand1 = rand.nextInt(10);
            }
            while (words[rand2] == words[rand1] || words[rand2] == words[rand3] || words[rand2] == words[rand4] || words[rand2] == words[rand5] || words[rand2] == words[rand6] || words[rand2] == words[rand7] || words[rand2] == words[rand8] || words[rand2] == words[rand9] || words[rand2] == words[rand10]) {
                rand2 = rand.nextInt(10);
            }
            while (words[rand3] == words[rand1] || words[rand3] == words[rand2] || words[rand3] == words[rand4] || words[rand3] == words[rand5] || words[rand3] == words[rand6] || words[rand3] == words[rand7] || words[rand3] == words[rand8] || words[rand3] == words[rand9] || words[rand3] == words[rand10]) {
                rand3 = rand.nextInt(10);
            }
            while (words[rand4] == words[rand1] || words[rand4] == words[rand2] || words[rand4] == words[rand3] || words[rand4] == words[rand5] || words[rand4] == words[rand6] || words[rand4] == words[rand7] || words[rand4] == words[rand8] || words[rand4] == words[rand9] || words[rand4] == words[rand10]) {
                rand4 = rand.nextInt(10);
            }
            while (words[rand5] == words[rand1] || words[rand5] == words[rand2] || words[rand5] == words[rand3] || words[rand5] == words[rand4] || words[rand5] == words[rand6] || words[rand5] == words[rand7] || words[rand5] == words[rand8] || words[rand5] == words[rand9] || words[rand5] == words[rand10]) {
                rand5 = rand.nextInt(10);
            }
            while (words[rand6] == words[rand1] || words[rand6] == words[rand2] || words[rand6] == words[rand3] || words[rand6] == words[rand4] || words[rand6] == words[rand5] || words[rand6] == words[rand7] || words[rand6] == words[rand8] || words[rand6] == words[rand9] || words[rand6] == words[rand10]) {
                rand6 = rand.nextInt(10);
            }
            while (words[rand7] == words[rand1] || words[rand7] == words[rand2] || words[rand7] == words[rand3] || words[rand7] == words[rand4] || words[rand7] == words[rand5] || words[rand7] == words[rand6] || words[rand7] == words[rand8] || words[rand7] == words[rand9] || words[rand7] == words[rand10]) {
                rand7 = rand.nextInt(10);
            }
            while (words[rand8] == words[rand1] || words[rand8] == words[rand2] || words[rand8] == words[rand3] || words[rand8] == words[rand4] || words[rand8] == words[rand5] || words[rand8] == words[rand6] || words[rand8] == words[rand7] || words[rand8] == words[rand9] || words[rand8] == words[rand10]) {
                rand8 = rand.nextInt(10);
            }
            while (words[rand9] == words[rand1] || words[rand9] == words[rand2] || words[rand9] == words[rand3] || words[rand9] == words[rand4] || words[rand9] == words[rand5] || words[rand9] == words[rand6] || words[rand9] == words[rand7] || words[rand9] == words[rand8] || words[rand9] == words[rand10]) {
                rand9 = rand.nextInt(10);
            }
            while (words[rand10] == words[rand1] || words[rand10] == words[rand2] || words[rand10] == words[rand3] || words[rand10] == words[rand4] || words[rand10] == words[rand5] || words[rand10] == words[rand6] || words[rand10] == words[rand7] || words[rand10] == words[rand8] || words[rand10] == words[rand9]) {
                rand10 = rand.nextInt(10);
            }



            // Print out the randomly generated words
            System.out.println("\n" + words[rand1] + " " + words[rand2] + " " + words[rand3] + " " + words[rand4] + " " + words[rand5] + " " + words[rand6] + " " + words[rand7] + " " + words[rand8] + " " + words[rand9] + " " + words[rand10]);



            System.out.println();
            // Getting current time
            double start = LocalTime.now().toNanoOfDay();
            //Get users input and store it in a string called UserTypedWords
            Scanner scan = new Scanner(System.in);
            String userTypedWords = scan.nextLine();


            //Getting time once again after input has been taken
            double end = LocalTime.now().toNanoOfDay();
            double elapsedTime = (end - start);
            // Elapsed time calculation
            double seconds = elapsedTime / 1000000000.0;


            int score = 0;



            //userTyped words is a string










            // Split userTypedWords into an array called userSplitWords
            // userSplitWords contains the words the user typed in splitting them up by spaces
            //print userSplitWords[0]


            String[] userSplitWords = userTypedWords.split(" ");




            // Use for loop to go through each array element in userSplitWords and add 1 point to score everytime the word matches to the word in the array
            for (int ii = 0; ii < userSplitWords.length; ii++) {
                if (userSplitWords[ii].equals(words[rand1]) || userSplitWords[ii].equals(words[rand2]) || userSplitWords[ii].equals(words[rand3]) || userSplitWords[ii].equals(words[rand4]) || userSplitWords[ii].equals(words[rand5]) || userSplitWords[ii].equals(words[rand6]) || userSplitWords[ii].equals(words[rand7]) || userSplitWords[ii].equals(words[rand8]) || userSplitWords[ii].equals(words[rand9]) || userSplitWords[ii].equals(words[rand10])) {

                    score++;

                }

            }


            // (userSplitWords[0]) up to (userSplitWords[9]) are the words the user typed in the game and they are stored in the array userSplitWords and the words are the individual words

            String[] userSplitWordsChar1 = userSplitWords[0].split("");
            String[] userSplitWordsChar2 = userSplitWords[1].split("");
            String[] userSplitWordsChar3 = userSplitWords[2].split("");
            String[] userSplitWordsChar4 = userSplitWords[3].split("");
            String[] userSplitWordsChar5 = userSplitWords[4].split("");
            String[] userSplitWordsChar6 = userSplitWords[5].split("");
            String[] userSplitWordsChar7 = userSplitWords[6].split("");
            String[] userSplitWordsChar8 = userSplitWords[7].split("");
            String[] userSplitWordsChar9 = userSplitWords[8].split("");
            String[] userSplitWordsChar10 = userSplitWords[9].split("");


            // Split word[rand1] into an array called rand1Split

            String[] rand1Split = words[rand1].split("");

            String[] rand2Split = words[rand2].split("");

            String[] rand3Split = words[rand3].split("");

            String[] rand4Split = words[rand4].split("");

            String[] rand5Split = words[rand5].split("");

            String[] rand6Split = words[rand6].split("");

            String[] rand7Split = words[rand7].split("");

            String[] rand8Split = words[rand8].split("");

            String[] rand9Split = words[rand9].split("");

            String[] rand10Split = words[rand10].split("");


            //if user typed more than the amount of characters in the word then delete the extra characters from the array
            if (userSplitWordsChar1.length > rand1Split.length) {
                userSplitWordsChar1 = Arrays.copyOfRange(userSplitWordsChar1, 0, rand1Split.length);
            }
            if (userSplitWordsChar2.length > rand2Split.length) {
                userSplitWordsChar2 = Arrays.copyOfRange(userSplitWordsChar2, 0, rand2Split.length);
            }
            if (userSplitWordsChar3.length > rand3Split.length) {
                userSplitWordsChar3 = Arrays.copyOfRange(userSplitWordsChar3, 0, rand3Split.length);
            }
            if (userSplitWordsChar4.length > rand4Split.length) {
                userSplitWordsChar4 = Arrays.copyOfRange(userSplitWordsChar4, 0, rand4Split.length);
            }
            if (userSplitWordsChar5.length > rand5Split.length) {
                userSplitWordsChar5 = Arrays.copyOfRange(userSplitWordsChar5, 0, rand5Split.length);
            }
            if (userSplitWordsChar6.length > rand6Split.length) {
                userSplitWordsChar6 = Arrays.copyOfRange(userSplitWordsChar6, 0, rand6Split.length);
            }
            if (userSplitWordsChar7.length > rand7Split.length) {
                userSplitWordsChar7 = Arrays.copyOfRange(userSplitWordsChar7, 0, rand7Split.length);
            }
            if (userSplitWordsChar8.length > rand8Split.length) {
                userSplitWordsChar8 = Arrays.copyOfRange(userSplitWordsChar8, 0, rand8Split.length);
            }
            if (userSplitWordsChar9.length > rand9Split.length) {
                userSplitWordsChar9 = Arrays.copyOfRange(userSplitWordsChar9, 0, rand9Split.length);
            }
            if (userSplitWordsChar10.length > rand10Split.length) {
                userSplitWordsChar10 = Arrays.copyOfRange(userSplitWordsChar10, 0, rand10Split.length);
            }




            // Compare userSplitWordsChar1 and rand1Split
            // if userSplitWordsChar1[i] == rand1Split[i] then add 1 to CorrectChars
            // if userSplitWordsChar1[i] != rand1Split[i] then add 1 to IncorrectChars
           int CorrectChars = 0;
           int IncorrectChars = 0;
            for (int i = 0; i < userSplitWordsChar1.length; i++) {
                if (userSplitWordsChar1[i].equals(rand1Split[i])) {
                    CorrectChars++;

                }
                else {
                    IncorrectChars++;

                }

            }
        for (int i = 0; i < userSplitWordsChar2.length; i++) {
                if (userSplitWordsChar2[i].equals(rand2Split[i])) {
                    CorrectChars++;

                }
                else {
                    IncorrectChars++;
                }
        }
        for (int i = 0; i < userSplitWordsChar3.length; i++) {
                if (userSplitWordsChar3[i].equals(rand3Split[i])) {
                    CorrectChars++;
                }
                else {
                    IncorrectChars++;
                }
        }
        for (int i = 0; i < userSplitWordsChar4.length; i++) {
                if (userSplitWordsChar4[i].equals(rand4Split[i])) {
                    CorrectChars++;
                }
                else {
                    IncorrectChars++;
                }
        }
        for (int i = 0; i < userSplitWordsChar5.length; i++) {
                if (userSplitWordsChar5[i].equals(rand5Split[i])) {
                    CorrectChars++;
                }
                else {
                    IncorrectChars++;
                }
        }
        for (int i = 0; i < userSplitWordsChar6.length; i++) {
                if (userSplitWordsChar6[i].equals(rand6Split[i])) {
                    CorrectChars++;
                }
                else {
                    IncorrectChars++;
                }
        }
        for (int i = 0; i < userSplitWordsChar7.length; i++) {
                if (userSplitWordsChar7[i].equals(rand7Split[i])) {
                    CorrectChars++;

                }
                else {
                    IncorrectChars++;
                }

        }
        for (int i = 0; i < userSplitWordsChar8.length; i++) {
                if (userSplitWordsChar8[i].equals(rand8Split[i])) {
                    CorrectChars++;

                }
                else {
                    IncorrectChars++;
                }
        }
        for (int i = 0; i < userSplitWordsChar9.length; i++) {
                if (userSplitWordsChar9[i].equals(rand9Split[i])) {
                    CorrectChars++;
                }
                else {
                    IncorrectChars++;
                }

        }
        for (int i = 0; i < userSplitWordsChar10.length; i++) {
                if (userSplitWordsChar10[i].equals(rand10Split[i])) {
                    CorrectChars++;
                }
                else {
                    IncorrectChars++;
                }
        }


            // Count number of characters in randomly generated words
            int rand1Length = rand1Split.length;
            int rand2Length = rand2Split.length;
            int rand3Length = rand3Split.length;
            int rand4Length = rand4Split.length;
            int rand5Length = rand5Split.length;
            int rand6Length = rand6Split.length;
            int rand7Length = rand7Split.length;
            int rand8Length = rand8Split.length;
            int rand9Length = rand9Split.length;
            int rand10Length = rand10Split.length;
            //Add them up
            int totalChars = rand1Length + rand2Length + rand3Length + rand4Length + rand5Length + rand6Length + rand7Length + rand8Length + rand9Length + rand10Length;









            if (score < 5) {
                System.out.println(" ");
                System.out.println("You got " + score + " words right, you need to work on your typing skills!");
            }
            if (score >= 5 && score < 10) {
                System.out.println(" ");
                System.out.println("Not so bad!");
            }

            if (score >= 10) {
                System.out.println(" ");
                System.out.println("You are one accurate typer!");


            }


            //Calculate percentage
            int percentage = (CorrectChars * 100) / totalChars;
            // print out percentage in bold
            System.out.println("");

            System.out.println("You were: "+ConsoleColors.WHITE_BOLD + percentage + "%" + ConsoleColors.RESET + " accurate");




            // Count how many characters are in each user typed word and create an array called userWordLengths
            int[] userWordLengths = new int[10];
            for (int ii = 0; ii < 10; ii++) {
                userWordLengths[ii] = userSplitWords[ii].length();

            }

            // Identify spaces and remove them from the userWordLengths array
            for (int ii = 0; ii < 10; ii++) {
                if (userWordLengths[ii] == 1) {
                    userWordLengths[ii] = 0;

                }

            }

            // userWordLengths[0] tells you how many characters are in the first randomly generated word






            //Get WPM by dividing the number of words typed by the number of seconds elapsed but make sure to round it to the nearest whole number
            double wpm = Math.round(((userSplitWords.length / seconds) * 60));



            // Print out the WPM
            System.out.println(usersName.substring(0, 1).toUpperCase() + usersName.substring(1) + ", you typed " +score+ " words out of " + userSplitWords.length + " words correctly ");
            System.out.println("You did all this in " + ConsoleColors.WHITE_BOLD + + seconds + " seconds"+ ConsoleColors.RESET + ", which is "+ConsoleColors.WHITE_BOLD+ + wpm +
                   " WPM. " + ConsoleColors.RESET);


            //print accuracy
            System.out.println("||" +ConsoleColors.BLACK_BOLD + percentage + "% accurate" + ConsoleColors.RESET + "||" + ConsoleColors.BLACK_BOLD + + wpm + " WPM" + ConsoleColors.RESET + "||" + ConsoleColors.BLACK_BOLD + + seconds + " s" + ConsoleColors.RESET + "||" + ConsoleColors.BLACK_BOLD + + score + "/10 words" + ConsoleColors.RESET + "||");

            // Play again loop
            System.out.print("Do you want to play again?" +ConsoleColors.WHITE_BOLD + " (yes/no) "+ ConsoleColors.RESET);
            System.out.println(" ");
            String answer2 = scan.nextLine();

            // Ask user if they want to play again and keep on asking until they give a valid answer
            while (!answer2.equals("yes") && !answer2.equals("no")) {
                System.out.println("Please enter yes or no");
                answer2 = scan.nextLine();
            }

            // If the answer is yes, run the program again
            if (answer2.equals("yes")) {
                playAgain = true;
            }
            // If the answer is no, exit the program
            else {

                System.out.println(ConsoleColors.BLACK_BOLD + "Thanks for playing " + usersName.substring(0, 1).toUpperCase() + usersName.substring(1) + "!" +
                        ConsoleColors.RESET);
                playAgain = false;
            }



        }
        }






    public static void instructions() {
        // add class ConsoleColors to this method
        class ConsoleColors {
            // Reset
            public static final String RESET = "\033[0m";  // Text Reset
            public static final String WHITE_BOLD = "\033[1;37m";  // WHITE

        }

        // Give user instructions
        System.out.println("");
        System.out.println("You will be given a string of 10 random words, you need to type those same words as fast and as accurately as possible.");
        System.out.println("Make sure to type them all in the same order as they appear in the string and on one line.");
        // Ask user if they are ready yet, if they say no then ask them again until they say yes
        System.out.print("Are you ready?" + ConsoleColors.WHITE_BOLD + " (yes/no) "+ ConsoleColors.RESET);
        Scanner scan = new Scanner(System.in);
        String answer = scan.nextLine();
        while (!answer.equals("yes") && !answer.equals("no")) {
            System.out.println("Please enter yes or no");
            answer = scan.nextLine();

        }
        // If the answer is yes, run the program
        if (answer.equals("yes")) {
            System.out.println("Great! Let's go!");
            System.out.println(" ");

        }
        // If the answer is no, run the instructions again
        else {
            instructions();
        }



    }








    public static void randomWordsGen() {
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



