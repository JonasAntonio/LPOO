import java.util.ArrayList;

public class Cliente
{
    private int codigo;
    private String nome;
    private ArrayList<Conta> contas;
    
    public Cliente(){
        contas = new ArrayList<Conta>();
    }
    
    public Cliente(int codigo, String nome){
        this.setCodigo(codigo);
        this.setNome(nome);
        contas = new ArrayList<Conta>();
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
    
    public void addConta(Conta conta){
        this.contas.add(conta);
    }
    
    public void consultaContas(){
        for(int i = 0; i < contas.size(); i++){
            System.out.println("Cliente: " + this.getNome() + contas.get(i).dadosConta());
        }
    }
    
}
