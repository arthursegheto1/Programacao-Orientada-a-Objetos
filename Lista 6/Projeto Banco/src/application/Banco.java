package application;

import entities.Conta;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Arthur
 */
public class Banco {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner s = new Scanner(System.in);
        Conta conta;

        System.out.println("Informe o número da conta: ");
        int numero = s.nextInt();
        System.out.println("Informe o nome do titular da conta: ");
        s.nextLine();
        String nome = s.nextLine();
        System.out.println("Tem um depósito inicial? Digite S, para sim e N para não. ");
        char resposta = s.next().charAt(0);

        if (resposta == 'S') {
            System.out.println("Informe o valor do depósito.");
            double depositoInicial = s.nextDouble();
            conta = new Conta(numero, nome, depositoInicial);
        } else {
            conta = new Conta(numero, nome);
        }

        System.out.println();
        System.out.println("Dados da conta: ");
        System.out.println(conta);

        System.out.println();
        System.out.println("Informe um valor para o depósito: ");
        double valorDeposito = s.nextDouble();
        conta.deposito(valorDeposito);
        System.out.println("Valor atualizado na conta: ");
        System.out.println(conta);

        System.out.println();
        System.out.println("Informe o valor que deseja sacar: ");
        double valorSaque = s.nextDouble();
        conta.saque(valorSaque);
        System.out.println("Valor atualizado na conta: ");
        System.out.println(conta);

        s.close();
    }

}
