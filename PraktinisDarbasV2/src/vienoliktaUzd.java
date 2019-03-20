import java.util.Random;

public class vienoliktaUzd {
    public static void main(String[] args) {

        Random rn = new Random();
        int[] values = new int[10];
        for(int i =0; i < 10; i++) {
            int answer = rn.nextInt(10);
            values[i] = answer;
            System.out.println(answer);
        }
        int sum = 0;
        for(int i : values) {
            sum += i;
        }
        System.out.println("Sum = " + sum);
    }
}


