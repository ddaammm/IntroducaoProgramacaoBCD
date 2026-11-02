import java.util.Scanner;
public class Bee1072 {

    public static void main(String[] args) {
        
        Scanner tec = new Scanner(System.in);

        int n = tec.nextInt();
        int in = 0;
        int out = 0;

        for (int i = 0; i < n; i++) {
            int x = tec.nextInt();

            if (x >= 10 && x <= 20) {
                in++;
                
            } else {
                out++;

            }
        }

        System.out.println(in + " in");
        System.out.println(out + " out");
    }

}
