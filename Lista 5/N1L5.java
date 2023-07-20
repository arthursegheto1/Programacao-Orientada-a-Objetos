package Lista5;

import java.util.Scanner;

/**
 *
 * @author Arthur
 */
public class N1L5 {

    public static void main(String[] args) {
        /**
         * Faça um programa que leia um número inteiro positivo N (máximo = 10)
         * e depois N números inteiros e armazene-os em um vetor. Em seguida,
         * mostrar na tela todos os números negativos lidos.
         */

        Scanner s = new Scanner(System.in);

        System.out.println("Quantos números você quer inserir?");
        int n = s.nextInt();
        int vet[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Informe um valor: ");
            vet[i] = s.nextInt();

        }
        System.out.println("Números negativos: ");
        for (int i = 0; i < n; i++) {
            if (vet[i] < 0) {
                System.out.printf("%d\n", vet[i]);

                s.close();
            }

        }

    }
}
