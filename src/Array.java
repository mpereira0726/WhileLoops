import java.util.Scanner;

    public class Array {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            System.out.println("Enter an integer between 1 and 20");

            int n = input.nextInt();

            if (n >= 1 && n <= 20) {

                int arr[] = new int[n];

                for(int i = 0; i < arr.length; i++)
                {
                    arr[i] = (int)Math.pow(2,i);
                    System.out.println(arr [i]);
                }}
        }
    }

