import java.util.Scanner;

public class Uni6Exe03 {

    private void separarFrase(String frase) {

        frase = frase + " ";

        int cont = 0;

        for (int i = 0; i < frase.length(); i++) {

            if (frase.charAt(i) == ' ') {
                System.out.println(" " + cont);
                cont = 0;

            } else {
                System.out.print(frase.charAt(i));
                cont++;

            }

        }

    }

    public static void main(String[] args) {

        Scanner tec = new Scanner(System.in);

        Uni6Exe03 exe03 = new Uni6Exe03();

        System.out.println("Digite uma frase:");
        String frase = tec.nextLine();

        exe03.separarFrase(frase);

    }
}