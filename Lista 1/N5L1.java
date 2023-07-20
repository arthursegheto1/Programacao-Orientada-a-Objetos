package Lista1;


import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author arthu
 */
public class N5L1 {

    public static void main(String[] args) {

        /* Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o
         * código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.
         */
        
        Scanner s = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        
        int cod1, num1, cod2, num2;
        double valor1, valor2, valorTotal;
        
        System.out.println("Insira o código da peça 1: ");
        cod1 = s.nextInt();
        
        System.out.println("Insira o número de peças 1: ");
        num1 = s.nextInt();
        
        System.out.println("Insira o valor da peça 1: ");
        valor1 = s.nextDouble();
        
        System.out.println("Insira o código da peça 2: ");
        cod2 = s.nextInt();
        
        System.out.println("Insira o número de peças 2: ");
        num2 = s.nextInt();
        
        System.out.println("Insira o valor da peça 2: ");
        valor2 = s.nextDouble();
        
        valorTotal = valor1 * num1 + valor2 * num2;
        
        System.out.printf("Valor a pagar: R$ %.2f%n", valorTotal);
        
        s.close();
        
    }

}
