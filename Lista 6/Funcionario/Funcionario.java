package Funcionario;

/**
 *
 * @author Arthur
 */
public class Funcionario {
    public String nome;
    public double salarioBruto;
    public double imposto;
    
    public double salarioLiquido(){
        return salarioBruto - imposto;
    }
    public void aumentoSalario(double porcentagem){
       salarioBruto += salarioBruto *  porcentagem / 100.0;
    }
    public String toString(){
        return nome + ", R$ " + String.format("%.2f", salarioLiquido());
    }
}
