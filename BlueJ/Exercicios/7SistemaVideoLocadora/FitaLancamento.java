public class FitaLancamento extends FitaEspecial
{ 
    public FitaLancamento(){}
    
    public FitaLancamento(String nomeFita, Emprestimo emprestimo, float valorDia){
        super(nomeFita, emprestimo, valorDia);
    }
    
    public float calcularValorFita(){
        return this.getValorDia();
    }
}
