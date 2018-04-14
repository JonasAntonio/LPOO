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
public interface EstadoFrete {
    public void Aguardar(Frete frete);
    public void Enviar(Frete frete);
    public void Entregar(Frete frete);
}
