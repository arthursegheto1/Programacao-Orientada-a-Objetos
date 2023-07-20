package Estudante;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Arthur
 */
public class TesteEstudante {

    public static void main(String[] args) {
       
        /** Fazer um programa  para ler o nome de um aluno e as três notas que ele obteve nos três trimestres
         *  do ano (primeiro trimestre vale 30, e o segundo e o terceiro valem 35 cada). Ao final, mostrar qual
         *  a nota final do aluno no ano. Dizer também se o aluno está aprovado ou não e, em caso negativo, 
         *  quantos pontos faltam para o aluno obter o mínimo para ser aprovado (que é 60% da nota). Você deve 
         *  criar uma classe Estudante para resolver esse problema.
         */
        
        Locale.setDefault(Locale.US);
        Scanner s = new Scanner(System.in);
        
        Estudante estudante = new Estudante();
        
        System.out.println("Informe o nome do estudante: ");
        estudante.nome = s.nextLine();
        System.out.println("Informe a do primeiro trimestre: ");
        estudante.nota1 = s.nextDouble();
        System.out.println("Informe a do segundo trimestre: ");
        estudante.nota2 = s.nextDouble();
        System.out.println("Informe a do terceiro trimestre: ");
        estudante.nota3 = s.nextDouble();
       
        
        System.out.printf("Nota final: %.2f%n", estudante.notaFinal());
        
        if(estudante.notaFinal() < 60.0){
            System.out.println("Reprovado!");
            System.out.printf("Faltando %.2f%n", estudante.notaFaltando());
        }
        else{
            System.out.println("Aprovado!");
        }
        s.close();
    }

}
