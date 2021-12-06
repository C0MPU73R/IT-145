import java.util.Objects;
import java.util.Scanner;

public class Week6Extra {
    public static void main(String[] args) {
        String user_string;
        boolean keep = true;
        String[] words;
        Scanner scnr = new Scanner(System.in);
        while (keep)
        {
            //prompt the user
            System.out.print("Enter input string: \n");

            user_string = scnr.nextLine();

            if (Objects.equals(user_string, "q"))
            {
                keep = false;
                continue;
            }
            if(!user_string.contains(","))
            {
                System.out.println("Error: No comma in string");
                continue;
            }

            //Get rid of all the whitespace
            user_string = user_string.replaceAll(" ", "");
            //extract the contents into two names
            words = user_string.split(",");


            System.out.println("First word: " + words[0]);
            System.out.println("Second word: " + words[1]);

            System.out.println("\n");
        }
        return;
    }
}