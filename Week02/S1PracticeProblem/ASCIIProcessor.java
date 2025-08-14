package Week02.S1PracticeProblem;

import java.util.*;
public class ASCIIProcessor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        for (char ch : str.toCharArray()) {
            System.out.println(ch + " : " + (int) ch + " - " + classifyCharacter(ch));
            if (Character.isLetter(ch)) {
                System.out.println(Character.toUpperCase(ch) + " : " + (int) Character.toUpperCase(ch));
                System.out.println(Character.toLowerCase(ch) + " : " + (int) Character.toLowerCase(ch));
                System.out.println("Diff: " + (Character.toLowerCase(ch) - Character.toUpperCase(ch)));
            }
        }
        System.out.println(caesarCipher(str, 3));
        sc.close();
    }
    public static String classifyCharacter(char ch) {
        if (Character.isUpperCase(ch)) return "Uppercase Letter";
        if (Character.isLowerCase(ch)) return "Lowercase Letter";
        if (Character.isDigit(ch)) return "Digit";
        return "Special Character";
    }
    public static char toggleCase(char ch) {
        if (Character.isUpperCase(ch)) return (char)(ch + 32);
        if (Character.isLowerCase(ch)) return (char)(ch - 32);
        return ch;
    }
    public static String caesarCipher(String text, int shift) {
        StringBuilder sb = new StringBuilder();
        for (char ch : text.toCharArray()) {
            if (Character.isLetter(ch)) {
                char base = Character.isUpperCase(ch) ? 'A' : 'a';
                sb.append((char)((ch - base + shift) % 26 + base));
            } else sb.append(ch);
        }
        return sb.toString();
    }
    public static void displayASCIITable(int start, int end) {
        for (int i = start; i <= end; i++) System.out.println(i + " : " + (char)i);
    }
    public static int[] stringToASCII(String text) {
        int[] arr = new int[text.length()];
        for (int i = 0; i < text.length(); i++) arr[i] = text.charAt(i);
        return arr;
    }
    public static String asciiToString(int[] asciiValues) {
        StringBuilder sb = new StringBuilder();
        for (int val : asciiValues) sb.append((char)val);
        return sb.toString();
    }
}

