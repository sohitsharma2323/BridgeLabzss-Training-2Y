import java.util.*;

public class RocketLaunch2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the countdown time in seconds: ");
        int count = sc.nextInt();
        for ( ;count >= 1; count--) {
            System.out.println(count);
        }
    }
}
