public class Mensal extends Vaga
{
    private int numMeses;
    
    public Mensal(){}
    
    public Mensal(int numMeses){
        this.setNumMeses(numMeses);
    }
    
    public Mensal(int numeroVaga, String placa, int numMeses){
        super(numeroVaga, placa);
        this.setNumMeses(numMeses);
    }
    
    public int getNumMeses(){
        return this.numMeses;
    }
    
    public void setNumMeses(int numMeses){
        this.numMeses = numMeses;
    }
    
    public float calcularValTot(){
        return this.getNumMeses() * 150;
    }
    
    public String tipoClasse(){
        return "Mensal";
    }
}
