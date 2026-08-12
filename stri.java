class StringOperationsDemo {
    public static void main(String[] args) {
        // 1. Creating Strings
        String str1 = "Hello";
        String str2 = new String("World");
        // 2. Length of a String
        System.out.println("Length of str1: " + str1.length());
        // 3. Accessing Characters
        System.out.println("Character at index 1 in str1: " + str1.charAt(1));
        // 4. Substrings
        System.out.println("Substring of str1 from index 2: " + str1.substring(2));
        System.out.println("Substring of str2 from index 0 to 3: " + str2.substring(0, 3));
        // 5. Concatenation
        String combined = str1.concat(" " + str2);
        System.out.println("Concatenated string: " + combined);
        // 6. Changing Case
        System.out.println("Uppercase: " + combined.toUpperCase());
        System.out.println("Lowercase: " + combined.toLowerCase());
    }
}
