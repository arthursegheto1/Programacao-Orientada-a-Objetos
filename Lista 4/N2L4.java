package Lista4;

import java.util.Scanner;

/**
 *
 * @author Arthur
 */
public class N2L4 {

    public static void main(String[] args) {

        /**
         * Leia um valor inteiro N. Este valor será a quantidade de valores
         * inteiros X que serão lidos em seguida. Mostre quantos destes valores
         * X estão dentro do intervalo [10,20] e quantos estão fora do
         * intervalo, mostrando essas informações conforme exemplo (use a
         * palavra "in" para dentro do intervalo, e "out" para fora do
         * intervalo).
         *
         */
        
        Scanner s = new Scanner(System.in);

        int n;
        int x;
        int in = 0;
        int out = 0;

        System.out.println("Informe o valor de N: ");
        n = s.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Informe o valor de X: ");
            x = s.nextInt();

            if (x >= 10 && x <= 20) {
                in = in + 1;
            } else {
                out = out + 1;
            }
        }
        System.out.println(in + " in");
        System.out.println(out + " out");

        s.close();

    }
}
