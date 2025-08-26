import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to calculate its factorial: ");
        int number = sc.nextInt();
        int result = 1;
        int i = 1;
        while (i <= number) {
            result *= i;
            i++;
        }
        System.out.println("Factorial of " + number + " is: " + result);
    }
}
