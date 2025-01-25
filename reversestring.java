public class reversestring {
    public static void main(String[] args) {
        String original = "Hello, World!"; // Original string
        String reversed = ""; // String to hold the reversed string

        // Loop through the original string in reverse order
        for (int i = original.length() - 1; i >= 0; i--) {
            reversed += original.charAt(i); // Append each character to the reversed string
        }

        // Print the reversed string
        System.out.println("Reversed string: " + reversed);
    }
}


