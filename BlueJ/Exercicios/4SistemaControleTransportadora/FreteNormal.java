public class FreteNormal extends Frete
{
    public FreteNormal(){}
    
    public FreteNormal(int numero, float valor){
        super(numero, valor);
    }
    
    public float calcularValorFrete(){
        return this.getValor();
    }
    
    public String tipoClasse(){
        return " Frete Normal";
    }
}
