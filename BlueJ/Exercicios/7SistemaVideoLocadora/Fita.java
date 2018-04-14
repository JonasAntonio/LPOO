public abstract class Fita
{
    private String nomeFita;
    private Emprestimo emprestimo;
 
    public Fita(){}
    
    public Fita(String nomeFita, Emprestimo emprestimo){
        this.setNomeFita(nomeFita);
        this.setEmprestimo(emprestimo);
    }
    
    public String getNomeFita(){
        return this.nomeFita;
    }
    
    public void setNomeFita(String nomeFita){
        this.nomeFita = nomeFita;
    }
    
    public Emprestimo getEmprestimo(){
        return this.emprestimo;
    }
    
    public void setEmprestimo(Emprestimo emprestimo){
        this.emprestimo = emprestimo;
    }
    
    public abstract float calcularValorFita();
    
    public String imprimeConsultaEmprestimos(){
        return "Nome da fita: " + this.getNomeFita() + " Preço do emprestimo: " + this.calcularValorFita(); 
    }
}
