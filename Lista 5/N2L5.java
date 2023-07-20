package Lista5;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Arthur
 */
public class N2L5 {

    public static void main(String[] args) {

        /**
         * Faça um programa que leia N números reais e armazene-os em um vetor.
         * Em seguida: - Imprimir todos os elementos do vetor - Mostrar na tela
         * a soma e a média dos elementos do vetor
         */
        Locale.setDefault(Locale.US);
        Scanner s = new Scanner(System.in);
        int n;
        double soma, media;
        System.out.println("Quantos números você vai digitar?");
        n = s.nextInt();
        double vet[] = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Informe um número: ");
            vet[i] = s.nextDouble();

        }
        soma = 0;
        for (int i = 0; i < n; i++) {
            soma = soma + vet[i];

        }
        media = soma / n;
        System.out.println("Valores: ");
        for (int i = 0; i < n; i++) {
            System.out.printf("%.1f  ", vet[i]);
        }
        System.out.printf("\nSoma = %.2f\n", soma);
        System.out.printf("Média = %.2f\n", media);

        s.close();
    }
}
