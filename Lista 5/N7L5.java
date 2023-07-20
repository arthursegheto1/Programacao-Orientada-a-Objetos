package Lista5;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Arthur
 */
public class N7L5 {

    public static void main(String[] args) {
        /**
         * Fazer um programa para ler um número inteiro N e depois um vetor de N
         * números reais. Em seguida, mostrar na tela a média aritmética de
         * todos elementos com três casas decimais. Depois mostrar todos os
         * elementos do vetor que estejam abaixo da média, com uma casa decimal
         * cada.
         */

        Locale.setDefault(Locale.US);
        Scanner s = new Scanner(System.in);

        int n;
        double soma, media;

        System.out.println("Informe quantos valores terá no vetor: ");
        n = s.nextInt();

        double vet[] = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Digite um número: ");
            vet[i] = s.nextDouble();
        }
        soma = 0;
        for (int i = 0; i < n; i++) {
            soma = soma + vet[i];
        }
        media = soma / n;

        System.out.printf("\nMédia do vetor = %.3f\n", media);
        System.out.println("Elementos abaixo da média:");

        for (int i = 0; i < n; i++) {
            if (vet[i] < media) {
                System.out.printf("%.1f\n", vet[i]);
            }

        }
        s.close();
    }
}
