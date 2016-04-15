import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by user on 12/18/2015.
 */
public class Sum {
    public static void main (String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Write a number \"n\" to get its sum from 1 to n: ");
        int n = Integer.parseInt(reader.readLine());
        int num = 1;
        int sum = 1;
        System.out.print("The sum is 1");
        while (num < n) {
            ++ num;
            sum += num;
            System.out.print("+" + num);
        }
        System.out.print("=" + sum);
    }
}
