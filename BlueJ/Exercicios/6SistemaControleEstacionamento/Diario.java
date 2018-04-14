public class Diario extends Vaga
{
    private int numDias;
    
    public Diario(){}
    
    public Diario(int numDias){
        this.setNumDias(numDias);
    }
    
    public Diario(int numeroVaga, String placa, int numDias){
        super(numeroVaga, placa);
        this.setNumDias(numDias);
    }
    
    public int getNumDias(){
        return this.numDias;
    }
    
    public void setNumDias(int numDias){
        this.numDias = numDias;
    }
    
    public float calcularValTot(){
        return this.getNumDias() * 10;
    }
    
    public String tipoClasse(){
        return "Diaria";
    }
}
