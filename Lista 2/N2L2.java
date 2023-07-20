package Lista2;

import java.util.Scanner;

/**
 *
 * @author Arthur
 */
public class N2L2 {

    public static void main(String[] args) {

        //Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar.
        
        Scanner s = new Scanner(System.in);

        int num;

        System.out.println("Informe um número: ");
        num = s.nextInt();

        if (num % 2 == 0) {
            System.out.println("Número par!");
        } else {
            System.out.println("Número impar!");
        }

        s.close();
    }

}
