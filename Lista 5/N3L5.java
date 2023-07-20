package Lista5;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Arthur
 */
public class N3L5 {

    public static void main(String[] args) {
        /**
         * Fazer um programa para ler nome, idade e altura de N pessoas,
         * conforme exemplo. Depois, mostrar na tela a altura média das pessoas,
         * e mostrar também a porcentagem de pessoas com menos de 16 anos, bem
         * como os nomes dessas pessoas caso houver.
         */

        Locale.setDefault(Locale.US);
        Scanner s = new Scanner(System.in);

        int n, nMenores;
        double alturaTotal, alturaMedia, percentualMenor;

        System.out.println("Informe a quantidade de pessoas: ");
        n = s.nextInt();

        String[] nome = new String[n];
        int[] idade = new int[n];
        double[] altura = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.printf("Dados da %da pessoa:\n", i + 1);
            s.nextLine();
            System.out.print("Nome: ");
            nome[i] = s.nextLine();
            System.out.print("Idade: ");
            idade[i] = s.nextInt();
            System.out.println("Altura: ");
            altura[i] = s.nextDouble();

        }
        nMenores = 0;
        alturaTotal = 0;

        for (int i = 0; i < n; i++) {
            if (idade[i] < 16) {
                nMenores++;
            }
            alturaTotal = alturaTotal + altura[i];
        }
        alturaMedia = alturaTotal / n;
        percentualMenor = ((double) nMenores / n) * 100;
        System.out.printf("\nAltura média = %.2f\n", alturaMedia);
        System.out.printf("Pessoas com menos de 16 anos: %.1f%%\n", percentualMenor);
        for (int i = 0; i < n; i++) {
            if (idade[i] < 16) {
                System.out.printf("%s\n", nome[i]);
            }
        }
        s.close();
    }
}
