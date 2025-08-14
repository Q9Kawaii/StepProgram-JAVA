package Week02.S1PracticeProblem;

public class StringPerformanceComparison {
    public static void main(String[] args) {
        long start = System.nanoTime();
        concatenateWithString(1000);
        long end = System.nanoTime();
        System.out.println("String: " + (end - start));

        start = System.nanoTime();
        concatenateWithStringBuilder(1000);
        end = System.nanoTime();
        System.out.println("StringBuilder: " + (end - start));

        start = System.nanoTime();
        concatenateWithStringBuffer(1000);
        end = System.nanoTime();
        System.out.println("StringBuffer: " + (end - start));

        demonstrateStringBuilderMethods();
        compareStringComparisonMethods();
    }
    public static String concatenateWithString(int n) {
        String res = "";
        for (int i = 0; i < n; i++) res += "Java " + i + " ";
        return res;
    }
    public static String concatenateWithStringBuilder(int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) sb.append("Java ").append(i).append(" ");
        return sb.toString();
    }
    public static String concatenateWithStringBuffer(int n) {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < n; i++) sb.append("Java ").append(i).append(" ");
        return sb.toString();
    }
    public static void demonstrateStringBuilderMethods() {
        StringBuilder sb = new StringBuilder("Hello World");
        sb.append("!!!");
        sb.insert(5, " Java");
        sb.delete(0, 2);
        sb.deleteCharAt(3);
        sb.reverse();
        sb.replace(0, 5, "Hey");
        sb.setCharAt(0, 'h');
        System.out.println(sb.capacity());
        sb.ensureCapacity(50);
        sb.trimToSize();
        System.out.println(sb);
    }
    public static void compareStringComparisonMethods() {
        String str1 = "Hello", str2 = "Hello", str3 = new String("Hello");
        System.out.println(str1 == str2);
        System.out.println(str1.equals(str3));
        System.out.println(str1.equalsIgnoreCase("hello"));
        System.out.println(str1.compareTo("Hello"));
        System.out.println(str1.compareToIgnoreCase("hello"));
    }
}

