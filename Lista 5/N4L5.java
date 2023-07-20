package Lista5;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Arthur
 */
public class N4L5 {

    public static void main(String[] args) {
        /**
         * Faça um programa que leia N números inteiros e armazene-os em um
         * vetor. Em seguida, mostre na tela todos os números pares, e também a
         * quantidade de números pares.
         */

        Locale.setDefault(Locale.US);
        Scanner s = new Scanner(System.in);

        int n, quantPares;
        System.out.println("Informe quantos números você quer inserir: ");
        n = s.nextInt();

        int vet[] = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Digite um número: ");
            vet[i] = s.nextInt();
        }
        System.out.println("\nNúmeros pares: ");
        quantPares = 0;
        for (int i = 0; i < n; i++) {
            if (vet[i] % 2 == 0) {
                System.out.printf("%d ", vet[i]);
                quantPares++;
            }
        }
        System.out.printf("\nQuantidade de pares = %d\n", quantPares);
        s.close();
    }

}
