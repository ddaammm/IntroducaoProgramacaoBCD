import java.util.Scanner;

public class Bee2060 {

    public static void main(String[] args) {

        Scanner tec = new Scanner(System.in);

        int n = tec.nextInt();
        int mult2 = 0;
        int mult3 = 0;
        int mult4 = 0;
        int mult5 = 0;

        for (int i = 1; i <= n; i++) {

            int l = tec.nextInt();

            if (l % 2 == 0) {

                mult2++;

            }

            if (l % 3 == 0) {

                mult3++;

            }

            if (l % 4 == 0) {

                mult4++;

            }

            if (l % 5 == 0) {

                mult5++;

            }

        }

        System.out.println(mult2 + " Multiplo(s) de 2");
        System.out.println(mult3 + " Multiplo(s) de 3");
        System.out.println(mult4 + " Multiplo(s) de 4");
        System.out.println(mult5 + " Multiplo(s) de 5");

    }

}
