package Lista5;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Arthur
 */
public class N9L5 {

    public static void main(String[] args) {
        /**
         * Fazer um programa para ler um conjunto de nomes de pessoas e suas
         * respectivas idades. Os nomes devem ser armazenados em um vetor, e as
         * idades em um outro vetor. Depois, mostrar na tela o nome da pessoa
         * mais velha.
         */

        Locale.setDefault(Locale.US);
        Scanner s = new Scanner(System.in);

        int n, maiorIdade, posMaior;

        System.out.println("Informe a quantidade de pessoas: ");
        n = s.nextInt();

        String nome[] = new String[n];
        int idade[] = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.printf("Dados da %da pessoa:\n", i + 1);
            s.nextLine();
            System.out.print("Nome: ");
            nome[i] = s.nextLine();
            System.out.print("Idade: ");
            idade[i] = s.nextInt();

        }
        maiorIdade = 0;
        posMaior = 0;
        for (int i = 0; i < n; i++) {
            if (idade[i] > maiorIdade) {
                maiorIdade = idade[i];
                posMaior = i;
            }
        }
        System.out.printf("Pessoa mais velha: %s\n", nome[posMaior]);
        s.close();
    }
}
