import java.util.Scanner;

public class Problem4 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print("Enter integer n: ");
        int n = input.nextInt();

        int sum = 0;
        int num;

        while (n > 0) {
            num = n % 10;
            sum += num;
            n/= 10;
        }
        System.out.print("The sum of all digits of " + n + " is: " + sum);
    }
}
