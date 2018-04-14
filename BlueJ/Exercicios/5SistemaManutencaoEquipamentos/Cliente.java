import java.util.ArrayList;

public class Cliente
{
    private int codigo;
    private String nome;
    private ArrayList<Manutencao> manutencoes;
    
    public Cliente(){
        manutencoes = new ArrayList<Manutencao>();
    }
    
    public Cliente(int codigo, String nome){
        this.setCodigo(codigo);
        this.setNome(nome);
        manutencoes = new ArrayList<Manutencao>();
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
    
    public void adicionarManutencao(Manutencao manutencao){
        this.manutencoes.add(manutencao);
    }
    
    public void consultaManutencoesCliente(){
        for(int i = 0; i < manutencoes.size(); i++){
            System.out.println("Cliente: " + this.getNome() + this.manutencoes.get(i).dadosManutencao());
        }
    }
    
    public void consultaManutencoesPreco(){
        for(int i = 0; i < manutencoes.size(); i++){
            System.out.println(this.manutencoes.get(i).dadosManutencao());
        }
    }
}
