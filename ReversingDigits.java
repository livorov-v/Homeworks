/**
 * Created by user on 12/15/2015.
 */
public class ReversingDigits {
    public static void main (String[] args) {
        int number = 12345678;

        while (number > 0) {
            System.out.print( number % 10);
            number = number / 10;
        }
    }
}
