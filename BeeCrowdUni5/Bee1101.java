import java.util.Scanner;
public class Bee1101 {

    public static void main(String[] args) {
        
        Scanner tec = new Scanner(System.in);

        int m, n;
        m = tec.nextInt();
        n = tec.nextInt();

        while (m > 0 && n > 0) {

            int menor, maior;
            int soma = 0;

            if (m > n) {
                maior = m;
                menor = n;
            } else {
                maior = n;
                menor = m;
            }

            for (int i = menor; i <= maior; i++) {
                System.out.print(i + " ");
                soma += i;
            }

            System.out.println("Sum=" + soma);

            m = tec.nextInt();
            n = tec.nextInt();
        }

    }

}