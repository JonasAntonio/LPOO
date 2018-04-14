public class FreteUrgente extends FreteEspecial
{
    private int numItens;
    
    public FreteUrgente(){}
    
    public FreteUrgente(int numero, float valor, float taxaEntrega, int numItens){
        super(numero, valor, taxaEntrega);
        this.setNumItens(numItens);
    }
    
    public int getNumItens(){
        return this.numItens;
    }
    
    public void setNumItens(int numItens){
        this.numItens = numItens;
    }
    
    public float calcularValorFrete(){
        return this.getValor() + this.getTaxaEntrega() + (10 * this.numItens);
    }
    
    public String tipoClasse(){
        return " Frete Urgente";
    }
}
