import java.util.ArrayList;

public class Cliente
{
    private int codigo;
    private String nome;
    private ArrayList<Emprestimo> emprestimos;
    
    public Cliente(){
        emprestimos = new ArrayList<Emprestimo>();
    }
    
    public Cliente(int codigo, String nome){
        this.setCodigo(codigo);
        this.setNome(nome);
        emprestimos = new ArrayList<Emprestimo>();
    }
    
    public int getCodigo(){
        return this.codigo;
    }
    
    public void setCodigo(int codigo){
        this.codigo = codigo;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public void adicionarEmprestimo(Emprestimo emprestimo){
        this.emprestimos.add(emprestimo);
    }
    
    public void consultaEmprestimoCliente(){
        for(int i = 0; i < emprestimos.size(); i++){
            System.out.println("Cliente : " + this.getNome() + emprestimos.get(i).dadosFita());
        }
    }
    
}
