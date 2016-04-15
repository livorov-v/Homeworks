import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by user on 12/12/2015.
 */
public class SumOfThreeNumbers {
    public static void main (String[] args) throws IOException {
        System.out.print("Write 3 numbers to sum them: ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        int sum = a+b+c;
        System.out.printf("The sum is %d.", sum);
    }
}
