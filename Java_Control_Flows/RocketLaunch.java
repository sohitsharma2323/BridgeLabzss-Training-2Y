import java.util.*;

public class RocketLaunch {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the countdown time in seconds: ");
        int count = sc.nextInt();
        while (count >= 1) {
            System.out.println(count);
            count--;
        }
    }
}
