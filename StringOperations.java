public class StringOperations{
    public static void main(String[] args) {
        // Strings creation
        String str1 = "Hello";
        String str2 = new String("World");
        // Length of a String
        System.out.println("Length of str1: " + str1.length());
        // Accessing Characters
        System.out.println("Character at index 1 in str1: " + str1.charAt(1));
        // Substrings
        System.out.println("Substring of str1 from index 2: " + str1.substring(2));
        System.out.println("Substring of str2 from index 0 to 3: " + str2.substring(0, 3));
        // Concatenation
        String combined = str1.concat(" " + str2);
        System.out.println("Concatenated string: " + combined);
        //  Changing Case
        System.out.println("Uppercase: " + combined.toUpperCase());
        System.out.println("Lowercase: " + combined.toLowerCase());
        //Searching
        String s = "Programming";
        System.out.println("Index of 'gram' in Programming: " + s.indexOf("gram"));
        System.out.println("Does Programming contain 'Pro'? " + s.contains("Pro"));
        //Comparing Strings
        String a = "Java";
        String b = "java";
        System.out.println("a equals b? " + a.equals(b));
        System.out.println("a equalsIgnoreCase b? " + a.equalsIgnoreCase(b));
        //removing spaces
        String spaced = "   Hello   ";
        System.out.println("Trimmed string: '" + spaced.trim() + "'");
    }
}
