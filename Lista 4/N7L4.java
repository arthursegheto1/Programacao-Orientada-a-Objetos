package Lista4;

import java.util.Scanner;

/**
 *
 * @author Arthur
 */
public class N7L4 {

    public static void main(String[] args) {

        /**
         * Fazer um programa para ler um número inteiro positivo N. O programa
         * deve então mostrar na tela N linhas, começando de 1 até N. Para cada
         * linha, mostrar o número da linha, depois o quadrado e o cubo do
         * valor.
         */
       
        Scanner s = new Scanner(System.in);

        int n;

        System.out.println("Informe um número: ");
        n = s.nextInt();

        for (int i = 1; i <= n; i++) {
            int primeiro = i;
            int segundo = i * i;
            int terceiro = i * i * i;

            System.out.printf("%d %d %d%n", primeiro, segundo, terceiro);
        }

        s.close();

    }

}
