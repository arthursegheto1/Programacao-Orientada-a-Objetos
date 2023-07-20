package Lista1;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Arthur
 */
public class N2L1 {

    public static void main(String[] args) {

        /**
         * Faça um programa para ler o valor do raio de um círculo, e depois
         * mostrar o valor da área deste círculo com quatro casas decimais
         * conforme exemplos. Fórmula da área: area = π . raio2 Considere o
         * valor de π = 3.14159
         */
        
        Scanner s = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        double Raio, Area, pi = 3.14159;

        System.out.println("Informe o valor do raio do círculo: ");
        Raio = s.nextDouble();

        Area = pi * Raio * Raio;
        System.out.printf("Área = %.4f%n", Area);
        
        s.close();
    }
}
