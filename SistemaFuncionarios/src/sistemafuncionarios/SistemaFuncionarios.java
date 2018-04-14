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
        FuncionarioMensalista funcMensalista = new FuncionarioMensalista();
        FuncionarioDiarista funcDia = new FuncionarioDiarista();
        FuncionarioHorista funcHora = new FuncionarioHorista();
        Cargo c1 = new Cargo();
        Cargo c2 = new Cargo();
        Cargo c3 = new Cargo();
        //
        c1.setDescricao("Cargo 1");
        funcMensalista.setCargo(c1);
        funcMensalista.setNome("Jaum");
        funcMensalista.setMatricula(123456);
        
        c2.setDescricao("Cargo 2");
        funcDia.setCargo(c2);
        funcDia.setNome("Ze");
        funcDia.setMatricula(654321);
        
        c3.setDescricao("Cargo 3");
        funcHora.setCargo(c3);
        funcHora.setNome("Maluco");
        funcHora.setMatricula(123456789);
        
        //
        System.out.println("Calculo de salario");
        funcMensalista.setValorMes(2500);
        System.out.println("Salario Mensalista: " + funcMensalista.calcularSalario());
        
        funcDia.setNumDias(5);
        funcDia.setValorDia(150);
        System.out.println("Salario Diarista: " + funcDia.calcularSalario());
        
        funcHora.setNumDias(5);
        funcHora.setNumHorasDia(6);
        funcHora.setValorHora(100);
        System.out.println("Salario Horista: " + funcHora.calcularSalario());
        
        System.out.println("\n");
        System.out.println("Chefe de Departamento");
        Departamento dp = new Departamento();
        dp.setChefe(funcHora);
        System.out.println("Chefe do Departamento: " + dp.getChefe());
        //
        System.out.println("\n");
        System.out.println("Funcionarios do Departamento");
        dp.addFuncionario(funcHora);
        dp.addFuncionario(funcDia);
        dp.addFuncionario(funcMensalista);
        dp.listarFuncionarios();
        //
        System.out.println("\n");
        System.out.println("Funcionarios no Pojeto");
        Projeto p1 = new Projeto();
        p1.setDescricao("Projeto 1");
        p1.alocarFuncionario(funcHora);
        p1.alocarFuncionario(funcDia);
        p1.listarFuncionarios();
        //
        System.out.println("\n");
        System.out.println("Calcular Vale Transporte");
        funcMensalista.setQtdeValesDia(2);
        funcDia.setQtdeValesDia(4);
        funcHora.setQtdeValesDia(2);
        System.out.println("Vale Transporte Funcionario Mensalista: " + funcMensalista.calcularValeTransporte());
        System.out.println("Vale Transporte Funcionario Horista: " + funcHora.calcularValeTransporte());
        System.out.println("Vale Transporte Funcionario Diarista: " + funcDia.calcularValeTransporte());
        //
        System.out.println("\n");
        System.out.println("Calcular Salario Familia");
        funcMensalista.setNumDependentes(4);
        funcDia.setNumDependentes(3);
        funcHora.setNumDependentes(5);
        System.out.println("Salario Familia Funcionario Mensalista: " + funcMensalista.calcularSalarioFamilia());
        System.out.println("Salario Familia Funcionario Diarista: " + funcDia.calcularSalarioFamilia());
        System.out.println("Salario Familia Funcionario Horista: " + funcHora.calcularSalarioFamilia());
        //
        System.out.println("\n");
        System.out.println("Calculo de Bonus Salarial");
        System.out.println("Bonus Funcionario Mensalista: " + funcMensalista.calcularBonus());
        System.out.println("Bonus Funcionario Diarista: " + funcDia.calcularBonus());
        System.out.println("Bonus Funcionario Horista: " + funcHora.calcularBonus());
        //
        System.out.println("\n");
        System.out.println("Reajuste Funcionario Mensalista");
        System.out.println("Novo Salario Funcionario Mensalista: " + funcMensalista.calcularReajuste(10));
        System.out.println("Novo Salario Funcionario Mensalista + Bonus: " + funcMensalista.calcularReajuste(10,200));
        //
        System.out.println("\n");
        System.out.println("Hieraquia de Departamentos");
        Departamento dp1 = new Departamento();
        Departamento dp2 = new Departamento();
        Departamento dp3 = new Departamento();
        dp1.setDescricao("Departamento 1");
        dp2.setDescricao("Departamento 2");
        dp3.setDescricao("Departamento 3");
        dp1.setSuperDepartamento(dp2);
        dp2.setSuperDepartamento(dp3);
        dp1.getHierarquiaDepartamentos();
        //
        System.out.println("\n");
        System.out.println("Funcionario Pertence ao Departamento");
        
        
        
    }
    
}
