
import java.util.Scanner;

public class PigLatin {
    public static void main(String[] args) {
        
        Scanner keyboard = new Scanner (System.in);
        System.out.println("Enter the first name: ");
        String firstName = keyboard.nextLine();
        System.out.println("Enter the last name: ");
        String lastName = keyboard.nextLine();
    
        char originalFirstLetterFirstName = Character.toLowerCase(firstName.charAt(0)); // first letter extracted.
        char originalFirstLetterLastName = Character.toLowerCase(lastName.charAt(0));
        String restFirstName = firstName.substring(1).toLowerCase();
        String restLastName = lastName.substring(1).toLowerCase();

        String convertedFirst = restFirstName + originalFirstLetterFirstName + "ay";
        convertedFirst = Character.toUpperCase(convertedFirst.charAt(0)) + convertedFirst.substring(1);
        String convertedLast = restLastName + originalFirstLetterLastName + "ay";
        convertedLast = Character.toUpperCase(convertedLast.charAt(0)) + convertedLast.substring(1);
        
        System.out.println("Converted full name: " + convertedFirst + " " + convertedLast);

    }

}