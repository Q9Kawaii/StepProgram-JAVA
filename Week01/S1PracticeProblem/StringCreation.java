public class StringCreation {
    public static void main(String[] args) {
        // 1. String literal
        String str1 = "Java Programming";
        // 2. new String() constructor
        String str2 = new String("Java Programming");
        // 3. Character array
        char[] charArray = {'J', 'a', 'v', 'a', ' ', 'P', 'r', 'o', 'g', 'r', 'a', 'm', 'm', 'i', 'n', 'g'};
        String str3 = new String(charArray);
        System.out.println("String 1 (literal): " + str1);
        System.out.println("String 2 (new String()): " + str2);
        System.out.println("String 3 (char array): " + str3);
        // TODO: Compare the strings using == and .equals()
        System.out.println("Comparing str1 and str2 with ==: " + (str1 == str2)); // false
        System.out.println("Comparing str1 and str2 with .equals(): " + str1.equals(str2)); // true
        System.out.println("\n--- Comparing two new String() objects ---");
        System.out.println("Comparing str2 and str3 with ==: " + (str2 == str3)); // false
        System.out.println("Comparing str2 and str3 with .equals(): " + str2.equals(str3)); // true
        System.out.println("\nExplanation:");
        System.out.println("The '==' operator compares the memory location of two objects, not their content. [8]");
        System.out.println("The .equals() method, when used for strings, compares the actual sequence of characters. [3]");
        System.out.println("\n- str1 is a string literal, which is stored in a special memory area called the string pool. [11, 15]");
        System.out.println("- str2 and str3 were created using the 'new' keyword. This forces the creation of a new, distinct object in the heap memory every time, regardless of whether another string with the same content exists. [9, 15]");
        System.out.println("- Therefore, str1, str2, and str3 all point to different objects in memory, which is why the '==' comparisons all return 'false'.");
        System.out.println("- Since all three strings contain the exact same characters, the .equals() comparisons all return 'true'.");
        // TODO: Create a string with escape sequences that displays:
        String quote = "Programming Quote:\n\"Code is poetry\" - Unknown\nPath: C:\\Java\\Projects";
        System.out.println(quote);
    }
}
