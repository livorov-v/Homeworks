import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by user on 12/18/2015.
 */
public class NumbersFrom1ToN {
    public static void main (String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        int start = 1;
        while (start <= n) {
            System.out.print(start + " ");
            ++ start;
        }
    }
}
