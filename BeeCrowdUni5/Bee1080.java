import java.util.Scanner;
public class Bee1080 {

    public static void main(String[] args) {
        
        Scanner tec = new Scanner(System.in);

        int n;
        int maior = 0;
        int posicao = 0;

        for (int i = 1; i <= 4; i++) {

            n = tec.nextInt();

            if (n > maior) {
                
                maior = n;
                posicao = i;
                
            }

        } 

        System.out.println(maior);
        System.out.println(posicao);
    }

}
