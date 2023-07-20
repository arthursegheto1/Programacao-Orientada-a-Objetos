package Lista1;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Arthur
 */
public class N6L1 {

    public static void main(String[] args) {

        /* Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e
        * mostre:
        *  a) a área do triângulo retângulo que tem A por base e C por altura.
        *  b) a área do círculo de raio C. (pi = 3.14159)
        *  c) a área do trapézio que tem A e B por bases e C por altura.
        *  d) a área do quadrado que tem lado B.
        *  e) a área do retângulo que tem lados A e B. 
         */
       
        Scanner s = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        double A, B, C, triangulo, circulo, trapezio, quadrado, retangulo;

        System.out.println("Informe o valor de A: ");
        A = s.nextDouble();

        System.out.println("Informe o valor de B: ");
        B = s.nextDouble();

        System.out.println("Informe o valor de C: ");
        C = s.nextDouble();

        triangulo = A * C / 2;
        circulo = 3.14159 * C * C;
        trapezio = (A + B) / 2 * C;
        quadrado = B * B;
        retangulo = A * B;

        System.out.printf("Triângulo: %.3f%n", triangulo);
        System.out.printf("Círculo: %.3f%n", circulo);
        System.out.printf("Trapézio: %.3f%n", trapezio);
        System.out.printf("Quadrado: %.3f%n", quadrado);
        System.out.printf("Retângulo: %.3f%n", retangulo);

        s.close();
    }

}
