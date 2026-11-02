import java.util.Scanner;
public class Bee1075 {

    public static void main(String[] args) {
        
        Scanner tec = new Scanner(System.in);

        int n = tec.nextInt();
        
        for (int i = 0; i <= 10000; i++) {

            if (i % n == 2) {
                System.out.println(i);
            }
        }
    }

}
