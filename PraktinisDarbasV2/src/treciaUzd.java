import java.util.Scanner;

public class treciaUzd {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a name:");
        String input = scanner.nextLine();

        if (input.contains("as")){
            System.out.println(input + " is a man");
        } else {
            System.out.println(input + " is a woman");
        }


    }
}
