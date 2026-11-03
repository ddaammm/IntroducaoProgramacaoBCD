import java.util.Scanner;
public class Bee1541 {

    public static void main(String[] args) {
        
        Scanner tec = new Scanner(System.in);

        int a = tec.nextInt();

        while (a != 0) {

            int b = tec.nextInt();
            int c = tec.nextInt();

            int lado = (int) Math.sqrt(a * b * 100.0 / c);

            System.out.println(lado);

            a = tec.nextInt();

        }
    }

}
