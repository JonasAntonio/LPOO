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
public class Frete{
    private String descricao;
    private String codigo;
    private float valor;
    private Cliente cliente;
    private TipoFrete tipoFrete;
    private EstadoFrete estado;
    
    public Frete(){}
    
    public Frete(String descricao, String codigo, float valor, Cliente cliente, TipoFrete tipoFrete, EstadoFrete estado){
        this.setDescricao(descricao);
        this.setCodigo(codigo);
        this.setValor(valor);
        this.setCliente(cliente);
        this.setTipoFrete(tipoFrete);
        this.setEstado(estado);
    }

    /**
     * @return the descricao
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * @param descricao the descricao to set
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    /**
     * @return the codigo
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    /**
     * @return the valor
     */
    public float getValor() {
        return valor;
    }

    /**
     * @param valor the valor to set
     */
    public void setValor(float valor) {
        this.valor = valor;
    }

    /**
     * @return the cliente
     */
    public Cliente getCliente() {
        return cliente;
    }

    /**
     * @param cliente the cliente to set
     */
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    /**
     * @return the tipoFrete
     */
    public TipoFrete getTipoFrete() {
        return tipoFrete;
    }

    /**
     * @param tipoFrete the tipoFrete to set
     */
    public void setTipoFrete(TipoFrete tipoFrete) {
        this.tipoFrete = tipoFrete;
    }
  
    /**
     * @return the estado
     */
    public EstadoFrete getEstado() {
        return estado;
    }

    /**
     * @param estado the esdado to set
     */
    public void setEstado(EstadoFrete estado) {
        this.estado = estado;
    }
    
    public float calcularValorFrete(){
        float valDescontado = (this.getValor()) - ((this.getValor()/100) * this.getTipoFrete().getPercentualDesconto());
        if(this.getTipoFrete().getPercentualDesconto() != 0){
            return valDescontado; 
        } else {
            return this.getValor();
        }
    }

    public void Aguardar(Frete frete){
        this.estado.Aguardar(this);
    }
    
    public void Enviar(Frete frete){
        this.estado.Enviar(this);
    }
    
    public void Entregar(Frete frete){
        this.estado.Entregar(this);
    }
    

}
