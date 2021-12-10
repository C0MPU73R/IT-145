/*
@filename: Driver.java
@purpose: IT-145, SNHU
@editor: Nick Cleveland
*/
import java.util.ArrayList;
import java.util.Scanner;

public class Driver {
    private static ArrayList<Dog> dogList = new ArrayList<Dog>();
    // Instance variables (if needed)
    private static ArrayList<Monkey> monkeyList = new ArrayList<Monkey>();

    public static void main(String[] args) {

        initializeDogList(); //initializers
        initializeMonkeyList();

        Scanner scnr = new Scanner(System.in);
        char userInput;
        do {
            displayMenu();
            userInput = scnr.next().charAt(0);
            processChoice(userInput, scnr); //process the user input as the chosen character, attempt to pass the scanner object
        } while (userInput != 'q');

        // Add a loop that displays the menu, accepts the users input
        // and takes the appropriate action.
        // For the project submission you must also include input validation
        // and appropriate feedback to the user.
        // Hint: create a Scanner and pass it to the necessary
        // methods
        // Hint: Menu options 4, 5, and 6 should all connect to the printAnimals() method.
    }

    // This method prints the menu options
    public static void displayMenu() {
        System.out.println("\n\n");
        System.out.println("\t\t\t\tRescue Animal System Menu");
        System.out.println("[1] Intake a new dog");
        System.out.println("[2] Intake a new monkey");
        System.out.println("[3] Reserve an animal");
        System.out.println("[4] Print a list of all dogs");
        System.out.println("[5] Print a list of all monkeys");
        System.out.println("[6] Print a list of all animals that are not reserved");
        System.out.println("[q] Quit application");
        System.out.println();
        System.out.println("Enter a menu selection");
    }

    public static void processChoice(char input, Scanner scnr) {
        switch(input) {
            case '1':
                System.out.println("[1] Intake new dog selected");
                intakeNewDog(scnr); //take the scanner object itself.
                break;
            case '2':
                System.out.println("[2] Intake new monkey selected");
                intakeNewMonkey(scnr); //take the scanner object itself
                break;
            case '3':
                System.out.println("[3] Reserve an animal selected");
                reserveAnimal(scnr); //TODO Not yet implemented.
                break;
            case '4':
                System.out.println("[4] Print a list of all dogs selected");
                printAnimals(); //TODO Not yet implemented.
                break;
            case '5':
                System.out.println("[5] Print a list of all monkeys selected");
                printAnimals(); //TODO Not yet implemented.
                break;
            case '6':
                System.out.println("[6] Print a list of all non-reserved animals selected");
                printAnimals(); //TODO Not yet implemented.
                break;
            default:
                break;
        }
    }

    // Adds dogs to a list for testing
    public static void initializeDogList() {
        Dog dog1 = new Dog("Spot", "German Shepherd", "male", "1", "25.6", "05-12-2019", "United States", "intake", false, "United States");
        Dog dog2 = new Dog("Rex", "Great Dane", "male", "3", "35.2", "02-03-2020", "United States", "Phase I", false, "United States");
        Dog dog3 = new Dog("Bella", "Chihuahua", "female", "4", "25.6", "12-12-2019", "Canada", "in service", true, "Canada");

        dogList.add(dog1);
        dogList.add(dog2);
        dogList.add(dog3);
    }


    // Adds monkeys to a list for testing
    //Optional for testing
    public static void initializeMonkeyList() {
        Monkey monkey1 = new Monkey("Carl", "Guenon", "male", "5", "60.6", "3.0", "4", "6", "12-12-2016", "Canada", "in service", true, "Canada");

        monkeyList.add(monkey1); //test for adding monkey objects to our arraylist
    }

    // Complete the intakeNewDog method
    // The input validation to check that the dog is not already in the list
    // is done for you
    public static void intakeNewDog(Scanner scanner) {
        String name;
        String breed;
        String gender;
        String age;
        String weight;
        String acquisitionDate;
        String acquisitionCountry;
        String trainingStatus;
        boolean reserved;
        String inServiceCountry;

        System.out.println("What is the dog's name?");
        name = scanner.next();
        for(Dog dog: dogList) {
            if(dog.getName().equalsIgnoreCase(name)) {
                System.out.println("\n\nThis dog is already in our system\n\n");
                return; //returns to menu
            }
        }
        System.out.println("What is the breed of the dog?");
        breed  = scanner.next();

        System.out.println("What is the gender of the dog?");
        gender  = scanner.next();

        System.out.println("What is the age of the dog?");
        age  = scanner.next();

        System.out.println("What is the weight of the dog?");
        weight  = scanner.next();

        acquisitionDate = ""; //TODO: How to generate this date?

        acquisitionCountry =""; // TODO: How to get the country? From user maybe?

        trainingStatus = "intake"; //All new dogs get the label intake before training.
        reserved = false; //Since this is a new dog and not trained, it cannot be reserved

        inServiceCountry = ""; //A new dog cannot be yet in-service.

        dogList.add(new Dog(name, breed, gender, age, weight, acquisitionDate, acquisitionCountry, trainingStatus,
                reserved, inServiceCountry));
    }

    // Complete intakeNewMonkey
    //Instantiate and add the new monkey to the appropriate list
    // For the project submission you must also  validate the input
    // to make sure the monkey doesn't already exist and the species type is allowed
    public static void intakeNewMonkey(Scanner scanner) {
        String name;
        String species;
        String gender;
        String age;
        String weight;
        String tailLength;
        String height;
        String bodyLength;
        String acquisitionDate;
        String acquisitionCountry;
        String trainingStatus;
        boolean reserved;
        String inServiceCountry;

        System.out.println("What is the monkey's name?");
        name = scanner.next();
        for(Monkey monkey: monkeyList) {
            if(monkey.getName().equalsIgnoreCase(name)) {
                System.out.println("\n\nThis monkey is already in our system\n\n");
                return; //returns to menu
            }
        }

        System.out.println("What is the species of the monkey?");
        species  = scanner.next();

        System.out.println("What is the gender of the monkey?");
        gender  = scanner.next();

        System.out.println("What is the age of the monkey?");
        age  = scanner.next();

        System.out.println("What is the weight of the monkey?");
        weight  = scanner.next();

        System.out.println("What is the monkey's tail length?");
        tailLength = scanner.next();

        System.out.println("What is the monkey's height?");
        height = scanner.next();

        System.out.println("What is the monkey's body length?");
        bodyLength = scanner.next();

        acquisitionDate = ""; //TODO: How to generate this date?

        acquisitionCountry =""; // TODO: How to get the country? From user maybe?

        trainingStatus = "intake"; //All new monkeys get the label intake before training.
        reserved = false; //Since this is a new monkey and not trained, it cannot be reserved

        inServiceCountry = ""; //A new monkey cannot be yet in-service.

        monkeyList.add(new Monkey(name, species, gender, age, weight, tailLength, height, bodyLength, acquisitionDate,
                acquisitionCountry, trainingStatus,
                reserved, inServiceCountry));

    }

    // Complete reserveAnimal
    // You will need to find the animal by animal type and in service country
    public static void reserveAnimal(Scanner scanner) {
        System.out.println("The method reserveAnimal needs to be implemented");

    }

    // Complete printAnimals
    // Include the animal name, status, acquisition country and if the animal is reserved.
    // Remember that this method connects to three different menu items.
    // The printAnimals() method has three different outputs
    // based on the listType parameter
    // dog - prints the list of dogs
    // monkey - prints the list of monkeys
    // available - prints a combined list of all animals that are
    // fully trained ("in service") but not reserved
    // Remember that you only have to fully implement ONE of these lists.
    // The other lists can have a print statement saying "This option needs to be implemented".
    // To score "exemplary" you must correctly implement the "available" list.
    public static void printAnimals() {
        System.out.println("The method printAnimals needs to be implemented");
        //TODO

    }
}

