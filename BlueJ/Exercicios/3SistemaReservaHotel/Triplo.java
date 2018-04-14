public class Triplo extends Quarto
{   
    public Triplo(){}
    
    public Triplo(int numRef){
        super(numRef);
    }
    
    public float getValorRef(){
        return 10;
    }
    
    public float getValorDia(){
        return 100;
    }
    
    public String tipoClasse(){
        return "Triplo";
    }
}
