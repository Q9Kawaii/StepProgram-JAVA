import java.util.Scanner;
public class StringMethods {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        // TODO: Ask user for their full name (first and last name)
        System.out.print("Enter your full name (first and last): ");
        String fullName = s.nextLine();
        // TODO: Ask user for their favorite programming language
        System.out.print("Enter your favorite programming language: ");
        String programmingLanguage = s.nextLine();
        // TODO: Ask user for a sentence about their programming experience
        System.out.print("Describe your programming experience in one sentence: ");
        String experienceSentence = s.nextLine();
        // 1. Extract first and last name separately
        int firstSpaceIndex = fullName.indexOf(' ');
        String firstName = fullName.substring(0, firstSpaceIndex);
        String lastName = fullName.substring(firstSpaceIndex + 1);
        // 2. Count total characters in the sentence (excluding spaces)
        String sentenceWithoutSpaces = experienceSentence.replace(" ", "");
        int charCount = sentenceWithoutSpaces.length();
        // 3. Convert programming language to uppercase
        String langInUpperCase = programmingLanguage.toUpperCase();
        // 4. Display a formatted summary
        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
        System.out.println("Favorite Language (in uppercase): " + langInUpperCase);
        System.out.println("Experience sentence has " + charCount + " characters (excluding spaces).");
        s.close();
    }
}
