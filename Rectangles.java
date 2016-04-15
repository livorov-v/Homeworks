import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

/**
 * Created by user on 12/12/2015.
 */
public class Rectangles {
    public static void main (String[] args) throws IOException {
        System.out.print("Write the size of the two sides of a rectangle: ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = a*b;
        int d = (a+b)*2;
        PrintStream printf = System.out.printf("The area of the rectangle is %d and the perimeter is %d", c, d);
    }
}
