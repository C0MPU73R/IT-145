/*
 Filename: Pet.java
 @author: Nicholas Cleveland
*/
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Scanner;

public class Pet
{
    //attributes
    String petType;
    String petName;
    int petAge;
    int dogSpaces;
    int catSpaces;
    int daysStay;
    float amountDue;

    public Pet(String petType, String petName, int petAge, int daysStay)
    {
        //constructor
        this.petType = petType; //think this is similar to C's this-> pointer. Making sure we refer to the right instance
        this.petName = petName;
        this.petAge = petAge;
        this.daysStay = daysStay;
    }


}