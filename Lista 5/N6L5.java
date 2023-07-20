package Lista5;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Arthur
 */
public class N6L5 {

    public static void main(String[] args) {
        /**
         * Faça um programa para ler dois vetores A e B, contendo N elementos
         * cada. Em seguida, gere um terceiro vetor C onde cada elemento de C é
         * a soma dos elementos correspondentes de A e B. Imprima o vetor C
         * gerado.
         */

        Locale.setDefault(Locale.US);
        Scanner s = new Scanner(System.in);

        int n;

        System.out.println("Quantos valores terá em cada vetor?");
        n = s.nextInt();

        int vetA[] = new int[n];
        int vetB[] = new int[n];
        int vetC[] = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Digite um número para o vetor A: ");
            vetA[i] = s.nextInt();
        }

        for (int i = 0; i < n; i++) {
            System.out.println("Digite um número para o vetor B: ");
            vetB[i] = s.nextInt();

        }
        for (int i = 0; i < n; i++) {
            vetC[i] = vetA[i] + vetB[i];
        }
        System.out.println("Vetor C gerado: ");
        for (int i = 0; i < n; i++) {
            System.out.printf("%d\n", vetC[i]);
        }
        s.close();
    }
}
