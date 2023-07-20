package Lista1;

import java.util.Scanner;

/**
 *
 * @author Arthur
 */
public class N1L1 {

    public static void main(String[] args) {

        /**
         * Faça um programa para ler dois valores inteiros, e depois mostrar na
         * tela a soma desses números com uma mensagem explicativa, conforme
         * exemplos.
         */
        
        Scanner s = new Scanner(System.in);

        int num1, num2, soma;

        System.out.println("Informe um número: ");
        num1 = s.nextInt();

        System.out.println("Informe outro número: ");
        num2 = s.nextInt();

        soma = num1 + num2;

        System.out.println("O resultado da soma é: " + soma);
        
        s.close();
    }

}
