import java.util.Scanner;
import java.util.Arrays;


public class TextProcessor {
    public static String cleanInput(String input) {
        if (input == null || input.trim().isEmpty()) {
            return "";
        }
        // Trim leading/trailing whitespace and replace multiple spaces with a single one
        String cleaned = input.trim().replaceAll("\\s+", " ");
        return Character.toUpperCase(cleaned.charAt(0)) + cleaned.substring(1);
    }
    public static void analyzeText(String text) {
        if (text.isEmpty()) {
            System.out.println("No text to analyze.");
            return;
        }


        int characterCount = text.length();
        int wordCount = text.split("\\s+").length;
        int sentenceCount = text.split("[.!?]+").length;
        String[] words = text.split("\\s+");
        String longestWord = "";
        for (String word : words) {
            String cleanWord = word.replaceAll("[^a-zA-Z]$", "");
            if (cleanWord.length() > longestWord.length()) {
                longestWord = cleanWord;
            }
        }
        // --- Find Most Common Character (case-insensitive, letters only) ---
        int[] charFreq = new int[256];
        for (char c : text.toLowerCase().toCharArray()) {
            if (Character.isLetter(c)) {
                charFreq[c]++;
            }
        }
        int maxFreq = -1;
        char mostCommonChar = ' ';
        for (int i = 0; i < charFreq.length; i++) {
            if (charFreq[i] > maxFreq) {
                maxFreq = charFreq[i];
                mostCommonChar = (char) i;
            }
        }
        System.out.println("\n--- TEXT ANALYSIS ---");
        System.out.println("Character Count: " + characterCount);
        System.out.println("Word Count: " + wordCount);
        System.out.println("Sentence Count: " + sentenceCount);
        System.out.println("Longest Word: \"" + longestWord + "\"");
        System.out.println("Most Common Letter: '" + mostCommonChar + "' (appeared " + maxFreq + " times)");
    }


    public static String[] getWordsSorted(String text) {
        String[] words = text.split("\\s+");
        for (int i = 0; i < words.length; i++) {
            words[i] = words[i].replaceAll("[^a-zA-Z]", "").toLowerCase();
        }


        Arrays.sort(words);
        return words;
    }


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("=== TEXT PROCESSOR ===");


        // 1. Ask user for a paragraph of text
        String userInput;
        do {
            System.out.print("\nPlease enter a paragraph to analyze: ");
            userInput = s.nextLine();
            if (userInput.trim().isEmpty()) {
                System.out.println("Input cannot be empty. Please try again.");
            }
        } while (userInput.trim().isEmpty());
        // 2. Cleans and validates the input
        String cleanedText = cleanInput(userInput);
        System.out.println("\n--- Cleaned Text ---");
        System.out.println(cleanedText);
        // 3. Analyzes the text
        analyzeText(cleanedText);
        // 4. Shows the words in alphabetical order
        String[] sortedWords = getWordsSorted(cleanedText);
        System.out.println("\n--- WORDS (ALPHABETICAL ORDER) ---");
        // Arrays.toString() is a handy way to print array contents
        System.out.println(Arrays.toString(sortedWords));
        // 5. Allows user to search for specific words
        while (true) {
            System.out.print("\nDo you want to search for a word? (yes/no): ");
            String choice = s.nextLine().toLowerCase();
            if (!choice.equals("yes")) {
                break; // Exit the search loop
            }
            System.out.print("Enter the word to search for: ");
            String searchWord = s.nextLine().toLowerCase().trim();
            int occurrences = 0;
            // We search in the already sorted (and lowercased) word list
            for (String word : sortedWords) {
                if (word.equals(searchWord)) {
                    occurrences++;
                }
            }
            System.out.println("The word \"" + searchWord + "\" appears " + occurrences + " time(s).");
        }
        s.close();
    }
}
