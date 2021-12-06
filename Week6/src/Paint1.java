/*
* @filename: Paint1.java
* @editor: Nick Cleveland
* */
import java.util.Scanner;

public class Paint1 {

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        double wallHeight = 0.0;
        double wallWidth = 0.0;
        double wallArea = 0.0;
        double gallonsPaintNeeded = 0.0;

        final double squareFeetPerGallons = 350.0;

        // Implement a do-while loop to ensure input is valid
        // Prompt user to input wall's height
        do {
            System.out.println("Enter wall height (feet): ");
            wallHeight = scnr.nextDouble();

        } while(wallHeight <= 0);

        // Implement a do-while loop to ensure input is valid
        // Prompt user to input wall's width
        do {
            System.out.println("Enter wall width (feet): ");
            wallWidth = scnr.nextDouble();
        } while(wallWidth <= 0);

        // Calculate and output wall area
        wallArea = wallHeight * wallWidth;
        System.out.printf("Wall area: %.1f square feet\n", wallArea);

        // Calculate and output the amount of paint (in gallons) needed to paint the wall
        gallonsPaintNeeded = wallArea / squareFeetPerGallons;
        System.out.printf("Paint needed: %.15f gallons\n", gallonsPaintNeeded); //To get the exact output
        // as professor's, must modify the length to match it.

    }
}
