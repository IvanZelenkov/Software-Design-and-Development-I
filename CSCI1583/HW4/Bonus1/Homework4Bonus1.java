// Ivan Zelenkov Homework 4  Bonus 1 (Virtual Pet)
import java.util.*;

public class Homework4Bonus1 {
    static String name;  // declare variable name to String type
    static boolean check = false; // declare variable check to boolean type and assign it to false
    static boolean validAnswer = false; // declare variable validAnswer to boolean type and assign it to false
    static int age, answer, currentHunger, currentDirtiness, currentBoredom, hungerRate, dirtyRate, boredomRate, playerChoice; // declare variables to integer type

    static Scanner input = new Scanner(System.in);

    static final int LOW_STAT_THRESHOLD = 10;
    static final int MED_STAT_THRESHOLD = 20;
    static final int HIGH_STAT_THRESHOLD = 30;
    static final int RUNAWAY_STAT_THRESHOLD = 40;

    static ArrayList<String> listNames = new ArrayList<>(10000); // create ArrayList listNames to store the names
    static ArrayList<Integer> listAge = new ArrayList<>(10000); // create ArrayList listAge to store the age

    public static void main(String[] args) {
        createPet();
        while (!check) { // "while" loop runs until the user loses (while check will not "true")
            ageOfPet();
            choice(); // call the necessary methods to display the game properly
            startStatusOfPet();
            runAwayCheck();
        }
        resultOfPlayer();
        playAgain();
    }

    public static void createPet() {
        age = 0; // initialize age variable to 0
        System.out.println("A mysterious egg hatches before you!\nWhat will you name this creature?"); // prompt to the user
        name = input.nextLine(); // user should enter pet name
        listNames.add(name);

        currentHunger = 20;
        currentDirtiness = 10; // current stats of pet
        currentBoredom = 5;

        hungerRate = 10;
        dirtyRate = 10; // step of changing values
        boredomRate = 10;
    }

    public static void ageOfPet() { // method for changing age of the pet each loop
        age++; // incrementing age by 1 each loop
        System.out.println("\n*********BIRTHDAY UPDATE!*********");
        System.out.println(name + " is now " + age + " days old!");
        if (age % 2 == 0) { // if age divisible by 2 without remainder hungerRate will increase by 1
            hungerRate += 1;
            System.out.println(name + " gets hungrier faster!");
        } else if (age % 3 == 0) { // if age divisible by 3 without remainder dirtyRate will increase by 1
            dirtyRate += 1;
            System.out.println(name + " gets dirtier faster!");
        } else if (age % 5 == 0) { // if age divisible by 5 without remainder boredomRate will increase by 1
            boredomRate += 1;
            System.out.println(name + " gets more boring!");
        }
    }

    public static void choice() { // method for for options for the user to choose what to do with the pet
        System.out.println("1.) Feed\n2.) Clean\n3.) Play"); // options for the user what to do
        System.out.println("What would you like to do with " + name + "?");
        playerChoice = input.nextInt();
        if (playerChoice == 1) // if user input equals 1, therefore method statusAfterEating() will be executed
            statusAfterEating();
        else if (playerChoice == 2) // if user input equals 2, therefore method statusAfterCleaning() will be executed
            statusAfterCleaning();
        else                        // if user input equals 3 or something else, therefore method statusAfterPlaying() will be executed
            statusAfterPlaying();
    }

    private static void statusAfterEating() { // method for changing values if pet is eating
        currentHunger -= hungerRate;
        currentDirtiness += dirtyRate;
        System.out.println("You feed " + name + " but it makes a mess...");
    }

    private static void statusAfterCleaning() { // method for changing values if pet is cleaning
        currentDirtiness -= dirtyRate;
        currentBoredom += boredomRate;
        System.out.println("You bathe " + name + " but if doesn't like it...");
    }

    private static void statusAfterPlaying() { // method for changing values if pet is playing
        currentBoredom -= boredomRate;
        currentHunger += hungerRate;
        System.out.println("You play with " + name + " and it works up an appetite!");
    }

    public static void startStatusOfPet() { // method to show level of hunger, cleanliness and boredom
        System.out.println("*********CURRENT STATS************");
        String hungerDescription = "Hunger level: ";
        System.out.println(hungerDescription + hungerStatusPet());
        String dirtDescription = "Cleanliness level: ";
        System.out.println(dirtDescription + dirtinessStatusPet());
        String boredDescription = "Boredom level: ";
        System.out.println(boredDescription + boredomStatusPet());
    }

    public static String hungerStatusPet() { // method to get a changing condition of the pet
        boolean good = (currentHunger >= LOW_STAT_THRESHOLD);
        boolean couldBeBetter = (currentHunger >= MED_STAT_THRESHOLD); // declare boolean variables to use them later in if...else statements
        boolean notGood = (currentHunger >= HIGH_STAT_THRESHOLD);
        boolean problem = (currentHunger == RUNAWAY_STAT_THRESHOLD);

        if (problem)
            return "The pet has serious problem!"; // if boolean value inside the parenthesis is true, return statement will be executed
        else if (notGood) return "Not Good!";
        else if (couldBeBetter) return "Could be Better!";
        else return "Pretty Good!";
    }

    public static String dirtinessStatusPet() { // method to get a changing condition of the pet
        boolean good = (currentDirtiness >= LOW_STAT_THRESHOLD);
        boolean couldBeBetter = (currentDirtiness >= MED_STAT_THRESHOLD); // declare boolean variables to use them later in if...else statements
        boolean notGood = (currentDirtiness >= HIGH_STAT_THRESHOLD);
        boolean problem = (currentDirtiness == RUNAWAY_STAT_THRESHOLD);

        if (problem)
            return "The pet has serious problem!"; // if boolean value inside the parenthesis is true, return statement will be executed
        else if (notGood) return "Not Good!";
        else if (couldBeBetter) return "Could be Better!";
        else return "Pretty Good!";
    }

    public static String boredomStatusPet() { // method to get a changing condition of the pet
        boolean good = (currentBoredom >= LOW_STAT_THRESHOLD);
        boolean couldBeBetter = (currentBoredom >= MED_STAT_THRESHOLD); // declare boolean variables to use them later in if...else statements
        boolean notGood = (currentBoredom >= HIGH_STAT_THRESHOLD);
        boolean problem = (currentBoredom == RUNAWAY_STAT_THRESHOLD);

        if (problem)
            return "The pet has serious problem!"; // if boolean value inside the parenthesis is true, return statement will be executed.
        else if (notGood) return "Not Good!";
        else if (couldBeBetter) return "Could be Better!";
        else return "Pretty Good!";
    }

    public static void runAwayCheck() {  // method with if statement which will determine if the pet has run away
        if (currentHunger > RUNAWAY_STAT_THRESHOLD) {
            System.out.println("The pet ran away because it was too hungry!");
            check = true; // variable check becomes true, therefore while loop will be finished
        } else if (currentDirtiness > RUNAWAY_STAT_THRESHOLD) {
            System.out.println("The pet ran away because it was too dirty!");
            check = true; // variable check becomes true, therefore while loop will be finished
        } else if (currentBoredom > RUNAWAY_STAT_THRESHOLD) {
            System.out.println("The pet ran away because it was too bored!");
            check = true; // variable check becomes true, therefore while loop will be finished
        }
    }

    public static void resultOfPlayer() { // method will show the result of the user at the end of the game when the pet runs away and shows to user is a good owner or not
        System.out.println("You took care of " + name + " for " + age + " days");
        if (age < 5) { // if age less than 5
            listAge.add(age);
            System.out.println("Try to be better next time.");
        }
        else if (age >= 6 && age <= 15) {// if age value is between 6 and 15
            listAge.add(age);
            System.out.println("You spent many days with " + name + "!");
        }
        else if (age >= 16 && age <= 25) {// if age value is between 16 and 25
            listAge.add(age);
            System.out.println("You are a great virtual pet owner!");
        }
        else if (age > 25) {// if age more than 25
            listAge.add(age);
            System.out.println("Great! You are ready to take care of real pet!");
        }
    }

    public static void playAgain() {
        // boolean variable which represents if we reached the correct guess

        // while loop till the boolean variable CorrectGuess equal true
        while (!validAnswer) {
            // present guess to the user
            System.out.println("Would you like to play again? 1 for yes, 2 for no");

            // make UserGuess as the element stored with the middle index
            answer = input.nextInt();

            // choosing the correct option to continue
            if (answer == 1) {
                check = false; // making check again false because in method runAwayCheck() it becomes true, so to restart the game we need again false
                name = input.nextLine(); // user should enter pet name
                main(new String[0]); // make a restart from main method
            } else {
                // present text to the user
                System.out.println("YOUR PET(S):");
                System.out.println(listNames); // show the names of all pets which participated in this game
                System.out.println("THE NUMBER OF DAYS PET(S) SPENT WITH YOU:");
                System.out.println(listAge); // show the age of each pet relative to the names, till it ran away
                validAnswer = true; // validAnswer is true because while loop will be finished
            }
        }
    }
}

