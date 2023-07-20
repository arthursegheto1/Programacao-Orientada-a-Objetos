package Lista4;

import java.util.Scanner;

/**
 *
 * @author Arthur
 */
public class N5L4 {

    public static void main(String[] args) {

        /**
         * Ler um valor N. Calcular e escrever seu respectivo fatorial. Fatorial
         * de N = N * (N-1) * (N-2) * (N-3) * ... * 1. Lembrando que, por
         * definição, fatorial de 0 é 1.
         */
        
        Scanner s = new Scanner(System.in);

        int n;
        int fatorial = 1;

        System.out.println("Informe o valor de N: ");
        n = s.nextInt();

        for (int i = 1; i <= n; i++) {
            fatorial = fatorial * i;
        }
        System.out.println("O fatorial de " + n + " é: " + fatorial);
        
        s.close();
    }

}
