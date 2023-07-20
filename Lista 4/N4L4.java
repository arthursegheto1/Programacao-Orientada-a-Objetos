package Lista4;

import java.util.Scanner;

/**
 *
 * @author Arthur
 */
public class N4L4 {

    public static void main(String[] args) {

        /**
         * Fazer um programa para ler um número N. Depois leia N pares de
         * números e mostre a divisão do primeiro pelo segundo. Se o denominador
         * for igual a zero, mostrar a mensagem "divisao impossivel".
         */
        
        Scanner s = new Scanner(System.in);

        int n;

        System.out.println("Informe o valor de N: ");
        n = s.nextInt();

        for (int i = 0; i < n; i++) {
            int x, y;

            System.out.println("Informe o valor de X: ");
            x = s.nextInt();

            System.out.println("Informe o valor de Y: ");
            y = s.nextInt();

            if (y == 0) {
                System.out.println("Divisão impossível!");
            } else {
                double divisao = (double) x / y;
                System.out.printf("%.1f%n", divisao);

            }

        }
        s.close();
    }

}
    