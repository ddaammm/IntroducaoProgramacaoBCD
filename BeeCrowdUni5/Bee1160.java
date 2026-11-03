import java.util.Scanner;
public class Bee1160 {

    public static void main(String[] args) {
        
        Scanner tec = new Scanner(System.in);

        int t = tec.nextInt();

        if (t >= 1 && t <= 3000) {

            for (int i = 1; i <= t; i++) {

                int pa = tec.nextInt();
                int pb = tec.nextInt();

                if (pa >= 100 && pa <= 1000000 && pb > pa && pb <= 1000000) {
                    
                    double g1 = tec.nextDouble();
                    double g2 = tec.nextDouble();

                    if (g1 >= 0.1 && g1 <= 10.0 && g1 > g2 && g2 >= 0.0 && g2 <= 10.0) {

                        int anos = 0;

                        for (int ano = 1; ano <= 100; ano++) {

                            pa = (int) (pa + (pa * g1 / 100));
                            pb = (int) (pb + (pb * g2 / 100));

                            if (pa > pb) {
                                anos = ano;
                                
                            }

                        }
                        
                        if (anos > 0) {
                            System.out.println(anos + " anos.");
                            
                        } else {
                            System.out.println("Mais de 1 seculo.");
                        }
                    }
                    
                }

            }
            
        }
    }

}
