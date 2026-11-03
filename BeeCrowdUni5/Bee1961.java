import java.util.Scanner;
public class Bee1961 {

    public static void main(String[] args) {
        
        Scanner tec = new Scanner(System.in);

        int p = tec.nextInt();
        int n = tec.nextInt();
        int anterior = tec.nextInt();
        int erros = 0;

        for (int i = 1; i < n; i++) {

            int proximo = tec.nextInt();

            if (proximo - anterior > p || anterior - proximo > p) {

                erros++;
                
            }

            anterior = proximo;

        }

        if (erros == 0) {

            System.out.println("YOU WIN");
            
        } else {

            System.out.println("GAME OVER");

        }

    }

}
