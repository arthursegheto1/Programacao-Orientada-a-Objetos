package Lista2;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Arthur
 */
public class N6L2 {

    public static void main(String[] args) {

        /**
         * Você deve fazer um programa que leia um valor qualquer e apresente
         * uma mensagem dizendo em qual dos seguintes intervalos ([0,25],
         * (25,50], (50,75], (75,100]) este valor se encontra. Obviamente se o
         * valor não estiver em nenhum destes intervalos, deverá ser impressa a
         * mensagem “Fora de intervalo”.
         */
    
        Scanner s = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        
        double numero;
 
        System.out.println("Informe um número: ");
        numero = s.nextDouble();
        
        if(numero < 0 || numero > 100){
            System.out.println("Fora do intervalo!");
        }else if(numero <= 25){
            System.out.println("Dentro do intervalo [0, 25]");
        }else if(numero <= 50){
            System.out.println("Dentro do intervalo [25, 50]");
        }else if(numero <= 75){
            System.out.println("Dentro do intervalo [50, 75");
        }else if(numero <= 100){
            System.out.println("Dentro do intervalo [75, 100]");
        }
        
        s.close();
    }

}
