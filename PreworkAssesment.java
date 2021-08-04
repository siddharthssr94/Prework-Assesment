import java.util.Scanner;
public class PreworkAssesment {

    Scanner sc = new Scanner(System.in);

    public void checkPalindrome(int number)  {
        int rem,reverse = 0,original;
        original = number;

        while(number > 0){
            rem = number % 10;  //getting remainder
            reverse = ( reverse * 10) + rem;
            number = number/10;
        }

        if(original == reverse)
            System.out.println("Palindrome number.");
        else
            System.out.println("Not a palindrome.");
    }

    public void printPattern(int rows) {
        for (int i = rows - 1; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public boolean checkPrimeNumber(int number) {

        if (number == 2)
            return true;

        else if (number % 2 == 0)
            return false;

        for (int i = 3; i <= Math.sqrt(number); i += 2)
        {
            if (number % i == 0)
                return false;
        }
        return true;
    }

    public void printFibonacciSeries(int number) {

        int first = 0, second = 1;

        System.out.print(first + " ");
        for (int i = 1; i < number; i++)
        {
            System.out.print(second + " ");
            int next = first + second;
            first = second;
            second = next;
        }

    }


    public static void main(String[] args) {

        PreworkAssesment obj = new PreworkAssesment();
        int choice;
        Scanner input = new Scanner(System.in);
        do {
            System.out.println("Enter your choice from below list.\n" + "1. Find palindrome of number.\n"
                    + "2. Print Pattern for a given no.\n" + "3. Check whether the no is a  prime number.\n"
                    + "4. Print Fibonacci series.\n" + "--> Enter 0 to Exit.\n");
            choice = input.nextInt();

            switch (choice) {
                case 0:
                    choice = 0;
                    break;

                case 1: {
                    System.out.println("Enter a number to be checked for palindrome : ");
                    int inputValue = input.nextInt();
                    obj.checkPalindrome(inputValue);
                    System.out.println();
                }
                break;

                case 2: {
                    System.out.println("Enter a number upto which pattern is to be printed : ");
                    int inputValue = input.nextInt();
                    obj.printPattern(inputValue);
                    System.out.println();
                }
                break;

                case 3: {
                    boolean isPrime;
                    System.out.println("Enter a number to check for prime number : ");
                    int inputValue = input.nextInt();
                    if ( inputValue < 2) {
                        System.out.println("Enter a number greater than 1.\n");

                    }
                    else {
                        isPrime = obj.checkPrimeNumber(inputValue);
                        if (isPrime == true)
                            System.out.println("Prime Number.\n");
                        else
                            System.out.println("Not a Prime Number.\n");
                    }
                }
                break;

                case 4: {
                    System.out.println("Enter how much of fibonacci series to be printed : ");
                    int inputValue = input.nextInt();
                    if ( inputValue < 1) {
                        System.out.println("Enter a number greater than 0.\n");
                    }
                    else {
                        obj.printFibonacciSeries(inputValue);
                        System.out.println();
                    }
                }
                break;

                default:
                    System.out.println("Invalid choice. Enter a valid no.\n");

            }
        } while (choice != 0);

        System.out.println("Exited Successfully!!!");
        input.close();
    }
}
