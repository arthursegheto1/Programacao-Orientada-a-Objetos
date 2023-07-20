package Lista5;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Arthur
 */
public class N10L5 {

    public static void main(String[] args) {
        /**
         * Fazer um programa para ler um conjunto de N nomes de alunos, bem como
         * as notas que eles tiraram no 1º e 2º semestres. Cada uma dessas
         * informações deve ser armazenada em um vetor. Depois, imprimir os
         * nomes dos alunos aprovados, considerando aprovados aqueles cuja média
         * das notas seja maior ou igual a 6.0 (seis).
         */

        Locale.setDefault(Locale.US);
        Scanner s = new Scanner(System.in);

        int n;
        double media;

        System.out.println("Informe quantos alunos serão consultados: ");
        n = s.nextInt();

        String nome[] = new String[n];
        double nota1[] = new double[n];
        double nota2[] = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.printf("Dados do %do aluno:\n", i + 1);
            s.nextLine();
            System.out.print("Nome: ");
            nome[i] = s.nextLine();
            System.out.println("Nota do 1º semestre: ");
            nota1[i] = s.nextDouble();
            System.out.println("Nota do 2º semestre: ");
            nota2[i] = s.nextDouble();
        }
        System.out.println("Alunos aprovados:");
        for (int i = 0; i < n; i++) {
            media = (nota1[i] + nota2[i]) / 2;
            if (media >= 6.0) {
                System.out.printf("%s\n", nome[i]);
            }
        }
        s.close();

    }
}
