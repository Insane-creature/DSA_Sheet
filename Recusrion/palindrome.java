package Recusrion;

public class palindrome {
    public static boolean isPalindrome(String str) {
        String cleanStr = str.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
        return isPalindromeHelper(cleanStr, 0, cleanStr.length() - 1);
    }
    private static boolean isPalindromeHelper(String str, int start, int end) {
        if (start >= end) {
            return true;
        }
        if (str.charAt(start) != str.charAt(end)) {
            return false;
        }
        return isPalindromeHelper(str, start + 1, end - 1);
    }

    public static void main(String[] args) {
        String input = "coloc";
        
        boolean result = isPalindrome(input);
        
        if (result) {
            System.out.println(input + " is a palindrome.");
        } else {
            System.out.println(input + " is not a palindrome.");
        }
    }
}
