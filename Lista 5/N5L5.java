package Lista5;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Arthur
 */
public class N5L5 {

    public static void main(String[] args) {
        /**
         * Faça um programa que leia N números reais e armazene-os em um vetor.
         * Em seguida, mostrar na tela o maior número do vetor (supor não haver
         * empates). Mostrar também a posição do maior elemento, considerando a
         * primeira posição como 0 (zero).
         */

        Locale.setDefault(Locale.US);
        Scanner s = new Scanner(System.in);

        int n, maiorNum;
        double maior;

        System.out.println("Informe quantos números você quer inserir: ");
        n = s.nextInt();

        double[] vet = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Digite um número: ");
            vet[i] = s.nextDouble();

        }
        maior = vet[0];
        maiorNum = 0;
        for (int i = 0; i < n; i++) {
            if (vet[i] > maior) {
                maior = vet[i];
                maiorNum = i;

            }
        }
        System.out.printf("Maior valor = %.1f\n", maior);
        System.out.printf("Posição do maior valor = %d\n", maiorNum);
        s.close();
    }

}
