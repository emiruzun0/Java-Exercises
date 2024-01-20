public class Recursion {


    // Recursive method to calculate factorial
    public int factorial(int n) {
        if (n == 0) {
            return 1; // Base case: 0! is 1
        } else {
            return n * factorial(n - 1); // Recursive case
        }
    }

    // Recursive method to calculate the nth Fibonacci number
    public int fibonacci(int n) {
        if (n <= 1) {
            return n; // Base cases: Fibonacci of 0 is 0, and of 1 is 1
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2); // Recursive case
        }
    }

    // Recursive method to calculate great common divisor
    public static double gcd(int m, int n){
        if(m % n == 0){   //Base case : GCD is n if m mod n is 0
            return n;
        }
        else if(n > m){     //Recursive case
            return gcd(n,m);
        }
        else return gcd(n, m%n);    //Recursive case

    }

    // Recursive method to check if a string is a palindrome
    public boolean isPalindrome(String str) {
        str = str.toLowerCase().replaceAll("[^a-z0-9]", ""); // Normalize and remove non-alphanumeric characters
        if (str.length() <= 1) {
            return true; // Base case: Empty or single-character string is a palindrome
        } else if (str.charAt(0) != str.charAt(str.length() - 1)) {
            return false; // Base case: First and last characters don't match, not a palindrome
        } else {
            // Recursive case: Check the substring without the first and last characters
            return isPalindrome(str.substring(1, str.length() - 1));
        }
    }

}
