public class EncomendaRapida extends Encomenda
{
    private int diasEntrega;
    
    public EncomendaRapida(){}
    
    public EncomendaRapida(Cliente cliente){
        super(cliente);
    }
    
    public int getDiasEntrega(){
        return 2;
    }
    
    public String getPrazo(){
        return this.getDiasEntrega() + " Dias";
    }
}
