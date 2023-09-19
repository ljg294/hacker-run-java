import java.util.Scanner;

//Java Lambda Expressions
public class Problem28 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();

        for (int i = 0; i < t; i++){
            int condition = scan.nextInt();
            int number = scan.nextInt();

            if (condition == 1){
                if (isOdd(number)){
                    System.out.println("EVEN");
                } else {
                    System.out.println("ODD");
                }
            }
            else if (condition == 2) {
                if (isPrime(number)) {
                    System.out.println("PRIME");
                } else {
                    System.out.println("COMPOSITE");
                }
            }
            else if (condition == 3) {
                if (isPalindrome(number)) {
                    System.out.println("PALINDROME");
                } else {
                    System.out.println("NOT PALINDROME");
                }
            }
        }
    }

    static boolean isOdd(int number){
        return number % 2 == 0;
    }
    static boolean isPrime(int number){
        if (number <= 1) 
            return false;
        
        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0)
                return false;
        }

        return true;
    }

    static boolean isPalindrome(int number) {
        int reversed = 0;
        int original = number;

        while(number > 0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number /= 10;
        }

        return original == reversed;

    }
}
