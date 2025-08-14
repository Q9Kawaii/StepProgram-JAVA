package Week02.S1PracticeProblem;

public class StringBuiltInMethods {
    public static void main(String[] args) {
        String sampleText = " Java Programming is Fun and Challenging! ";
        System.out.println(sampleText.length());
        String trimmed = sampleText.trim();
        System.out.println(trimmed.length());
        System.out.println(sampleText.charAt(5));
        System.out.println(trimmed.substring(5, 16));
        System.out.println(trimmed.indexOf("Fun"));
        System.out.println(trimmed.contains("Java"));
        System.out.println(trimmed.startsWith("Java"));
        System.out.println(trimmed.endsWith("!"));
        System.out.println(trimmed.toUpperCase());
        System.out.println(trimmed.toLowerCase());
        System.out.println(countVowels(trimmed));
        findAllOccurrences(trimmed, 'a');
    }
    public static int countVowels(String text) {
        int count = 0; String vowels = "AEIOUaeiou";
        for (int i = 0; i < text.length(); i++) if (vowels.indexOf(text.charAt(i)) != -1) count++;
        return count;
    }
    public static void findAllOccurrences(String text, char target) {
        for (int i = 0; i < text.length(); i++) if (text.charAt(i) == target) System.out.print(i + " ");
        System.out.println();
    }
}

