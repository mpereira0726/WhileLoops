import java.util.Scanner;

public class Problem4 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print("Enter integer n: ");
        int n = input.nextInt();

        int sum = 0;
        for(int i = Math.abs(n); i != 0; i/=10)
        {
            sum += i%10;
        }
        System.out.print("The sum of all digits of " + n + " is: " + sum);
    }
}
