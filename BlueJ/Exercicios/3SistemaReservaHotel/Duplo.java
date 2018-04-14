public class Duplo extends Quarto
{
    public Duplo(){}
    
    public Duplo(int numRef){
        super(numRef);
    }
    
    public float getValorRef(){
        return 10;
    }
    
    public float getValorDia(){
        return 80;
    }
    
    public String tipoClasse(){
        return "Duplo";
    }
}
