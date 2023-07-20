package Lista3;

import java.util.Scanner;

/**
 *
 * @author Arthur
 */
public class N1L3 {

    public static void main(String[] args) {

        /**
         * Escreva um programa que repita a leitura de uma senha até que ela
         * seja válida. Para cada leitura de senha incorreta informada, escrever
         * a mensagem "Senha Invalida". Quando a senha for informada
         * corretamente deve ser impressa a mensagem "Acesso Permitido" e o
         * algoritmo encerrado. Considere que a senha correta é o valor 2002.
         */
        
        Scanner s = new Scanner(System.in);

        int senha;

        System.out.println("Digite a senha:");
        senha = s.nextInt();

        while (senha != 2002) {
            System.out.println("Senha inválida! Tente novamente.");
            senha = s.nextInt();

        }

        System.out.println("Acesso permitido.");

        s.close();

    }

}
