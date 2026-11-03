import java.util.Scanner;

public class Bee1153 {

    public static void main(String[] args) {

        Scanner tec = new Scanner(System.in);

        int n = tec.nextInt();
        int fatorial = 1;

        if (n > 0 && n < 13) {

            for (int i = 1; i <= n; i++) {
                fatorial = fatorial * i;

            }
        }
        
        System.out.println(fatorial);

    }

}
