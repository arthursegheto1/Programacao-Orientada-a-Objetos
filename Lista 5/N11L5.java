package Lista5;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Arthur
 */
public class N11L5 {

    public static void main(String[] args) {
        /**
         * Tem-se um conjunto de dados contendo a altura e o gênero (M, F) de N
         * pessoas. Fazer um programa que calcule e escreva a maior e a menor
         * altura do grupo, a média de altura das mulheres, e o número de
         * homens.
         */

        Locale.setDefault(Locale.US);
        Scanner s = new Scanner(System.in);

        int n, quantHomens, quantMulheres;
        double menorAltura, maiorAltura, alturaFemMedia, alturaFemTotal;

        System.out.println("Informe o número de pessoas: ");
        n = s.nextInt();

        double altura[] = new double[n];
        char genero[] = new char[n];

        for (int i = 0; i < n; i++) {
            System.out.printf("Altura da %da pessoa: ", i + 1);
            altura[i] = s.nextDouble();
            System.out.printf("Genero da %da pessoa H(HOMEM)/M(MULHER): ", i + 1);
            genero[i] = s.next().charAt(0);
        }
        menorAltura = altura[0];
        maiorAltura = altura[0];

        for (int i = 0; i < n; i++) {
            if (altura[i] > maiorAltura) {
                maiorAltura = altura[i];
            }
            if (altura[i] < menorAltura) {
                menorAltura = altura[i];
            }
        }
        quantHomens = 0;
        quantMulheres = 0;
        alturaFemTotal = 0;
        for (int i = 0; i < n; i++) {
            if (genero[i] == 'H') {
                quantHomens++;
            } else {
                quantMulheres++;
                alturaFemTotal = alturaFemTotal + altura[i];
            }
        }

        alturaFemMedia = alturaFemTotal / quantMulheres;

        System.out.printf("Menor altura = %.2f\n", menorAltura);
        System.out.printf("Maior altura = %.2f\n", maiorAltura);
        System.out.printf("Média das alturas das mulheres = %.2f\n", alturaFemMedia);
        System.out.printf("Número de homens = %d\n", quantHomens);

        s.close();
    }
}
