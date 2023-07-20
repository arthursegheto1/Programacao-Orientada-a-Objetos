package Lista4;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Arthur
 */
public class N3L4 {

    public static void main(String[] args) {

        /**
         * Leia 1 valor inteiro N, que representa o número de casos de teste que
         * vem a seguir. Cada caso de teste consiste de 3 valores reais, cada um
         * deles com uma casa decimal. Apresente a média ponderada para cada um
         * destes conjuntos de 3 valores, sendo que o primeiro valor tem peso 2,
         * o segundo valor tem peso 3 e o terceiro valor tem peso 5.
         */
        
        Scanner s = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int n;

        System.out.println("Informe o valor de N: ");
        n = s.nextInt();

        for (int i = 0; i < n; i++) {
            double a, b, c;

            System.out.println("Informe o valor de A: ");
            a = s.nextDouble();

            System.out.println("Informe o valor de B: ");
            b = s.nextDouble();

            System.out.println("Informe o valor de C: ");
            c = s.nextDouble();

            double media = (a * 2.0 + b * 3.0 + c * 5.0) / 10.0;

            System.out.printf("%.1f%n", media);
        }

        s.close();
    }

}
