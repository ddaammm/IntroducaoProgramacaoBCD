import java.util.Scanner;

public class Bee1151 {

    public static void main(String[] args) {

        Scanner tec = new Scanner(System.in);

        int n = tec.nextInt();

        if (n > 0 && n < 46) {

            int a = 0;
            int b = 1;

            for (int i = 1; i <= n; i++) {

                if (i > 1) {
                    System.out.print(" ");
                }
                System.out.print(a);

                int c = a + b;
                a = b;
                b = c;

            }

            System.out.println();

        }

    }
}
