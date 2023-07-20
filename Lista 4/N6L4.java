package Lista4;

import java.util.Scanner;

/**
 *
 * @author Arthur
 */
public class N6L4 {

    public static void main(String[] args) {

        /**
         * Ler um número inteiro N e calcular todos os seus divisores.
         */
        
        Scanner s = new Scanner(System.in);

        int n;

        System.out.println("Informe um número: ");
        n = s.nextInt();

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.println("Os divisores de " + n + " são: " + i);
            }
        }

        s.close();

    }

}
