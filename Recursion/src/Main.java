public class Main {
    public static void main(String[] args) {
        Recursion recursion = new Recursion();

        // Test the factorial method
        int factorialResult = recursion.factorial(5);
        System.out.println("Factorial of 5: " + factorialResult);

        // Test the Fibonacci method
        int fibonacciResult = recursion.fibonacci(6);
        System.out.println("Fibonacci number at position 6: " + fibonacciResult);

        // Test the isPalindrome method
        String palindromeStr = "A man, a plan, a canal, Panama";
        boolean isPalindrome = recursion.isPalindrome(palindromeStr);
        System.out.println("Is '" + palindromeStr + "' a palindrome? " + isPalindrome);
    }
}
