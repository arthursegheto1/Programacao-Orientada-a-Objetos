package Lista2;

import java.util.Scanner;

/**
 *
 * @author Arthur
 */
public class N7L2 {

    public static void main(String[] args) {
        /**
         * Leia 2 valores com uma casa decimal (x e y), que devem representar as
         * coordenadas de um ponto em um plano. A seguir, determine qual o
         * quadrante ao qual pertence o ponto, ou se está sobre um dos eixos
         * cartesianos ou na origem (x = y = 0). Se o ponto estiver na origem,
         * escreva a mensagem “Origem”. Se o ponto estiver sobre um dos eixos
         * escreva “Eixo X” ou “Eixo Y”, conforme for a situação.
         */
        
        Scanner s = new Scanner(System.in); 
        
        double x, y;
        
        System.out.println("Informe o valor de X: ");
        x = s.nextDouble();
        
        System.out.println("Informe o valor de Y: ");
        y = s.nextDouble();
        
        System.out.println("");
        if(x == 0 && y == 0){
            System.out.println("Origem.");
        }else if(x == 0){
            System.out.println("Eixo Y.");
        }else if(y == 0){
            System.out.println("Eixo X.");
        }else if(x > 0 && y > 0){
            System.out.println("Quadrante 1.");
        }else if(x < 0 && y > 0){
            System.out.println("Quadrante 2.");
        }else if(x <0 && y < 0){ 
            System.out.println("Quadrante 3.");
        }else if(x > 0 && y < 0){
            System.out.println("Quadrante 4.");
        }
        
        s.close();
        
    }

}
