public abstract class Quarto
{
    private int numRef;
    private float valorDia;
    
    public Quarto(){}
    
    public Quarto(int numRef){
        this.setNumRef(numRef);
    }
    
    public int getNumRef(){
        return this.numRef;
    }
    
    public void setNumRef(int numRef){
        this.numRef = numRef;
    }
    
    public float getValorDia(){
        return this.valorDia;
    }
    
    public abstract String tipoClasse();
}
