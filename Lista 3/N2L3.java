package Lista3;

import java.util.Scanner;

/**
 *
 * @author Arthur
 */
public class N2L3 {

    public static void main(String[] args) {

        /**
         * Escreva um programa para ler as coordenadas (X,Y) de uma quantidade
         * indeterminada de pontos no sistema cartesiano. Para cada ponto
         * escrever o quadrante a que ele pertence. O algoritmo será encerrado
         * quando pelo menos uma de duas coordenadas for NULA (nesta situação
         * sem escrever mensagem alguma).
         */
        
        Scanner s = new Scanner(System.in);

        int x, y;

        System.out.println("Informe o valor de X: ");
        x = s.nextInt();

        System.out.println("Informe o valor de Y: ");
        y = s.nextInt();

        while (x != 0 && y != 0) {
            if (x > 0 && y > 0) {
                System.out.println("Primeiro quadrante.");
            } else if (x < 0 && y > 0) {
                System.out.println("Segundo quadrante.");
            } else if (x < 0 && y < 0) {
                System.out.println("Terceiro quadrante.");
            } else {
                System.out.println("Quarto quadrante.");
            }
            x = s.nextInt();
            y = s.nextInt();
        }

        s.close();
    }

}
