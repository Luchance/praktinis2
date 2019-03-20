import java.util.Scanner;

public class desimtaUzd {
    public static void main(String[] args) {

        int x;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number:");

        x = scanner.nextInt();
        int result = 1;
        for (int i = 1; i <= x; i++) {
            result = result * i;
        }
        System.out.println("The factorial of " + x + " is " + result);


    }
}
