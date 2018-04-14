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
public class FreteEstadoEnviado implements EstadoFrete{
    
    public void Aguardar(Frete frete){
        System.out.println("Esse frete não pode ser recolocado em aguardo");
    }
    
    public void Enviar(Frete frete){
        System.out.println("Esse frete já foi enviado");
    }
    
    public void Entregar(Frete frete){
        new FreteEstadoEnviado();
        System.out.println("O frete foi entregue");
    }
}
