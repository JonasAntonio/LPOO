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
public class TipoFrete {
    private String descricao;
    private String codigo;
    private int percentualDesconto;
    
    public TipoFrete(){}
    
    public TipoFrete(String descricao, String codigo, int precentualDesconto){
        this.setDescricao(descricao);
        this.setCodigo(codigo);
        this.setPercentualDesconto(percentualDesconto);
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
     * @return the percentualDesconto
     */
    public int getPercentualDesconto() {
        return percentualDesconto;
    }

    /**
     * @param percentualDesconto the percentualDesconto to set
     */
    public void setPercentualDesconto(int percentualDesconto) {
        this.percentualDesconto = percentualDesconto;
    }
}
