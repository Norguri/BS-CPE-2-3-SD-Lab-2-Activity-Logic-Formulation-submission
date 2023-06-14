public class Palindrome {
    public static void main(String[] args) {
        String original = "racecar";
        String reversed = "";

        // This will everse the original string
        for (int i = original.length() - 1; i >= 0; i--) {
            reversed += original.charAt(i);
        }

        // This will check if the original and reversed strings are the same
        boolean isPalindrome = original.equals(reversed);

        if (isPalindrome) {
            System.out.println(original + " is a palindrome.");
        } else {
            System.out.println(original + " is not a palindrome.");
        }
    }
}