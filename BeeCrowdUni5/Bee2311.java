import java.util.Scanner;
public class Bee2311 {

    public static void main(String[] args) {
        
        Scanner tec = new Scanner(System.in);

        int n = tec.nextInt();

        for (int i = 1; i <= n; i++) {

            String nome = tec.next();
            double gd = tec.nextDouble();
            double n1 = tec.nextDouble();
            double n2 = tec.nextDouble();
            double n3 = tec.nextDouble();
            double n4 = tec.nextDouble();
            double n5 = tec.nextDouble();
            double n6 = tec.nextDouble();
            double n7 = tec.nextDouble();

            double maior = n1;

            if (n2 > maior) {
                
                maior = n2;
            }

            if (n3 > maior) {
                
                maior = n3;
            }

            if (n4 > maior) {
                
                maior = n4;
            }

            if (n5 > maior) {
                
                maior = n5;
            }

            if (n6 > maior) {
                
                maior = n6;
            }

            if (n7 > maior) {
                
                maior = n7;
            }

            double menor = n1;

            if (n2 < menor) {

                menor = n2;
                
            }

            if (n3 < menor) {

                menor = n3;
                
            }

            if (n4 < menor) {

                menor = n4;
                
            }

            if (n5 < menor) {

                menor = n5;
                
            }

            if (n6 < menor) {

                menor = n6;
                
            }

            if (n7 < menor) {

                menor = n7;
                
            }

            double notatotal = n1 + n2 + n3 + n4 + n5 + n6 + n7 - maior - menor;
            double notatotalgd = notatotal * gd;

            System.out.printf("%s %.2f%n", nome, notatotalgd);

        }

    }

}
