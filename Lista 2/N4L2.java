package Lista2;

import java.util.Scanner;

/**
 *
 * @author Arthur
 */
public class N4L2 {
    public static void main(String[] args) {
    
        /** Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode
         *  começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas
         */
        
        Scanner s = new Scanner(System.in);
        
        int horaInicio, horaFim, duracao;
        
        System.out.println("Informe o horário do início do jogo: ");
        horaInicio = s.nextInt();
        
        System.out.println("Informe o horário do término do jogo: ");
        horaFim = s.nextInt();
        
        if(horaInicio < horaFim){
            duracao = horaFim - horaInicio;
        }else{
            duracao = 24 - horaInicio + horaFim;
        }
        System.out.println("O jogo teve uma duração de " + duracao + " horas." );
        s.close();
    }
    
}
