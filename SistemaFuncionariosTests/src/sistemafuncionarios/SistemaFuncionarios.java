/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemafuncionarios;

/**
 *
 * @author Jonas
 */
public class SistemaFuncionarios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       FuncionarioMensalista f1 = new FuncionarioMensalista();
       f1.setNumDependentes(4);
       f1.setValorMes(150);
        System.out.println(f1.calcularSalarioFamilia());
       
       FuncionarioMensalista f2 = new FuncionarioMensalista();
       f2.setNumDependentes(4);
       f2.setValorMes(600);
        System.out.println(f2.calcularSalarioFamilia());
        
        FuncionarioMensalista f3 = new FuncionarioMensalista();
       f3.setNumDependentes(4);
       f3.setValorMes(100);
        System.out.println(f3.calcularSalarioFamilia());
    }
    
}
