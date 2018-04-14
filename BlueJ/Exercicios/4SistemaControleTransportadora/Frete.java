public abstract class Frete
{
    private int numero;
    private float valor;
    private float taxaEntrega;
    private int numItens;
    
    public Frete(){}
    
    public Frete(int numero, float valor){
        this.setNumero(numero);
        this.setValor(valor);
    }
    
    public Frete(int numero, float valor, float taxaEntrega){
        this.setNumero(numero);
        this.setValor(valor);
        this.setTaxaEntrega(taxaEntrega);
    }
    
    public Frete(int numero, float valor, float taxaEntrega, int numItens){
        this.setNumero(numero);
        this.setValor(valor);
        this.setTaxaEntrega(taxaEntrega);
        this.setNumItens(numItens);
    }
    
    public int getNumero(){
        return this.numero;
    }
    
    public void setNumero(int numero){
        this.numero = numero;
    }
    
    public float getValor(){
        return this.valor;
    }
    
    public void setValor(float valor){
        this.valor = valor;
    }
    
    public float getTaxaEntrega(){
        return this.taxaEntrega;
    }
    
    public void setTaxaEntrega(float taxaEntrega){
        this.taxaEntrega = taxaEntrega;
    }
    
    public int getNumItens(){
        return this.numItens;
    }
    
    public void setNumItens(int numItens){
        this.numItens = numItens;
    }
    
    public abstract float calcularValorFrete();
    
    public abstract String tipoClasse();
    
    public String dadosFrete(){
        return " Frete: " + this.tipoClasse() + " Preço: " + this.calcularValorFrete();
    }
    
    
}
