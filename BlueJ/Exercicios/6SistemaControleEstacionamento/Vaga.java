public abstract class Vaga
{
    private int numeroVaga;
    private String placa;
    
    public Vaga(){}
    
    public Vaga(int numeroVaga, String placa){
        this.setNumeroVaga(numeroVaga);
        this.setPlaca(placa);
    }
    
    public int getNumeroVaga(){
        return this.numeroVaga;
    }
    
    public void setNumeroVaga(int numeroVaga){
        this.numeroVaga = numeroVaga;
    }
    
    public String getPlaca(){
        return this.placa;
    }
    
    public void setPlaca(String placa){
        this.placa = placa;
    }
    
    public abstract float calcularValTot();
    
    public abstract String tipoClasse();
    
    public String dadosVaga(){
        return " Vaga: " + this.getNumeroVaga() + " Placa: " + this.getPlaca() + " Tipo da Vaga: " + this.tipoClasse(); 
    }
    
}
