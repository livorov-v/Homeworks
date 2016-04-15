import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by user on 12/12/2015.
 */
public class GravityOnMoon {
    public static void main (String[] args)  throws IOException {
        System.out.print("Write you weight in Earth measures: ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        float kilos = Float.parseFloat(reader.readLine());
        kilos*=0.17;

        System.out.printf("Your weight on Earth is %.2f.", kilos);
    }
}
