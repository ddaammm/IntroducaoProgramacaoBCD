import java.util.Scanner;
public class Uni5Exe24 {

    public static void main(String[] args) {
        
        Scanner tec = new Scanner(System.in);

        System.out.println("Qual o limite de peso em quilogramas?");
        int n = tec.nextInt();

        for (int i = 1; i <= n; i++) {

            System.out.println("Qual o peso do peixe obtido em gramas?");
            int pesoGramas = tec.nextInt();

            System.out.println("Peso total obtido: " + pesoGramas + " gramas");

            System.out.println("Deseja informar o peso de mais um peixe? (digite 's' para SIM ou 'n' para NÃO");
            char opcao = tec.next().charAt(0);

            switch (opcao) {
                case 's': 
                System.out.println("Qual o peso do peixe obtido em gramas?");
                pesoGramas = tec.nextInt();
            
                    break;

                case 'n': 
                System.out.println("Contagem finalizada");
            
                default:
                    break;
            }

            

        }
    }

}
