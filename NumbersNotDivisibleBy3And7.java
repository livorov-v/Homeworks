import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by user on 12/18/2015.
 */
public class NumbersNotDivisibleBy3And7  {
    public static void main (String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        int n = Integer.parseInt(reader.readLine());
        int n = 10;
        int start = 1;
        while (start <= n) {
            if (start % 3 == 0 || start % 7 == 0) {
                System.out.print("");
            }  else {
                System.out.print(start + " ");
            }
            ++ start;
            }
        }

    }

