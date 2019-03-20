import java.util.Scanner;

public class astuntaUzd {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a name:");
        String input = scanner.nextLine();
        scanner.close();

        String inputReverse = new StringBuffer(input).reverse().toString();
        if (input.equals(inputReverse)){
            System.out.println("Sitas zodis yra palindromas");
        } else {
            System.out.println("Zodis nera palindromas");
        }

    }
}
