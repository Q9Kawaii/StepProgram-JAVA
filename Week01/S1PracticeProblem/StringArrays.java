
public class StringArrays {
    public static String findLongestName(String[] names) {
        if (names == null || names.length == 0) {
            return "";
        }
        String longestName = names[0];
        for (int i = 1; i < names.length; i++) {
            if (names[i].length() > longestName.length()) {
                longestName = names[i];
            }
        }
        return longestName;
    }
    public static int countNamesStartingWith(String[] names, char letter) {
        if (names == null || names.length == 0) {
            return 0;
        }
        int count = 0;
        char lowerCaseLetter = Character.toLowerCase(letter);
        for (String name : names) {
            if (!name.isEmpty() && Character.toLowerCase(name.charAt(0)) == lowerCaseLetter) {
                count++;
            }
        }
        return count;
    }
    public static String[] formatNames(String[] names) {
        if (names == null || names.length == 0) {
            return new String[0];
        }
        String[] formattedNames = new String[names.length];
        for (int i = 0; i < names.length; i++) {
            String name = names[i];
            int spaceIndex = name.indexOf(' ');
            if (spaceIndex != -1) {
                String firstName = name.substring(0, spaceIndex);
                String lastName = name.substring(spaceIndex + 1);
                formattedNames[i] = lastName + ", " + firstName;
            } else {
                formattedNames[i] = name;
            }
        }
        return formattedNames;
    }
    public static void main(String[] args) {
        String[] students = {"John Smith", "Alice Johnson", "Bob Brown", "Carol Davis", "David Wilson"};
        // 1. Test findLongestName
        String longest = findLongestName(students);
        System.out.println("The longest name in the list is: " + longest);
        System.out.println("----------------------------------------");
        // 2. Test countNamesStartingWith
        char letterToCount = 'D';
        int nameCount = countNamesStartingWith(students, letterToCount);
        System.out.println("Number of names starting with '" + letterToCount + "': " + nameCount);
        System.out.println("----------------------------------------");
        // 3. Test formatNames
        String[] formatted = formatNames(students);
        System.out.println("List of names formatted as 'Last, First':");
        for (String formattedName : formatted) {
            System.out.println(formattedName);
        }
    }
}
