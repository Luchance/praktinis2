import java.util.Scanner;

public class antraUzd {
    public static void main(String[] args) {
        System.out.println("f(x)=ax2+bx+c, a≠0");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert value for a: ");
        double a = Double.parseDouble(scanner.nextLine());
        System.out.println("Insert value for b: ");
        double b = Double.parseDouble(scanner.nextLine());
        System.out.println("Insert value for c: ");
        double c = Double.parseDouble(scanner.nextLine());
        scanner.close();

        double x1 = (-b + Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / (2 * a);
        double x2 = (-b - Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / (2 * a);

        if (Double.isNaN(x1) || Double.isNaN(x2))
        {
            System.out.println("Answer contains imaginary numbers");
        } else System.out.println("x1 and x2 values are: " + x1 + ", " + x2);
    }
}
