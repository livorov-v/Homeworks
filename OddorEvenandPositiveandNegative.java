import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class OddorEvenandPositiveandNegative {
    public static void main (String[] args) throws IOException {
        System.out.print("Write a number if you want to know if it is odd or even: ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(reader.readLine());
//        if (a % 2 == 0) {
//            System.out.print("The number is even.");
//        } else {
//            System.out.print("The number is odd.");
//        }
        String str1;
        String str2 = "";

        if (number % 2 == 0) {
            str2 = " even.";
        } else {
            str2 = " odd.";
        }

        if (number > 0) {
            System.out.print("The number is positive and" + str2);
        }

        if (number < 0) {
            System.out.print("The number is negative and" + str2);
        }

        if (number==0) {
            System.out.println("The number is zero.");
        }




    }
}
