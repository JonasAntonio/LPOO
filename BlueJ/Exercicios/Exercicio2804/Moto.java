public class Moto extends Veiculo
{
    private int cilindradas;
    
    public int getCilindradas(){
        return this.cilindradas;
    }
    
    public void setCilindradas(int cilindradas){
        this.cilindradas = cilindradas;
    }
    
    public String tipoVeiculo(){
        return "Moto";
    }
}
