import java.util.Scanner;

public class Problem06_20_22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number greater than 0: ");
        int n = input.nextInt();
        while(n <= 0 )
        {
            System.out.println("Please enter a number greater than 0: ");
            n = input.nextInt();
        }
        int[] array = new int[n];

        System.out.print("Enter " + n + " integers: ");

        for (int count = 0; count < array.length; count++)
        {
            array[count] = input.nextInt();
            System.out.print(array[count] + " ");
        }

        int max = array[0];
        int min = array[0];
        int sum = 0;
        double avg;

        System.out.println();
        for (int count = 0; count < array.length; count++)
        {
            if (array[count] > max)
            {
                max = array[count];
            }
            if (array[count] < min)
            {
                min = array[count];
            }

            sum += array[count];
        }
        avg = (double) sum / n;
        sum = sum + array[0];
        System.out.println("Maximum value: " + max);
        System.out.println("Minimum value: " + min);
        //System.out.println("Average: " + avg);
        System.out.printf("Average: %.1f:", avg);

        System.out.println();
        System.out.println("Elements greater than average: ");
        for (int count = 0; count < array.length; count++)
        {
            if (array[count] > avg)
            {
                System.out.print(array[count] + " ");
            }
        }

        System.out.println();
        System.out.println("Elements greater than 2: ");
        for (int count = 0; count < array.length; count++)
        {
            if (array[count] > array[array.length - 1])
            {
                System.out.print(array[count] + " ");
            }
        }

        System.out.println();
        System.out.println("Array in reverse order: ");
        for (int count = array.length - 1; count >= 0; count--)
        {
            System.out.print(array[count] + " ");
        }
    }
}

