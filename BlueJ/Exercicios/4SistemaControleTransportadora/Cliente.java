import java.util.ArrayList;

public class Cliente
{
    private int codigo;
    private String nome;
    private ArrayList<Frete> fretes;
    
    public Cliente(){
        fretes = new ArrayList<Frete>();
    }
    
    public Cliente(int codigo, String nome){
        this.setCodigo(codigo);
        this.setNome(nome);
        fretes = new ArrayList<Frete>();
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
    
    public void adicionarFrete(Frete frete){
        this.fretes.add(frete);
    }
    
    public void consultaFretesCliente(){
        for(int i = 0; i < fretes.size(); i++){
            System.out.println(" Cliente: " + this.getNome() + this.fretes.get(i).dadosFrete());
        }
    }
    
    public void consultaFretesPreco(){
        for(int i = 0; i < fretes.size(); i++){
            System.out.println(this.fretes.get(i).dadosFrete());
        }
    }
}
