public class Semanal extends Vaga
{
    private int numSemanas;
    
    public Semanal(){}
    
    public Semanal(int numSemanas){
        this.setNumSemanas(numSemanas);
    }
    
    public Semanal(int numeroVaga, String placa, int numSemanas){
        super(numeroVaga, placa);
        this.setNumSemanas(numSemanas);
    }
    
    public int getNumSemanas(){
        return this.numSemanas;
    }
    
    public void setNumSemanas(int numSemanas){
        this.numSemanas = numSemanas;
    }
    
    public float calcularValTot(){
        return this.getNumSemanas() * 40;
    }
    
    public String tipoClasse(){
        return "Semanal";
    }
}
