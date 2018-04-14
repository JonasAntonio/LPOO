/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package provaoo;

/**
 *
 * @author alunoces
 */
public class ProvaOO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Calcular Valor do Frete com Desconto");
        TipoFrete tf1 = new TipoFrete();
        tf1.setDescricao("Tipo do frete 1");
        tf1.setPercentualDesconto(20);
        Frete f1 = new Frete();
        f1.setTipoFrete(tf1);
        f1.setDescricao("Frete 1");
        f1.setValor(100);
        System.out.println("Valor Frete 1: " + f1.calcularValorFrete());
        System.out.println("\n");
        //
        System.out.println("Calcular Valor do Frete sem Desconto");
        TipoFrete tf2 = new TipoFrete();
        tf2.setDescricao("Tipo do frete 2");
        tf2.setPercentualDesconto(0);
        Frete f2 = new Frete();
        f2.setTipoFrete(tf2);
        f2.setDescricao("Frete 2");
        f2.setValor(100);
        System.out.println("Valor Frete 2: " + f2.calcularValorFrete());
        System.out.println("\n");
        //
        System.out.println("Troca de Estados de Frete");
        FreteEstadoAguardando fEa1 = new FreteEstadoAguardando();
        FreteEstadoEnviado feEnviado1 = new FreteEstadoEnviado();
        FreteEstadoEntregue feEntregue1 = new FreteEstadoEntregue();
        Frete f3 = new Frete();
        f3.setEstado(fEa1);
        System.out.println(f3.getEstado());
        System.out.println("Aguardar");
        f3.Aguardar(f3);
        System.out.println("Enviar");
        f3.Enviar(f3);
        System.out.println("Entregar");
        System.out.println(f3.getEstado());
        f3.Entregar(f3);
        
        
        
    }
    
}
