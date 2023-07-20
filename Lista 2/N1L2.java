package Lista2;

import java.util.Scanner;

/**
 *
 * @author Arthur
 */
public class N1L2 {

    public static void main(String[] args) {

        //Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não.
        
        Scanner s = new Scanner(System.in);

        int num;

        System.out.println("Informe um número: ");
        num = s.nextInt();

        if (num < 0) {
            System.out.println("Número negativo!");
        } else {
            System.out.println("Número positivo!");
        }
        s.close();
    }

}
