import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {

        double x;
        double S;
        double P;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number:");

        x = scanner.nextDouble();

        S = x * x;
        P = x * 4;

        System.out.println("Square = " + S + " units²");
        System.out.println("Perimeter = " + P + " units");



    }
}
