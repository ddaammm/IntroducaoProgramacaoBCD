import java.util.Scanner;

public class Uni6Exe01 {

    /**
     * Métodod para contar o número de vezes que a letra l aparece na frase
     * @param f
     * @param l
     * @return
     */
    private int contarLetras (String f, char l) {
        //variável para contar
        int contLetras = 0;
        //percorrer o string 
        for (int i = 0; i < f.length(); i++) {
            //ver se a letra na psição i é a pesquisada
            if (l == f.charAt(i)) {
                //contar a letra
                contLetras++;
            }

        }
        //retornar o resultado
        return contLetras;

    }

    public static void main(String[] args) {

        Scanner tec = new Scanner(System.in);
        Uni6Exe01 exe01 = new Uni6Exe01();

        System.out.println("Digite a frase:");
        String frase = tec.nextLine();

        System.out.println("Digite a letra a ser pesquisada:");
        char letra = tec.next().charAt(0);

        // chamar subprograma que conta a qtdade de letra na frase
        int contLetras = exe01.contarLetras(frase, letra);

        // escrever o resultado
        System.out.println("A letra " + letra + " aparece " + contLetras + " vezes na frase.");

    }

}
