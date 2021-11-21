/*
 * @filename: petBAG.java
 * @author: Nick Cleveland
 */

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;


public class petBAG {

    private static String petType;
    private static String petName;
    private static int petAge;
    private static double petWeight;
    private static boolean isGroomed = false;
    private static int daysStaying;
    private static int catSpaceNumber = 0; //can have 12 in total (0 to 11)
    private static int dogSpaceNumber = 0; //can have 30 in total (0 to 29)
    //private final ArrayList<Dog> dogHolder = new ArrayList<>(); // limit is 30
    //private final ArrayList<Cat> catHolder = new ArrayList<>(); //limit is 12
    private static ArrayList<Pet> petHolder = new ArrayList<>();
    public static void main (String[] args) {

        //method for the customer and employee to interact.
        newCustomer(); //Getting new customer
        performPetTasks(); // perform pet tasks given the pet type
        returningCustomer(); //Getting returning customer for their pet. and get the amount due.
    }

    public static void newCustomer()
    {
        Scanner scnr = new Scanner(System.in);
        System.out.println("Welcome to PetBAG.");

        System.out.print("What kind of pet are you storing today?: ");
        petType = scnr.nextLine();

        if (Objects.equals(petType, "Dog") && dogSpaceNumber > 29) {
            System.out.println("Sorry, our dog spaces are full.");
        } else if (Objects.equals(petType, "Cat") && catSpaceNumber > 11) {
            System.out.println("Sorry, our cat spaces are full");
        } else {
            System.out.println("");

            System.out.println("What is their name?: ");
            petName = scnr.nextLine();
            System.out.println("");

            System.out.printf("How old is  %s ?", petName);
            petAge = scnr.nextInt();
            System.out.println("");

            System.out.printf("What is %s's weight?", petName);
            petWeight = scnr.nextDouble();
            System.out.println("");

            if (Objects.equals(petType, "Dog")) {
                System.out.printf("Would you like %s to be groomed?", petName);
                isGroomed = scnr.nextBoolean();
                System.out.println("");
            }

            System.out.printf("How many days will %s be staying?", petName);
            daysStaying = scnr.nextInt();
            System.out.println("");

            if (Objects.equals(petType, "Dog")) {
                addPet(petType, petName, petAge, petWeight, isGroomed, daysStaying, dogSpaceNumber);
                dogSpaceNumber++; //dog space 0 to 29
            } else if (Objects.equals(petType, "Cat")) {
                addPet(petType, petName, petAge, petWeight, isGroomed, daysStaying, catSpaceNumber);
                catSpaceNumber++; //cat space 0 to 11
            }
        }
    }

    public static void returningCustomer() {
        Scanner scnr = new Scanner(System.in);
        System.out.println("Hello, who are you picking up today?"); //Most customers will to refer their pet by name.
        String pet_Name = scnr.nextLine();
        Pet p = getPet(pet_Name);
        System.out.printf("Your cost for %s is %f", p.getPetName(), p.getAmountDue());
    }

    public static void addPet(String petType, String petName, int petAge, double petWeight, boolean isGroomed, int daysStaying, int petSpaceNumber)
    {
        if (Objects.equals(petType, "Dog")) {
            petHolder.add(new Dog(petType, petName, petAge, petWeight, isGroomed, daysStaying, petSpaceNumber));
            dogSpaceNumber++;
        } else if (Objects.equals(petType, "Cat")) {
            petHolder.add(new Cat(petType, petName, petAge, petWeight, isGroomed, daysStaying, petSpaceNumber));
            catSpaceNumber++;
        } else {
            System.out.println("Invalid pet type");
        }
    }

    public static void performPetTasks() {
        int weight;
        double cost;
        for (int i = 0; i < petHolder.size(); i++) {
            if (Objects.equals(petHolder[i].getPetType(), "Dog")) {
                //get the dog's weight and calculate cost

                weight = petHolder[i].getWeight;

                if (weight >= 30) {
                    petHolder[i].updateAmountDue(34.00);
                    if (petHolder[i].isGroomed()) {
                        petHolder[i].updateAmountDue(29.95);
                    }
                } else if (weight >= 20) {
                    petHolder[i].updateAmountDue(29.00);
                    if (petHolder[i].isGroomed()) {
                        petHolder[i].updateAmountDue(24.95);
                    }
                } else {
                    petHolder[i].updateAmountDue(24.00);
                    if (petHolder[i].isGroomed()) {
                        petHolder[i].updateAmountDue(19.95);
                    }
                }
            } else if (Objects.equals(petHolder[i].getPetType(), "Cat")) {
                petHolder[i].updateAmountDue(18.00); //fixed price for any cat weight.
            }
        }
    }

    public static Pet getPet(String name) {
        Pet p = null;
        for (int i = 0; i < petHolder.size(); i++) {
            if (Objects.equals(petHolder[i].getName, name)) {
             p = petHolder[i];
             petHolder.remove(i); //clean up
             break;
            }
        }
        return p;
    }
}
