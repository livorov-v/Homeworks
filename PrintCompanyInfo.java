import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * A company has name,
 * address,
 * phone number,
 * fax number,
 * web site
 * and manager.
 * The manager has first name,
 * last name,
 * age
 * and a phone number.
 */
public class PrintCompanyInfo  {
    public static void main (String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter a company name: ");
        String a = reader.readLine();

        System.out.print("Enter an adress: ");
        String b = reader.readLine();

        System.out.print("Enter a phone number: ");
        String c = reader.readLine();

        System.out.print("Enter a fax number: ");
        String d = reader.readLine();

        System.out.print("Enter a website: ");
        String e = reader.readLine();

        System.out.print("Enter the first name of the manager: ");
        String f = reader.readLine();

        System.out.print("Enter the last name of the manager: ");
        String g = reader.readLine();

        System.out.print("Enter the age of the manager: ");
        int h = Integer.parseInt(reader.readLine());

        System.out.print("Enter his phone number: ");
        String i = reader.readLine();

        System.out.printf("The name of the company is %s.\n", a);
        System.out.printf("The adress is %s.\n", b);
        System.out.printf("The phone number is %s.\n", c);
        if (d.isEmpty()) {
            System.out.print("Fax: (no fax)\n");
        }  else {
            System.out.printf("Fax %s\n", d);
        }
        System.out.printf("The website is %s.\n", e);
        System.out.printf("The first name is %s.\n", f);
        System.out.printf("The last name is %s.\n", g);
        System.out.printf("The age is %s.\n", h);
        System.out.printf("The phone number is %s.\n", i);

    }
}
