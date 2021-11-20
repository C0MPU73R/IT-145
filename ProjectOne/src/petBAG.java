import java.util.Scanner;

/*
* @filename: petBAG.java
* @author: Nick Cleveland
*
*/
public class petBAG {

    private static int daysStaying;

    public static void main (String[] args) {
        Scanner scnr = new Scanner(System.in);
        welcomeMessage();
        System.out.println("How many days Staying?");


    }
    public static void welcomeMessage() {
        System.out.println("Welcome to PetBAG");
    }
}
