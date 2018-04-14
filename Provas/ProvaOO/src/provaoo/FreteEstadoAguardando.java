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
public class FreteEstadoAguardando implements EstadoFrete{
   
    public void Aguardar(Frete frete){
        System.out.println("Frete já está aguardando");
    }
    
    public void Enviar(Frete frete){
        new FreteEstadoEnviado();
        System.out.println("Frete Enviado");
    }
    
    public void Entregar(Frete frete){
        System.out.println("Esse frete nao pode ser entregue");
    }
    
}
