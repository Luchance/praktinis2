public class penktaUzd {
    public static void main(String[] args) {
        int i = 1, n = 1000, t1 = 0, t2 = 1;
        System.out.print("Fibonacci series = ");

        while (t1 <= n)
        {
            System.out.print(t1 + " ");

            int sum = t1 + t2;
            t1 = t2;
            t2 = sum;

            i++;
        }
    }
}
