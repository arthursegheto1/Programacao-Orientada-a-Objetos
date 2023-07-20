package Funcionario;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Arthur
 */
public class TesteFuncionario {

    public static void main(String[] args) {
        
        /** Fazer um programa para ler os dados de um funcionário (nome, salário bruto
         *  e imposto). Em seguida, mostrar os dados do funcionário (nome e salário
         *  líquido). Em seguida, aumentar o salário do funcionário com base em uma 
         *  porcentagem dada (somente o salário bruto é afetado pela porcentagem) e 
         *  mostrar novamente os dados do funcionário. Use a classe Funcionario.
         */
        
        Locale.setDefault(Locale.US);
        Scanner s = new Scanner(System.in);

        Funcionario funcionario = new Funcionario();

        System.out.println("Informe o nome do funcionário: ");
        funcionario.nome = s.nextLine();
        System.out.println("Informe o salário bruto do funcionário: ");
        funcionario.salarioBruto = s.nextDouble();
        System.out.println("Informe o imposto sobre o salário do funcionário: ");
        funcionario.imposto = s.nextDouble();

        System.out.println();
        System.out.println("Funcionário: " + funcionario);
        System.out.println();
        System.out.println("Qual a porcentagem do aumento salarial? ");
        double porcentagem = s.nextDouble();
        funcionario.aumentoSalario(porcentagem);

        System.out.println();
        System.out.println("Dados atualizados: " + funcionario);

        s.close();

    }

}
