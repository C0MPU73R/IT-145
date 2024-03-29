/*
@filename: Driver.java
@purpose: IT-145, SNHU
@editor: Nick Cleveland
*/
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Driver {
    private static ArrayList<Dog> dogList = new ArrayList<Dog>();
    // Instance variables (if needed)
    private static ArrayList<Monkey> monkeyList = new ArrayList<Monkey>();

    public static void main(String[] args) {

        // initializeDogList(); // test initializers
        // initializeMonkeyList();

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
                reserveAnimal(scnr);
                break;
            case '4':
                System.out.println("[4] Print a list of all dogs selected");
                printAnimals("Dog"); //This can be hard-coded since it is only used for dogs
                break;
            case '5':
                System.out.println("[5] Print a list of all monkeys selected");
                printAnimals("Monkey"); //This can be hard-coded since it is only used for monkeys
                break;
            case '6':
                System.out.println("[6] Print a list of all non-reserved animals selected");
                printNonReservedAnimals();
                break;

            case 'q':
                break;
            default:
                System.out.println("Invalid choice.");
                break;
        }
    }

    // FOR TESTING ONLY
    // Adds dogs to a list for testing
    public static void initializeDogList() {
        Dog dog1 = new Dog("Spot", "German Shepherd", "male", "1", "25.6", "05-12-2019", "United States", "intake", false, "United States");
        Dog dog2 = new Dog("Rex", "Great Dane", "male", "3", "35.2", "02-03-2020", "United States", "Phase I", false, "United States");
        Dog dog3 = new Dog("Bella", "Chihuahua", "female", "4", "25.6", "12-12-2019", "Canada", "in service", true, "Canada");

        dogList.add(dog1);
        dogList.add(dog2);
        dogList.add(dog3);
    }


    // FOR TESTING ONLY
    // Adds monkeys to a list for testing
    //Optional for testing
    public static void initializeMonkeyList() {
        Monkey monkey1 = new Monkey("Carl", "Guenon", "male", "5", "60.6", "3.0", "4", "6", "12-12-2016", "Canada", "in service", true, "Canada");

        monkeyList.add(monkey1); //test for adding monkey objects to our arraylist
    }

    // Complete the intakeNewDog method
    // The input validation to check that the dog is not already in the list
    // is done for you
    //Intakes a new Dog object and adds it to the Dog List
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
    //Intakes a new Monkey object and adds it to the Monkey List
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
                System.out.println("\n\nThis monkey is already in our system\n\n"); //Check to see if monkey already here
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

        acquisitionDate = ""; //Set to blank string for now

        acquisitionCountry =""; //Set to blank String for now

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
        boolean dogFound = false;
        boolean monkeyFound = false;
        System.out.println("What kind of animal?");
        String animalType = scanner.next();

        System.out.println("What in-service country?");
        String country = scanner.next();

        if (Objects.equals(animalType, "Dog")) {
            for (Dog dog : dogList) {
                if (!dog.getReserved()) { // if the dog is not reserved
                    dog.setAcquisitionLocation(country);
                    dog.setReserved(true); //set this specific dog to now being reserved
                    dogFound = true;
                    break; //The first available dog found has now been set the country and is now reserved.
                }
            }
            if (dogFound) {
                System.out.println("Ok, a dog has been found, reserved for you and set to the country");

            } else { //There was not a dog found
                System.out.println("Sorry, there does not seem to be any non-reserved dogs at this time.");

            }
        }
        else if (Objects.equals(animalType, "Monkey")) {
            for (Monkey monkey: monkeyList) {
                if (!monkey.getReserved()) { // if the monkey is not reserved
                    monkey.setAcquisitionLocation(country);
                    monkey.setReserved(true); //set this specific monkey to now being reserved
                    monkeyFound = true;
                    break; //The first available monkey found has now been set the country and is now reserved.
                }
            }
            if (monkeyFound) {
                System.out.println("Ok, a monkey has been found, reserved for you and set to the country");

            } else { //There was not a monkey found
                System.out.println("Sorry, there does not seem to be any non-reserved monkeys at this time.");

            }
        }

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
    public static void printAnimals(String animal) {
        if (Objects.equals(animal, "Dog")) {
            for (Dog dog : dogList) {
                System.out.printf("Dog name: %s\nDog breed: %s\nDog gender: %s\nDog age: %s\nDog weight: %s\n\n\n",
                        dog.getName(), dog.getBreed(), dog.getGender(), dog.getAge(), dog.getWeight());
            }
        }
        else if (Objects.equals(animal, "Monkey")) {
            for (Monkey monkey : monkeyList) {
                System.out.printf("Monkey name: %s\nMonkey species: %s\nMonkey gender: %s\nMonkey age: %s\nMonkey weight: %s\nMonkey tail length: %s\nMonkey height: %s\nMonkey body length: %s\n\n\n",
                        monkey.getName(), monkey.getSpecies(), monkey.getGender(), monkey.getAge(), monkey.getWeight(), monkey.getTailLength(), monkey.getHeight(), monkey.getBodyLength());

            }
        }

    }
    public static void printNonReservedAnimals() {  //Used a separate method here to prevent cluttering
        System.out.println("List of dogs that are available:");
        for (Dog dog : dogList) {
            if (!dog.getReserved()) {
                System.out.printf("Dog name: %s\nDog breed: %s\nDog gender: %s\nDog age: %s\nDog weight: %s\n\n\n",
                        dog.getName(), dog.getBreed(), dog.getGender(), dog.getAge(), dog.getWeight());
                }
            }

        System.out.println("List of monkeys that are available:");
        for (Monkey monkey : monkeyList) {
            if (!monkey.getReserved()) {
                System.out.printf("Monkey name: %s\nMonkey species: %s\nMonkey gender: %s\nMonkey age: %s\nMonkey weight: %s\nMonkey tail length: %s\nMonkey height: %s\nMonkey body length: %s\n\n\n",
                        monkey.getName(), monkey.getSpecies(), monkey.getGender(), monkey.getAge(), monkey.getWeight(), monkey.getTailLength(), monkey.getHeight(), monkey.getBodyLength());
            }
        }
    }
}

