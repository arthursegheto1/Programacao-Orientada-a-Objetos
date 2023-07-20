package Lista5;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Arthur
 */
public class N8L5 {

    public static void main(String[] args) {
        /**
         * Fazer um programa para ler um vetor de N números inteiros. Em
         * seguida, mostrar na tela a média aritmética somente dos números pares
         * lidos, com uma casa decimal. Se nenhum número par for digitado,
         * mostrar a mensagem "NENHUM NUMERO PAR"
         */

        Locale.setDefault(Locale.US);
        Scanner s = new Scanner(System.in);

        int n, somaPar = 0, numPar = 0;
        double mediaPar;

        System.out.println("Quantos elementos vai ter o vetor?");
        n = s.nextInt();

        int vet[] = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Digite um número: ");
            vet[i] = s.nextInt();
        }
        for (int i = 0; i < n; i++) {
            if (vet[i] % 2 == 0) {
                somaPar = somaPar + vet[i];
                numPar++;
            }
        }
        if (numPar == 0) {
            System.out.println("Nenhum número par");
        } else {
            mediaPar = (double) somaPar / numPar;
            System.out.printf("MEDIA DOS PARES = %.1f\n", mediaPar);
        }
        s.close();
    }

}
