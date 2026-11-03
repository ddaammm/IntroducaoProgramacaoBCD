import java.util.Scanner;
public class Bee1115 {

    public static void main(String[] args) {
        
        Scanner tec = new Scanner(System.in);

        int x = tec.nextInt();
        int y = tec.nextInt();

        while (x != 0 || y != 0) {

            if (x > 0 && y > 0) {
                System.out.println("primeiro");
                
            } else if (x < 0 && y > 0) {
                System.out.println("segundo");
                
            } else if (x < 0 && y < 0) {
                System.out.println("terceiro");
                
            } else if (x > 0 && y < 0) {
                System.out.println("quarto");
                
            }

            x = tec.nextInt();
            y = tec.nextInt();

        }
    }

}
