/*
 * @filename: petBAG.java
 * @author: Nick Cleveland
 */

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Objects;
import java.util.Scanner;


public class petBAG {

    private static boolean isGroomed = false;
    private static int catSpaceNumber = 0; //can have 12 in total (0 to 11)
    private static int dogSpaceNumber = 0; //can have 30 in total (0 to 29)
    private static ArrayList<Pet> petHolder = new ArrayList<Pet>();
    public static void main (String[] args) {

        System.out.println("Welcome to PetBAG.");

        //method for the customer and employee to interact.
        newCustomer(); //Getting new customer
        performPetTasks(); // perform pet tasks given the pet type
        returningCustomer(); //Getting returning customer for their pet. and get the amount due.
    }

    public static void newCustomer()
    {
        Scanner scnr = new Scanner(System.in);

        System.out.print("What kind of pet are you storing today?: ");
        String petType = scnr.next();

        if (Objects.equals(petType, "Dog") && dogSpaceNumber > 29) {
            System.out.println("Sorry, our dog spaces are full.");
        } else if (Objects.equals(petType, "Cat") && catSpaceNumber > 11) {
            System.out.println("Sorry, our cat spaces are full");
        } else {
            System.out.println("");

            System.out.println("What is their name?: ");
            String petName = scnr.next();
            System.out.println("");

            System.out.printf("How old is  %s ?", petName);
            int petAge = scnr.nextInt();
            System.out.println("");

            System.out.printf("What is %s's weight?", petName);
            double petWeight = scnr.nextDouble();
            System.out.println("");

            System.out.printf("How many days will %s be staying?", petName);
            int daysStaying = scnr.nextInt();
            System.out.println("");

            if (Objects.equals(petType, "Dog") && daysStaying >= 2) {
                System.out.printf("Would you like %s to be groomed?", petName);
                System.out.println("");

                String toGroom = scnr.next();

                if (Objects.equals(toGroom.toUpperCase(), "YES")) {
                    isGroomed = true;
                }
                System.out.println("");
            }

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
        Pet p = null;
        p = getPet(pet_Name);
        if (p == null) {
            System.out.println("Sorry there is no " + pet_Name + " in our system");
        }
        else {
            System.out.printf("Your cost for %s is %.2f", p.getPetName(), p.getAmountDue());
        }
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
        double weight;
        double cost;
        for (Pet pet : petHolder) {
            if (Objects.equals(pet.getPetType(), "Dog")) {
                //get the dog's weight and calculate cost

                weight = pet.getPetWeight();

                if (weight >= 30) {
                    pet.updateAmountDue(34.00);
                    if (pet.isGroomed()) {
                        pet.updateAmountDue(29.95);
                    }
                } else if (weight >= 20) {
                    pet.updateAmountDue(29.00);
                    if (pet.isGroomed()) {
                        pet.updateAmountDue(24.95);
                    }
                } else {
                    pet.updateAmountDue(24.00);
                    if (pet.isGroomed()) {
                        pet.updateAmountDue(19.95);
                    }
                }
            } else if (Objects.equals(pet.getPetType(), "Cat")) {
                pet.updateAmountDue(18.00); //fixed price for any cat weight.
            }
        }
    }

    public static Pet getPet(String name) {
        Pet p = null;
        for (int i = 0; i < petHolder.size(); i++) {
            if (Objects.equals(petHolder.get(i).getPetName(), name)) {
             p = petHolder.get(i);
             petHolder.remove(i); //clean up
             break;
            }
        }
        return p;
    }
}
