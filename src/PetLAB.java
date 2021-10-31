/*
Filename: PetLAB.java
@author: C0MPU73R
*/

import java.util.ArrayList;
import java.util.Scanner;

public class PetLAB
{
    public static void main(String[] args)
    {
        //attribs
        String petType;
        String petName;
        int petAge;
        int daysStay;
        int numOfPets;
        //Need a holder to hold all the pets from user input
        //Need a way to store pet objs
        ArrayList<Pet> pet_storage = new ArrayList<>();

        Scanner scnr = new Scanner(System.in);

        System.out.println("Welcome to PetBAG");
        System.out.println("How many pets are you storing?");
        numOfPets = scnr.nextInt();
        //Lets use a loop here so we can get multiple pets from the user if necessary.
        for (int index = 0; index < numOfPets; index++)
        {
            System.out.println("Go ahead and enter your pet's credentials\n\n");

            System.out.println("Pet type: ");
            petType = scnr.next();

            System.out.println("Pet name: ");
            petName = scnr.next();

            System.out.println("Pet age: ");
            petAge = scnr.nextInt();

            System.out.println("Days staying: ");
            daysStay = scnr.nextInt();

            pet_storage.add(new Pet(petType, petName, petAge, daysStay)); //Store a new pet obj
        }
    }
}
