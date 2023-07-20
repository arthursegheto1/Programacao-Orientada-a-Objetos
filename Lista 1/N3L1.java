package Lista1;

import java.util.Scanner;

/**
 *
 * @author Arthur
 */
public class N3L1 {

    public static void main(String[] args) {

        /**
         * Fazer um programa para ler quatro valores inteiros A, B, C e D. A
         * seguir, calcule e mostre a diferença do produto de A e B pelo produto
         * de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).
         */
        
        Scanner s = new Scanner(System.in);

        int A, B, C, D, dif;

        System.out.println("Informe o valor de A: ");
        A = s.nextInt();

        System.out.println("Informe o valor de B: ");
        B = s.nextInt();

        System.out.println("Informe o valor de C: ");
        C = s.nextInt();

        System.out.println("Informe o valor de D: ");
        D = s.nextInt();

        dif = (A * B - C * D);

        System.out.println("A diferença é: " + dif);

        s.close();

    }
}
