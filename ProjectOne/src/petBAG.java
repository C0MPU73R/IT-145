import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

/*
* @filename: petBAG.java
* @author: Nick Cleveland
*/
public class petBAG {

    private static String petType;
    private static String petName;
    private static int petAge;
    private static int daysStaying;
    private static int catSpaceNumber = 0; //can have 12 in total
    private static int dogSpaceNumber = 0; //can have 30 in total

    //private final ArrayList<Dog> dogHolder = new ArrayList<>(); // limit is 30
    //private final ArrayList<Cat> catHolder = new ArrayList<>(); //limit is 12

    private ArrayList<Pet> petHolder = new ArrayList<>();
    public static void main (String[] args) {

        newCustomer();

    }

    public static void newCustomer()
    {
        Scanner scnr = new Scanner(System.in);
        System.out.println("Welcome to PetBAG.");
        System.out.print("What kind of pet are you storing today?: ");
        petType = scnr.nextLine();
        System.out.println("");
        System.out.println("What is their name?: ");
        petName = scnr.nextLine();
        System.out.println("");
        System.out.printf("How old is  %s ?", petName);
        petAge = scnr.nextInt();
        System.out.println("");
        System.out.printf("How many days will %s be staying?", petName);
        daysStaying = scnr.nextInt();
        System.out.println("");


        addPet(petType, petName, petAge, daysStaying);

    }

    public static void addPet(String petType, String petName, int petAge, int daysStaying)
    {
        if (Objects.equals(petType, "Dog")) //do a test here for content equality, not obj comparison.
        {
            dogHolder.add(new Dog(petType, petName, petAge, daysStaying));
            dogSpaceNumber++;
        }
        else if (Objects.equals(petType, "Cat"))
        {
            catHolder.add(new Cat(petType, petName, petAge, daysStaying));
            catSpaceNumber++;
        }
        else
        {
            System.out.println("Invalid pet type");
        }
    }

    public static void performPetTasks() {

    }

    public Pet getPet(string name) {
        Pet p = null;
        for (int i = 0; i < petHolder.length; i++)
        {
            if (Objects.equals(petHolder.get(i).getName, name))
            {
             p = petHolder.get(i);
             petHolder.remove(i); //clean up
             break;
            }
        }
        return p;
    }

}
