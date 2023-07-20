package Lista1;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Arthur
 */
public class N4L1 {

    public static void main(String[] args) {

        /* Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por
         * hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas
         * decimais.
         */
        
        Scanner s = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int num, horasT;
        float valorH, salario;

        System.out.println("Informe o número de identificação do funcionário: ");
        num = s.nextInt();

        System.out.println("Informe o número de horas trabalhadas: ");
        horasT = s.nextInt();

        System.out.println("Informe o valor recebido por hora trabalhada: ");
        valorH = s.nextFloat();

        salario = valorH * horasT;

        System.out.println("Funcionário de número de indentificação: " + num);
        System.out.printf("SALARIO = R$ %.2f%n", salario);

        s.close();

    }

}
