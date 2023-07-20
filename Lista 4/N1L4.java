package Lista4;

import java.util.Scanner;

/**
 *
 * @author Arthur
 */
public class N1L4 {

    public static void main(String[] args) {
        /**
         * Leia um valor inteiro X (1 <= X <= 1000). Em seguida mostre os
         * ímpares de 1 até X, um valor por linha, inclusive o X, se for o caso.
         */

        Scanner s = new Scanner(System.in);

        int x;

        System.out.println("Informe o valor de X: ");
        x = s.nextInt();

        for (int i = 1; i <= x; i++) {
            if (i % 2 != 0) {
                System.out.println("Os números ímpares até " + x +" são: " + i);
            }
        }

        s.close();

    }

}
