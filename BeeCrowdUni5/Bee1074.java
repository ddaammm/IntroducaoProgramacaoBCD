import java.util.Scanner;
public class Bee1074 {

    public static void main(String[] args) {
        
        Scanner tec = new Scanner(System.in);

        int n = tec.nextInt();

        for (int i = 0; i < n; i++) {
            int x = tec.nextInt();

            if (x == 0) {
                System.out.println("NULL");
            } else {
                String parImpar;
                String postivoNegativo;

                if (x % 2 == 0) {
                    parImpar = "EVEN";
                } else {
                    parImpar = "ODD";
                }

                if (x > 0) {
                    postivoNegativo = "POSITIVE";
                } else {
                    postivoNegativo = "NEGATIVE";
                }

                System.out.println(parImpar + " " + postivoNegativo);
            }
        }

    }

}