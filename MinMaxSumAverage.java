import java.util.Scanner;

/**
 * Created by user on 12/19/2015.
 */
public class MinMaxSumAverage {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int min = Integer.MAX_VALUE;
        int max = 0;
        int sum = n;
        double avg = 0;


        for (int Count = 0 ; Count < n ; Count++){
            int currentNumber = scanner.nextInt();
            if (currentNumber < min ) {
                min = currentNumber;
            }
            if (currentNumber > max) {
                max = currentNumber;
            }

            sum += currentNumber;
            avg = ((double)sum)/(double)(n + 1);
        }
        System.out.println("The minimun currency is" + min);
        System.out.println("The maximum currency is" + max);
        System.out.println("The sum currency is" + sum);
        System.out.println("The average currency is" + avg);
    }
}
