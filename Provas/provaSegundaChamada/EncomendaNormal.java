public class EncomendaNormal extends Encomenda
{
    private int diasEntrega;
    
    public EncomendaNormal(){}

    public EncomendaNormal(Cliente cliente){
        super(cliente);
    }
    
    public int getDiasEntrega(){
        return 10;
    }
    
    public String getPrazo(){
        return this.getDiasEntrega() + " Dias";
    }
}
