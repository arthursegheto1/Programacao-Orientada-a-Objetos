package Retangulo;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Arthur
 */
public class TesteRetangulo {

    public static void main(String[] args) {
       
        /** Fazer um programa para ler os valores da largura
         *  e altura de um retângulo. Em seguida, mostrar na tela
         *  o valor de sua área, perímetro e diagonal. Usar uma 
         *  classe Retangulo.
         */ 
        
        Locale.setDefault(Locale.US);
        Scanner s = new Scanner(System.in);

        Retangulo retangulo = new Retangulo();

        System.out.println("Informe a altura do retângulo: ");
        retangulo.altura = s.nextDouble();
        System.out.println("Informe a largura do retângulo: ");
        retangulo.largura = s.nextDouble();

        System.out.printf("A área do retângulo é: %.2f%n", retangulo.area());
        System.out.printf("O perímetro do retângulo é: %.2f%n", retangulo.perimetro());
        System.out.printf("A diagonal do retângulo é: %.2f%n", retangulo.diagonal());

        s.close();
    }

}
