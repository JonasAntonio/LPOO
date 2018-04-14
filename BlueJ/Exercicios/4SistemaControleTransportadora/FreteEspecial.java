public class FreteEspecial extends Frete
{
    public FreteEspecial(){}
    
    public FreteEspecial(int numero, float valor, float taxaEntrega){
        super(numero, valor, taxaEntrega);
    }
    
    public float calcularValorFrete(){
        return this.getValor() + this.getTaxaEntrega();
    }
    
    public String tipoClasse(){
        return " Frete Especial";
    }
}
