import java.util.Scanner;

public class Bee1114 {

    public static void main(String[] args) {
        
        Scanner tec = new Scanner(System.in);

        int senha = tec.nextInt();

        while (senha != 2002) {

            System.out.println("Senha Invalida");
            senha = tec.nextInt();

        } 

        System.out.println("Acesso Permitido");
    }

}

