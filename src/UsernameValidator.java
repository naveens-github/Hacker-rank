/*The first line of input contains an integer n, describing the total number of usernames. Each of the next n lines contains a string describing the username. The locked stub code reads the inputs and validates the username.
Sample Input
 8
 Julia
 Samantha
 Samantha_21
 1Samantha
 Samantha?10_2A
 JuliaZ007
 Julia@007
 _Julia007

Sample Output
 Invalid
 Valid
 Valid
 Invalid
 Invalid
 Valid
 Invalid
 Invalid
*/
import java.util.Scanner;
class UsernameValidator1 {
    public static final String regularExpression = "^[A-Za-z]\\w{7,29}$";
}


public class UsernameValidator {
    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int n = Integer.parseInt(scan.nextLine());
        while (n-- != 0) {
            String userName = scan.nextLine();

            if (userName.matches(UsernameValidator1.regularExpression)) {
                System.out.println("Valid");
            } else {
                System.out.println("Invalid");
            }
        }
    }
}