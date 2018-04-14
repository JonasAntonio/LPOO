public class FitaEspecial extends Fita
{
    private float valorDia;
    
    public FitaEspecial(){}
    
    public FitaEspecial(String nomeFita, Emprestimo emprestimo, float valorDia){
        super(nomeFita, emprestimo);
        this.setValorDia(valorDia);
    }
    
    public float getValorDia(){
        return this.valorDia;
    } 
    
    public void setValorDia(float valorDia){
        this.valorDia = valorDia;
    }
    
    public float calcularValorFita(){
        return this.getValorDia();
    }
}
