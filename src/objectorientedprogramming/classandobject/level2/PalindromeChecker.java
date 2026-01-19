package objectorientedprogramming.classandobject.level2;
/*
Problem Statement:
Create a PalindromeChecker class with an attribute text.
Add methods to check palindrome and display result.
*/

class PalindromeCheckerDetails {
    private String text;

    public PalindromeCheckerDetails(String text) {
        this.text = text;
    }

    public boolean isPalindrome() {
        String reversed = new StringBuilder(text).reverse().toString();
        return text.equalsIgnoreCase(reversed);
    }

    public void displayResult() {
        System.out.println("Text: " + text);
        System.out.println("Is Palindrome: " + isPalindrome());
    }
}

public class PalindromeChecker {
    public static void main(String[] args) {
        PalindromeCheckerDetails checker = new PalindromeCheckerDetails("Madam");
        checker.displayResult();
    }
}