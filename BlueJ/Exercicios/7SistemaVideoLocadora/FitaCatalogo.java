public class FitaCatalogo extends Fita
{
    public FitaCatalogo(){}
    
    public FitaCatalogo(String nomeFita, Emprestimo emprestimo){
        super(nomeFita, emprestimo);
    }
    
    public float calcularValorFita(){
        return this.getEmprestimo().getNumDiasEmp() * 5;
    }
}
