import java.util.ArrayList;

public class Cliente
{
    private int codigo;
    private String nome;
    private ArrayList<Vaga> vagas;
    
    public Cliente(){
        vagas = new ArrayList<Vaga>();
    }
    
    public Cliente(int codigo, String nome){
        this.setCodigo(codigo);
        this.setNome(nome);
        vagas = new ArrayList<Vaga>();
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
    
    public void adicionarVaga(Vaga vaga){
        this.vagas.add(vaga);
    }
    
    public void consultaVagaCliente(){
        for(int i = 0; i < vagas.size(); i++){
            System.out.println("Cliente: " + this.getNome() + this.vagas.get(i).dadosVaga());
        }
    }
    
    public void consultaValorVaga(){
        for(int i = 0; i < vagas.size(); i++){
            System.out.println("Cliente: " + this.getNome() + " Valor: " + this.vagas.get(i).calcularValTot());
        }
    }
}
